package com.xworkz.external;

import com.xworkz.Internal.WaterRule;

public class Water implements WaterRule {

    @Override
    public void timeToBoilWater() {
        System.out.println("Time to boil water is 10 minutes");
    }

    @Override
    public void timeToFillTank() {
        System.out.println("Time to fill tank is 30 minutes");
    }

    @Override
    public void timeToPurifyWater() {
        System.out.println("Time to purify water is 15 minutes");
    }
    @Override
    public void noFakeWater() {
        System.out.println("No fake water");
    }
}
