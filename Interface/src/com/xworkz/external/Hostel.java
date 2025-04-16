package com.xworkz.external;

import com.xworkz.Internal.HostelRule;

public class Hostel implements HostelRule {

    @Override
    public void timeToGoOut() {
        System.out.println("Time to go out.");
    }

    @Override
    public void timeToReturn() {
        System.out.println("Time to return.");
    }

    @Override
    public void timeToDoLaundry() {
        System.out.println("Time to do laundry.");
    }
}
