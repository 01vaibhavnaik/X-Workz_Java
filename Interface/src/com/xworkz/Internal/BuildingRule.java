package com.xworkz.Internal;

public interface BuildingRule {
    void timeToStartBuilding();

    void timeToStopBuilding();

    void timeToCheckBuilding();

    default void noFakeBuilding() {
        System.out.println("No Fake Building");
    }


}
