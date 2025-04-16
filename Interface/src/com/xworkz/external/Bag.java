package com.xworkz.external;

import com.xworkz.Internal.BagRule;

public class Bag implements BagRule {

    @Override
    public void timeToPackBag() {
        System.out.println("Packing the bag...");
    }

    @Override
    public void timeToUnpackBag() {
        System.out.println("Unpacking the bag...");
    }

    @Override
    public void timeToCarryBag() {
        System.out.println("Carrying the bag...");
    }
}
