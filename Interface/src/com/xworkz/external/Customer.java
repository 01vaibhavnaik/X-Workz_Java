package com.xworkz.external;

import com.xworkz.Internal.BakeryRule;

public class Customer implements BakeryRule {

    @Override
    public void washHand() {
        System.out.println("Applying Hand Wash");
    }

    @Override
    public void keepClean() {
        System.out.println("Applying Keep Clean");
    }

    @Override
    public void payBefore() {
        System.out.println("Applying Pay Before");
    }

    @Override
    public void wearMask() {
        System.out.println("Wearing a mask is mandatory in the bakery.");
    }


}
