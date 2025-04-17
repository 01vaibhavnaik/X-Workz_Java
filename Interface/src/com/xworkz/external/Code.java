package com.xworkz.external;

import com.xworkz.Internal.CodingRule;

public class Code implements CodingRule {

    @Override
    public void timeToCode() {
        System.out.println("Time to code");
    }

    @Override
    public void timeToDebug() {
        System.out.println("Time to debug");
    }

    @Override
    public void timeToTest() {
        System.out.println("Time to test");
    }

    @Override
    public void noFakeCoding() {
        System.out.println("No fake coding");
    }
}
