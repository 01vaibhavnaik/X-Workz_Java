package com.xworkz.external;

import com.xworkz.Internal.MartRule;

public class Mart implements MartRule {

    @Override
    public void timeToStartMart() {
        System.out.println("Starting the mart...");
    }

    @Override
    public void timeToStopMart() {
        System.out.println("Stopping the mart...");
    }

    @Override
    public void timeToCheckMart() {
        System.out.println("Checking the mart...");
    }
}
