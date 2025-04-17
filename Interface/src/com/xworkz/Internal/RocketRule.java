package com.xworkz.Internal;

public interface RocketRule {
    void timeToLaunchRocket();

    void timeToLandRocket();

    void timeToRefuelRocket();

    default void noFakeRocket() {
        System.out.println("No Fake Rocket");
    }
}
