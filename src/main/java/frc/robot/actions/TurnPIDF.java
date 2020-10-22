package frc.robot.actions;

import frc.robot.subsystems.Drivebase;

public class TurnPIDF extends Action {
    // Temporary, will be replaced with a reference
    Drivebase drivebase = new Drivebase();

    public double angle;
    public double speed;

    public TurnPIDF(double angle, double speed) {
        this.angle = angle;
        this.speed = speed;
    }

    // TODO: Control the drivebase using a PIDF in order to 
    // TODO: make the robot turn to a given angle

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
