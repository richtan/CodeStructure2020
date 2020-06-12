package frc.robot.shuffleboard;

import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.shuffleboard.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.cscore.UsbCamera;
import frc.robot.controllers.AutoOptions;
import frc.robot.controllers.drive.TalonFXDrivetrain.Gear;
import frc.robot.util.Context;

import java.util.Map;

public class Dashboard {
    private static ShuffleboardTab tab;

    private static final boolean config = true;
    private static ShuffleboardTab configTab;

    public static void init(UsbCamera camera) {
    }

    public static void update() {
    }

    private static void configInit() {
        configTab = Shuffleboard.getTab("Config");
    }

    private static void setChoosers() {

    }
}