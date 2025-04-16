package com.xworkz.external;

import com.xworkz.Internal.HomeRule;

public class Home implements HomeRule {

    @Override
    public void timeToSleep() {
        System.out.println("Time to sleep is 10 PM");
    }

    @Override
    public void timeToWakeUp() {
        System.out.println("Time to wake up is 6 AM");
    }

    @Override
    public void cleanHouse() {
        System.out.println("Clean the house every Sunday");
    }

}
