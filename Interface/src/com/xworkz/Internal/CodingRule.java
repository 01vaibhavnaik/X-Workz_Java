package com.xworkz.Internal;

public interface CodingRule {
    void timeToCode();

    void timeToDebug();

    void timeToTest();

    default void noFakeCoding() {
        System.out.println("No Fake Coding");
    }


}
