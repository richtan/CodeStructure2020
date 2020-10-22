package frc.robot.subsystems;

public class Climber {
    //Climber has 4 NEOs. IDs 1,2 are for the telescope. IDs 3,4 are for the climbing spool.

    /**
    * Uses moveTelescopePIDF to move the telescope to the upper position: 1000.
    */
    public void raiseTelescope() {
        return;
    }

    /**
    * Uses moveTelescopePIDF to move the telescope to the lower position: 0.
    */
    public void lowerTelescope() {
        return;
    }

    /**
    * Uses PIDF to move the telescope to a given position.
    */
    public void moveTelescopePIDF(double goalPosition) {
        return;
    }

    /**
    * Sets the powers on the two telescope motors.
    */
    public void setTelescopePower() {
        return;
    }

    /**
    * Returns the height of the telescope in encoder ticks.
    */
    public double getTelescopeHeight() {
        return 0.0;
    }

    /**
    * Uses moveSpoolPIDF to retract the spool to the fully retracted position: 1000.
    */
    public void spoolIn() {
        return;
    }

    /**
    * Uses PIDF to move the telescope to a given position.
    */
    public void moveSpoolPIDF(double goalPosition) {
        return;
    }

    /**
    * Returns the position of the spool in encoder ticks.
    */
    public double getSpoolPosition() {
        return 0.0;
    }
}
