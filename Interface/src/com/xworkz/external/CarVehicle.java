package com.xworkz.external;

import com.xworkz.Internal.CarRule;

public class CarVehicle implements CarRule {
    @Override
    public void noSpeeding() {
        System.out.println("No speeding in car");
    }

    @Override
    public void noDrunkDriving() {
        System.out.println("No drunk driving in car");
    }

    @Override
    public void wearSeatBelt() {
        System.out.println("Wear seat belt in car");
    }
}
