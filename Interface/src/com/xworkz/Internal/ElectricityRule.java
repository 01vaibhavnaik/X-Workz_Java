package com.xworkz.Internal;

public interface ElectricityRule {
    void timeToOpenElectricity();

    void timeToCloseElectricity();

    void timeToUseElectricity();

    default void noFakeElectricity() {
        System.out.println("No Fake Electricity");
    }

}
