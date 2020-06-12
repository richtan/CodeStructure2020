package frc.robot.actions;

import frc.robot.util.*;
import frc.robot.controllers.ExampleController;

public class ExampleAction extends Action {

    public void start() {
        super.start();
        System.out.println("Starting Self Destruct");
    }

    public void buttonReleased(){
        System.out.println("Selfing Destructing...");
        Context.robotController.exampleController.selfDestruct();
        markComplete();
    }

    public void loop()
    {
        
    }
}