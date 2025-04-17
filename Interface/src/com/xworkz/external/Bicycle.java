package com.xworkz.external;

import com.xworkz.Internal.BicycleRule;

public class Bicycle implements BicycleRule {

    @Override
    public void timeToStopBicycle() {
        System.out.println("Stopping the bicycle...");
    }

    @Override
    public void timeToParkBicycle() {
        System.out.println("Parking the bicycle...");
    }

    @Override
    public void timeToCheckBicycle() {
        System.out.println("Checking the bicycle...");
    }
    @Override
    public void noFakeBicycle() {
        System.out.println("No fake bicycle");
    }
}
