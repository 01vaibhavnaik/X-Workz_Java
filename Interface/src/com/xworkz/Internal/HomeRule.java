package com.xworkz.Internal;

public interface HomeRule {
    void timeToSleep();
    void timeToWakeUp();
    void cleanHouse();

    default void doNotDisturb() {
        System.out.println("Do not disturb");
    }
}
