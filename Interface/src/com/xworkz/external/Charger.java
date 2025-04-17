package com.xworkz.external;

import com.xworkz.Internal.ChargerRule;

public class Charger implements ChargerRule {

    @Override
    public void noOvercharging() {
        System.out.println("No overcharging");
    }

    @Override
    public void noShortCircuit() {
        System.out.println("No short circuit");
    }

    @Override
    public void noFakeCharger() {
        System.out.println("No fake charger");
    }

    @Override
    public void chargerSafety() {
        System.out.println("Ensure charger safety.");
    }
}
