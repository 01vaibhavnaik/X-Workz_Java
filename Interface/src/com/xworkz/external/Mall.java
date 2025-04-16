package com.xworkz.external;

import com.xworkz.Internal.MallRule;

public class Mall implements MallRule {

    @Override
    public void timeToStartMall() {
        System.out.println("Starting the mall...");
    }

    @Override
    public void timeToStopMall() {
        System.out.println("Stopping the mall...");
    }

    @Override
    public void timeToCheckMall() {
        System.out.println("Checking the mall...");
    }
}
