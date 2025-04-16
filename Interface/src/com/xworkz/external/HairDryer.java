package com.xworkz.external;

import com.xworkz.Internal.HairDryerRule;

public class HairDryer implements HairDryerRule {

    @Override
    public void timeToDryHair() {
        System.out.println("Time to dry hair is 10 minutes");
    }

    @Override
    public void timeToSwitchOn() {
        System.out.println("Time to switch on hair dryer is 5 minutes");
    }

    @Override
    public void timeToSwitchOff() {
        System.out.println("Time to switch off hair dryer is 5 minutes");
    }
}
