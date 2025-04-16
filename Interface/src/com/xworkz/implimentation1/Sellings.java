package com.xworkz.implimentation1;

import com.xworkz.Internal.MallRule;
import com.xworkz.Internal.MartRule;

public class Sellings implements MartRule, MallRule {
    @Override
    public void timeToStartMall() {
        System.out.println("Time to start mall");
    }

    @Override
    public void timeToStopMall() {
        System.out.println("Time to stop mall");
    }

    @Override
    public void timeToCheckMall() {
        System.out.println("Time to check mall");
    }

    @Override
    public void timeToStartMart() {
        System.out.println("Time to start mart");
    }

    @Override
    public void timeToStopMart() {
        System.out.println("Time to stop mart");
    }

    @Override
    public void timeToCheckMart() {
        System.out.println("Time to check mart");
    }
}
