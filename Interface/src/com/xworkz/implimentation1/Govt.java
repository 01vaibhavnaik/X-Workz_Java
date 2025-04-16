package com.xworkz.implimentation1;

import com.xworkz.Internal.GovtRule;
import com.xworkz.Internal.ParlimentRule;

public class Govt implements GovtRule, ParlimentRule {
    @Override
    public void noCorruption() {
        System.out.println("No corruption");
    }

    @Override
    public void noTerrorism() {
        System.out.println(" noTerrorism");
    }

    @Override
    public void noCrime() {
        System.out.println("No crime");
    }

    @Override
    public void timeToOpenParliment() {
        System.out.println("Time to open parliment");
    }

    @Override
    public void timeToCloseParliment() {
        System.out.println("Time to close parliment");
    }

    @Override
    public void timeToDiscussBills() {
        System.out.println("Time to discuss bills");
    }
}
