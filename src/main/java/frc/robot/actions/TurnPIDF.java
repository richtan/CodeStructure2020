package frc.robot.actions;

import frc.robot.subsystems.Drivebase;

public class TurnPIDF extends Action {
    // Temporary, will be replaced with a reference
    Drivebase drivebase = new Drivebase();

    //Use 0 degrees as forward and 90 degrees as to the right
    //Should range from -180 to 180
    public double angle;
    //Speed will be used to multiply the PIDF output
    public double speed;
    //Radius of the robot's wheel
    private static double wheelRadius;
    //When finding encoder values try to make sure that both wheels are turning at the same speed
    //Encoder value for top left wheel when turned to 90 degrees
    private static double encoderTo90L;
    //Encoder value for top right wheel when turned to 90 degrees
    private static double encoderTo90R;

    private double desiredEncoderL;
    private double desiredEncoderR;
    private double currentEnconderL;
    private double currentEncoderR;
    
    private PIDF leftPIDF;
    private PIDF rightPIDF;

    private long pastTime;
    private double deltaTime;

    public TurnPIDF(double angle, double speed) {
        this.angle = angle;
        this.speed = speed;
        pastTime = System.currentTimeMillis();
    }

    // TODO: Control the drivebase using a PIDF in order to 
    // TODO: make the robot turn to a given angle

    @Override
    public void start() {
        // TODO Auto-generated method stub
        desiredEncoderL = (angle/90) * encoderTo90L;
        desiredEncoderR = (angle/90) * encoderTo90R;
        //leftPIDF = new PIDF(pfactor, ifactor, dfactor, ffactor);
        //rightPIDF = new PIDF(pfactor, ifactor, dfactor, ffactor);
        pastTime = System.currentTimeMillis();
    }

    @Override
    public void loop() {
        // TODO Auto-generated method stub

        //Set both current encoder values

        deltaTime = System.currentTimeMillis() - pastTime;

        //While actual encoder values don't equal around (Margin of error depends on typical encoder values) the desired values
        if (angle >= 0 && angle <= 180) {
            //move left wheels forward and right wheels backwards at the given speed
            
        }
        else if (angle >= -180 && angle <= 0) {
            //move right wheels forward and left wheels backwards at the given speed
        }
        //set left motors to: speed * leftPIDF.update(desiredEncoderL, currentEncoderL, deltaTime);
        //set right motors to: speed * rightPIDF.update(desiredEncoderR, currentEncoderR, deltaTime);
        pastTime = System.currentTimeMillis();

    }

    @Override
    public ActionState getState() {
        // TODO Auto-generated method stub
        return null;
    }
}
