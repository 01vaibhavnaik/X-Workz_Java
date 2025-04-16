package com.xworkz.implimentation1;

import com.xworkz.Internal.ChargerRule;
import com.xworkz.Internal.PhoneRule;

public class Device implements ChargerRule, PhoneRule {
    @Override
    public void noOvercharging() {
        System.out.println("Overcharging is not allowed");
    }

    @Override
    public void noShortCircuit() {
        System.out.println("Short circuit is not allowed");
    }

    @Override
    public void noFakeCharger() {
        System.out.println("Fake charger is not allowed");
    }

    @Override
    public void timeToCall() {
        System.out.println("Time to call");
    }

    @Override
    public void timeToText() {
        System.out.println("Time to text");
    }

    @Override
    public void timeToVideoCall() {
        System.out.println("Time to video call");
    }
}
