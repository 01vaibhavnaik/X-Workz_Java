package com.xworkz.external;

import com.xworkz.Internal.ElectricityRule;

public class Electric implements ElectricityRule {

    @Override
    public void timeToOpenElectricity() {
        System.out.println("Time to open electricity is 6 AM");
    }

    @Override
    public void timeToCloseElectricity() {
        System.out.println("Time to close electricity is 10 PM");
    }

    @Override
    public void timeToUseElectricity() {
        System.out.println("Time to use electricity is 8 AM to 10 PM");
    }

    @Override
    public void noFakeElectricity() {
        System.out.println("No fake electricity");
    }
}
