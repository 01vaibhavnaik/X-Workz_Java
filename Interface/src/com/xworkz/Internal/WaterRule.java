package com.xworkz.Internal;

public interface WaterRule {
    void timeToBoilWater();

    void timeToFillTank();

    void timeToPurifyWater();
    default void noFakeWater() {
        System.out.println("No Fake Water");
    }


}
