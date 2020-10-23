package frc.robot.subsystems;
import com.revrobotics.*;
import frc.robot.util.PIDF;

public class Climber {
    //Climber has 4 NEOs. IDs 1,2 are for the telescope. IDs 3,4 are for the climbing spool.

    //motors
    CANSparkMax telescopeNEO1 = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax telescopeNEO2 = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax spoolNEO1 = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax spoolNEO2 = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);

    //encoders (both spool/telescope motors should be at the same position so we only need one)
    CANEncoder tele1Encoder = telescopeNEO1.getEncoder();
    CANEncoder spool1Encoder = spoolNEO1.getEncoder();

    //motors move the same, so these will just follow. Only need to use spoolNEO1 or telescopeNEO1
    telescopeNEO2.follow(telescopeNEO1);
    spoolNEO2.follow(spoolNEO1);

    //vars for PIDF
    long currentTime;
    long previousTime = 0;
    double timeFrame;
    double telescopeNextInput;
    double spoolNextInput;
    double telescopeGoalPosition;
    double spoolGoalPosition;

    //TODO: Set PIDF factors
    PIDF telePIDF = new PIDF(1, 0, 0);
    PIDF spoolPIDF = new PIDF(1, 0, 0);


    public void loop() {
        currentTime = System.currentTimeMillis();
        timeFrame = (currentTime - previousTime)/1000.0; //1000 to convert to seconds, also casts as double (I think)
        previousTime = currentTime;
        telescopeNextInput = telePIDF.update(telescopeGoalPosition, getTelescopeHeight(), timeFrame);
        spoolNextInput = spoolPIDF.update(spoolGoalPosition, getSpoolPosition(), timeFrame);
        telescopeNEO1.set(telescopeNextInput);
        spoolNEO1.set(spoolNextInput);
    }


    /**
    * Uses moveTelescopePIDF to move the telescope to the upper position: 1000.
    */
    public void raiseTelescope() {
        moveTelescopePIDF(1000.0);
    }

    /**
    * Uses moveTelescopePIDF to move the telescope to the lower position: 0.
    */
    public void lowerTelescope() {
        moveTelescopePIDF(0.0);
    }

    /**
    * Uses PIDF to move the telescope to a given position.
    */
    public void moveTelescopePIDF(double goalPosition) {
        telescopeGoalPosition = goalPosition;
    }

    /**
    * Sets the powers on the two telescope motors.
    */
    public void setTelescopePower(double speed) {
        telescopeNEO1.set(speed);
    }

    /**
    * Returns the height of the telescope in motor rotations.
    */
    public double getTelescopeHeight() {
        return tele1Encoder.getPosition();
    }

    /**
    * Uses moveSpoolPIDF to retract the spool to the fully retracted position: 1000.
    */
    public void spoolIn() {
        moveSpoolPIDF(1000.0);
    }

    /**
    * Uses PIDF to move the telescope to a given position.
    */
    public void moveSpoolPIDF(double goalPosition) {
        spoolGoalPosition = goalPosition;
    }

    /**
    * Returns the position of the spool in motor rotations.
    */
    public double getSpoolPosition() {
        return spool1Encoder.getPosition();
    }
}
