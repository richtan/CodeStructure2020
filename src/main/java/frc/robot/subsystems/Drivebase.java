package frc.robot.subsystems;

public class Drivebase {
    // Drivebase has 4 Falcon500s. IDs are 1,2,3,4

    /**
    * Directly controls the drivebase motors.
    */
    public void tankDrive(double leftPower, double rightPower) {
        return;
    }
    
    /**
    * Uses PID to make the motors maintian constant velocity.
    */
    public void tankDrivePIDF(double leftGoalPower, double rightGoalPower) {
        return;
    }
    
    /**
    * Controls the robot drivebase from the forward power and turn power.
    */
    public void arcadeDrive(double forwardPower, double turnPower) {
        return;
    }
    
    /**
    * Controls the robot drivebase from the forward power and turn power.
    * It uses PID to maintain constant velocity on the left and right sides
    * of the drivebase.
    */
    public void arcadeDrivePIDF(double forwardGoalPower, double turnGoalPower) {
        return;
    }
    
    /**
    * Returns the distance that the encoders on the left side of the robot have
    * measured in encoder ticks.
    */
    public double getLeftTicks() {
        return 0.0;
    }
    
    /**
    * Returns the distance that the encoders on the right side of the robot have
    * measured in encoder ticks.
    */
    public double getRightTicks() {
        return 0.0;
    }
    
    /**
    * Returns the distance that the encoders on the left side of the robot have
    * measured in meters.
    */
    public double getLeftDist() {
        return 0.0;
    }
    
    /**
    * Returns the distance that the encoders on the right side of the robot have
    * measured in meters.
    */
    public double getRightDist() {
        return 0.0;
    }
}
