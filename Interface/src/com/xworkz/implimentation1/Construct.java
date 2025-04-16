package com.xworkz.implimentation1;

import com.xworkz.Internal.HomeRule;
import com.xworkz.Internal.HostelRule;

public class Construct implements HomeRule, HostelRule {
    @Override
    public void timeToSleep() {
        System.out.println("Time to sleep");
    }

    @Override
    public void timeToWakeUp() {
        System.out.println("Time to wake up");
    }

    @Override
    public void cleanHouse() {
        System.out.println("Clean house");
    }

    @Override
    public void timeToGoOut() {
        System.out.println("Time to go out");
    }

    @Override
    public void timeToReturn() {
        System.out.println("Time to return");
    }

    @Override
    public void timeToDoLaundry() {
        System.out.println("Time to do laundry");
    }
}
