package com.xworkz.implimentation1;

import com.xworkz.Internal.CarRule;
import com.xworkz.Internal.OffRoadCarRule;

public class Cars implements CarRule, OffRoadCarRule {


    @Override
    public void noSpeeding() {
        System.out.println("Speeding is not allowed");
    }

    @Override
    public void noDrunkDriving() {
        System.out.println("Drunk driving is not allowed");
    }

    @Override
    public void wearSeatBelt() {
        System.out.println("Wearing a seat belt is mandatory");
    }

    @Override
    public void timeToRefuel() {
        System.out.println("Time to refuel");
    }

    @Override
    public void timeToWash() {
        System.out.println("Time to wash");
    }

    @Override
    public void timeToService() {
        System.out.println("Time to service");
    }
}
