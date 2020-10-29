package frc.robot.subsystems;

import frc.robot.RobotManager;
import frc.robot.util.*;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.*;

public class Shooter extends Subsystem {
    private TalonFX leftMotor;
    private TalonFX rightMotor;

    public Shooter(RobotManager manager, int leftMotorId, int rightMotorId) {
        super(manager);
        leftMotor = new TalonFX(leftMotorId); 
        rightMotor = new TalonFX(2); 

        leftMotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor);
        rightMotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor);
    }

    /**
     * Spin shooter at speed
     */
    public void spinShooter(double speed) {
        leftMotor.set(TalonFXControlMode.PercentOutput, speed);
        rightMotor.set(TalonFXControlMode.PercentOutput, speed);
    }

    /**
     * Spin shooter at constant speed with PIDF
     */
    public void spinShooterPIDF(double speed) {
        leftMotor.set(TalonFXControlMode.PercentOutput, speed);
        rightMotor.set(TalonFXControlMode.PercentOutput, speed);
    }

    /**
     * Get shooter speed
     */
    public double getShooterSpeed() {
        int encoderSpeed = leftMotor.getSelectedSensorVelocity();
        double encoderRPM = encoderSpeed/2048 * 10 * 60;
        double wheelTravelSpeed = encoderSpeed * 2 * Math.PI * Constants.SHOOTER_RADIUS / 2048 * 10;
    }
}
