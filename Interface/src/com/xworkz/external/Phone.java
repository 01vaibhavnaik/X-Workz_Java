package com.xworkz.external;

import com.xworkz.Internal.PhoneRule;

public class Phone implements PhoneRule {

    @Override
    public void timeToCall() {
        System.out.println("Time to call.");
    }

    @Override
    public void timeToText() {
        System.out.println("Time to text.");
    }

    @Override
    public void timeToVideoCall() {
        System.out.println("Time to video call.");
    }
}
