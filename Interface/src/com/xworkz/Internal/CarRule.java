package com.xworkz.Internal;

public interface CarRule {
    void noSpeeding();

    void noDrunkDriving();

    void wearSeatBelt();

    default void carMaintenance() {
        System.out.println("Regular car maintenance is required.");
    }
}
