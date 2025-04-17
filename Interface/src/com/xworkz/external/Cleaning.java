package com.xworkz.external;

import com.xworkz.Internal.CleaningRule;

public class Cleaning implements CleaningRule {

    @Override
    public void timeToCleanHouse() {
        System.out.println("Time to clean house is 8:00 AM");
    }

    @Override
    public void timeToCleanCar() {
        System.out.println("Time to clean car is 9:00 AM");
    }

    @Override
    public void timeToCleanBathroom() {
        System.out.println("Time to clean bathroom is 10:00 AM");
    }

    @Override
    public void noFakeCleaning() {
        System.out.println("No fake cleaning");
    }
}
