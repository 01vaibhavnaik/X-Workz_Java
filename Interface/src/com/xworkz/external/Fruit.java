package com.xworkz.external;

import com.xworkz.Internal.FruitRule;

public class Fruit implements FruitRule {

    @Override
    public void timeToCut() {
        System.out.println("Time to cut the fruit");
    }

    @Override
    public void timeToPeel() {
        System.out.println("Time to peel the fruit");
    }

    @Override
    public void timeToSlice() {
        System.out.println("Time to slice the fruit");
    }
}
