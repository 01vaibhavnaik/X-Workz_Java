package com.xworkz.external;

import com.xworkz.Internal.ChairRule;

public class Chair implements ChairRule {

    @Override
    public void noUnrulyBehavior() {
        System.out.println("No unruly behavior in the chair");
    }

    @Override
    public void noUnauthorizedAccess() {
        System.out.println("No unauthorized access to the chair");
    }

    @Override
    public void noDamageToProperty() {
        System.out.println("No damage to property of the chair");
    }

    @Override
    public void fourLegs() {
        System.out.println("Chair has four legs");
    }
}
