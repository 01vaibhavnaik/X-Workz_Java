package com.xworkz.Internal;

public interface SoapRule {
    void timeToUseSoap();

    void timeToWashHands();

    void timeToTakeBath();

    default void noFakeSoap() {
        System.out.println("No Fake Soap");
    }


}
