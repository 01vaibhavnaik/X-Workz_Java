package com.xworkz.Internal;

public interface TrainerRule {
    void timeToTrain();
    void timeToEat();
    void timeToSleep();

    default void noFakeTrainer() {
        System.out.println("No Fake Trainer");
    }
}
