package com.xworkz.implimentation1;

import com.xworkz.Internal.CodingRule;
import com.xworkz.Internal.ProgramRule;

public class Programs implements ProgramRule, CodingRule {
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
    public void noDisrespect() {
        System.out.println("No disrespect");
    }

    @Override
    public void noDisruption() {
        System.out.println("No disruption");
    }

    @Override
    public void noInappropriateContent() {
        System.out.println("No inappropriate content");
    }
}
