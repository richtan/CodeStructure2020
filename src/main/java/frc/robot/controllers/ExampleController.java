package frc.robot.controllers;

import edu.wpi.first.wpilibj.*;

import frc.robot.util.Context;
import frc.robot.controllers.drive.*;
import frc.robot.execution.ParallelScheduler;
import frc.robot.execution.SequentialScheduler;
import frc.robot.actions.Action;
import frc.robot.controllers.auto.*;

public class ExampleController {

    public ExampleController() {
        
    }

    public void loop() {

    }

    public void selfDestruct(){
        System.out.println("BOOOOM");
    }
}
