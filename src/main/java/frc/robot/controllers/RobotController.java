package frc.robot.controllers;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SPI;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.cscore.UsbCamera;

import edu.wpi.first.wpilibj.*;

import frc.robot.util.Context;
import frc.robot.controllers.drive.*;
import frc.robot.execution.ParallelScheduler;
import frc.robot.execution.SequentialScheduler;
import frc.robot.actions.Action;
import frc.robot.controllers.auto.*;

public class RobotController {
    public TalonFXDrivetrain drivetrain;
    public AutoDrive autoDrive;
    public NavX navX;
    public NetworktablesInterface ntInterface;
    public DriverJoystick driverJoystick;
    public OperatorJoystick operatorJoystick;
    public ExampleController exampleController;
    // public VisionAllignment visionAllignment;

    public SequentialScheduler sequentialScheduler;
    public ParallelScheduler parallelScheduler;

    public TalonFX leftDriveMotor1;
    public TalonFX leftDriveMotor2;
    public TalonFX rightDriveMotor1;
    public TalonFX rightDriveMotor2;

    public TalonSRX leftDriveEncoderInterface;
    public TalonSRX rightDriveEncoderInterface;

    public DriverStation driverStation;

    public RobotController () {
        //----- Motors -----
        leftDriveMotor1 = new TalonFX(Context.leftMotor1ID);
        leftDriveMotor2 = new TalonFX(Context.leftMotor2ID);
        rightDriveMotor1 = new TalonFX(Context.rightMotor1ID);
        rightDriveMotor2 = new TalonFX(Context.rightMotor2ID);
        leftDriveEncoderInterface = new TalonSRX(Context.leftEncoderInterfaceID);
        rightDriveEncoderInterface = new TalonSRX(Context.rightEncoderInterfaceID);
        
        //----- Pneumatics -----
        //----- Controllers -----
        /* Change this line when using a different drive train. Don't forget to change the motor ids in context */
        drivetrain = new TalonFXDrivetrain(leftDriveMotor1, leftDriveMotor2, rightDriveMotor1, rightDriveMotor2, leftDriveEncoderInterface, rightDriveEncoderInterface);
        autoDrive = new AutoDrive();
        navX = new NavX(new AHRS(SPI.Port.kMXP));
        ntInterface = new NetworktablesInterface();
        driverJoystick = new DriverJoystick();
        operatorJoystick = new OperatorJoystick();
        sequentialScheduler = new SequentialScheduler();
        parallelScheduler = new ParallelScheduler();
        exampleController = new ExampleController();
        driverStation = DriverStation.getInstance();

        Context.robotController = this;
    }

    public void initAll() {
    }

    public void loopAll() {
        ntInterface.loop();
        driverJoystick.loop();
        operatorJoystick.loop();
        sequentialScheduler.loop();
        parallelScheduler.loop();
    }
}
