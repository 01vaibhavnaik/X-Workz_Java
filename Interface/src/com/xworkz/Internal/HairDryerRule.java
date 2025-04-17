package com.xworkz.Internal;

public interface HairDryerRule {
    void timeToDryHair();

    void timeToSwitchOn();

    void timeToSwitchOff();

    default void noFakeHairDryer() {
        System.out.println("No Fake Hair Dryer");
    }


}
