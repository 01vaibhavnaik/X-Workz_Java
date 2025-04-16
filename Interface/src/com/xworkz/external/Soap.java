package com.xworkz.external;

import com.xworkz.Internal.SoapRule;

public class Soap implements SoapRule {

    @Override
    public void timeToUseSoap() {
        System.out.println("Time to use soap.");
    }

    @Override
    public void timeToWashHands() {
        System.out.println("Time to wash hands.");
    }

    @Override
    public void timeToTakeBath() {
        System.out.println("Time to take bath.");
    }
}
