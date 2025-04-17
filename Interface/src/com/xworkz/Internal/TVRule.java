package com.xworkz.Internal;

public interface TVRule {
    void timeToWatchTV();

    void timeToChangeChannel();

    void timeToSwitchOffTV();

    default void noFakeTV() {
        System.out.println("No Fake TV");
    }


}
