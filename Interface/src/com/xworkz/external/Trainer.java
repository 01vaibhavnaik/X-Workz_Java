package com.xworkz.external;

import com.xworkz.Internal.TrainerRule;

public class Trainer implements TrainerRule {

    @Override
    public void timeToTrain() {
        System.out.println("Time to train.");
    }

    @Override
    public void timeToEat() {
        System.out.println("Time to eat.");
    }

    @Override
    public void timeToSleep() {
        System.out.println("Time to sleep.");
    }
}
