package com.xworkz.external;

import com.xworkz.Internal.BottelRule;

public class Bottel implements BottelRule {

    @Override
    public void timeToEmptyBottel() {
        System.out.println("Time to empty the bottle");
    }

    @Override
    public void timeToCleanBottel() {
        System.out.println("Time to clean the bottle");
    }

    @Override
    public void timeToCheckBottel() {
        System.out.println("Time to check the bottle");
    }

    @Override
    public void noFakeBottel() {
        System.out.println("No fake bottle");
    }
}
