package com.xworkz.implimentation1;

import com.xworkz.Internal.BicycleRule;
import com.xworkz.Internal.BikeRule;

public class Bikes implements BikeRule, BicycleRule {
    @Override
    public void timeToStopBicycle() {
        System.out.println("Time to stop bicycle");
    }

    @Override
    public void timeToParkBicycle() {
        System.out.println("Time to park bicycle");
    }

    @Override
    public void timeToCheckBicycle() {
        System.out.println("Time to check bicycle");
    }

    @Override
    public void noDrinkAndDrive() {
        System.out.println("No drink and drive");
    }

    @Override
    public void noOvertaking() {
        System.out.println("No overtaking");
    }

    @Override
    public void obeyTrafficSignals() {
        System.out.println("Obey traffic signals");
    }
}
