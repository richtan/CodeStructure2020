package frc.robot.actions;

import frc.robot.subsystems.Drivebase;

public class DriveForwardPIDF extends Action {
    // Temporary, will be replaced with a reference
    Drivebase drivebase = new Drivebase();

    public double distance;
    public double speed;

    public DriveForwardPIDF(double distance, double speed) {
        this.distance = distance;
        this.speed = speed;
    }

    // TODO: Control the drivebase using a PIDF in order to 
    // TODO: make the robot drive forward a given distance at a given speed

    @Override
    public void start() {
        // TODO Auto-generated method stub
    }

    @Override
    public void loop() {
        // TODO Auto-generated method stub
    }

    @Override
    public ActionState getState() {
        // TODO Auto-generated method stub
        return null;
    }
}
