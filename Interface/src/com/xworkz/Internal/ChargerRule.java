package com.xworkz.Internal;

public interface ChargerRule {
    void noOvercharging();
    void noShortCircuit();
    void noFakeCharger();

    default void chargerSafety() {
        System.out.println("Ensure charger safety.");}

}
