package com.xworkz.implimentation1;

import com.xworkz.Internal.BakeryRule;
import com.xworkz.Internal.SoapRule;

public class Product implements BakeryRule, SoapRule {
    @Override
    public void washHand() {
        System.out.println("Washing hands");
    }

    @Override
    public void keepClean() {
        System.out.println("Keeping clean");
    }

    @Override
    public void payBefore() {
        System.out.println("Pay before");
    }

    @Override
    public void timeToUseSoap() {
        System.out.println("Time to use soap");
    }

    @Override
    public void timeToWashHands() {
        System.out.println("Time to wash hands");
    }

    @Override
    public void timeToTakeBath() {
        System.out.println("Time to take bath");
    }
}
