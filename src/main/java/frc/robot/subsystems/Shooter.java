package frc.robot.subsystems;

public class Shooter {
    // Two TalonFX motor controllers
    public TalonFX shooterMotor1;
    public TalonFX shooterMotor2;
    
    public Shooter(RobotManager manager, TalonFX _shooterMotor1, TalonFX _shooterMotor2) {
        super(manager);
        shooterMotor1 = _shooterMotor1;
        shooterMotor2 = _shooterMotor2;
    }

    /**
    * Spin shooter using PIDF to a specified speed
    */
    public void spinShooterPIDF(double speedGoal) {
        return;
    }

    /**
    * Spin the shooter motors at percent output power. the PIDF method can call this.
    */
    public void spinShooter(double power) {
        return;
    }
    
    /**
    * Runs many times every second. This is where you call the other methods to update your PID, run your motors, get encoder values, etc.
    */
    public void loop(){
    
    }
}
