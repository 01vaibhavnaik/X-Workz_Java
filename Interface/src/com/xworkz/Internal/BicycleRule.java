package com.xworkz.Internal;

public interface BicycleRule {


    void timeToStopBicycle();

    void timeToParkBicycle();

    void timeToCheckBicycle();
    default void noFakeBicycle() {
        System.out.println("No Fake Bicycle");
    }
}
