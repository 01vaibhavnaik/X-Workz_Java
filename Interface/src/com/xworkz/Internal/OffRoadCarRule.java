package com.xworkz.Internal;

public interface OffRoadCarRule {


    void timeToRefuel();

    void timeToWash();

    void timeToService();

    default void noFakeCar() {
        System.out.println("No Fake Car");
    }
}
