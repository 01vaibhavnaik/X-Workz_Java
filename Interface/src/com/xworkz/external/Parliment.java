package com.xworkz.external;

import com.xworkz.Internal.ParlimentRule;

public class Parliment implements ParlimentRule {

    @Override
    public void timeToOpenParliment() {
        System.out.println("Parliment opens at 11:00 AM");
    }

    @Override
    public void timeToCloseParliment() {
        System.out.println("Parliment closes at 5:00 PM");
    }

    @Override
    public void timeToDiscussBills() {
        System.out.println("Parliment discusses bills at 3:00 PM");
    }

    @Override
    public void noFakeParliment() {
        System.out.println("No fake parliment");
    }
}
