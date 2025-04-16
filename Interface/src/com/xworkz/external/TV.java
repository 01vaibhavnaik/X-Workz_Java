package com.xworkz.external;

import com.xworkz.Internal.TVRule;

public class TV implements TVRule {

    @Override
    public void timeToWatchTV() {
        System.out.println("Time to watch TV is 7 PM");
    }

    @Override
    public void timeToChangeChannel() {
        System.out.println("Time to change channel is 8 PM");
    }

    @Override
    public void timeToSwitchOffTV() {
        System.out.println("Time to switch off TV is 10 PM");
    }
}
