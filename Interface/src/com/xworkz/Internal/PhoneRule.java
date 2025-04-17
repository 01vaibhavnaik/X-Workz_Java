package com.xworkz.Internal;

public interface PhoneRule {
    void timeToCall();

    void timeToText();

    void timeToVideoCall();

    default void noFakePhone() {
        System.out.println("No Fake Phone");
    }


}
