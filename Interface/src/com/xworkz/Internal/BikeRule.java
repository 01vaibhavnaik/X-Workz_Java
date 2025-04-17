package com.xworkz.Internal;

public interface BikeRule {
    void noDrinkAndDrive();
    void noOvertaking();
    void obeyTrafficSignals();

    default void wearHelmet() {
        System.out.println("Always wear a helmet while riding.");
    }

}
