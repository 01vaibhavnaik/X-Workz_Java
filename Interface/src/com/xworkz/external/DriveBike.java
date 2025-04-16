package com.xworkz.external;

import com.xworkz.Internal.BikeRule;

public class DriveBike implements BikeRule {
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
