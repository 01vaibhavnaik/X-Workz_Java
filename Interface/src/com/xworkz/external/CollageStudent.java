package com.xworkz.external;

import com.xworkz.Internal.CollageRule;

public class CollageStudent implements CollageRule {

    @Override
    public void noRagging() {
        System.out.println("No ragging in the college");
    }

    @Override
    public void noSmoking() {
        System.out.println("No smoking in the college");
    }

    @Override
    public void noDrugs() {
        System.out.println("No drugs in the college");
    }

    @Override
    public void staySilent() {
        System.out.println("Stay silent in the college");
    }
}
