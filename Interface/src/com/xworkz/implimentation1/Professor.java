package com.xworkz.implimentation1;

import com.xworkz.Internal.TeacherRule;
import com.xworkz.Internal.TrainerRule;

public class Professor implements TrainerRule, TeacherRule {

    @Override
    public void timeToTeach() {
        System.out.println("Time to teach");
    }

    @Override
    public void timeToTrain() {
        System.out.println("Time to train");
    }

    @Override
    public void timeToEat() {
        System.out.println("Time to eat");
    }

    @Override
    public void timeToSleep() {
        System.out.println("Time to sleep");
    }
}
