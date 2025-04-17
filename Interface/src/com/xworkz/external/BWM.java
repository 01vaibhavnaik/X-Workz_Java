package com.xworkz.external;

import com.xworkz.Internal.SportCarRule;

public class BWM implements SportCarRule {

    @Override
    public void noRacing() {
        System.out.println("No racing in BWM");
    }

    @Override
    public void noStreetRacing() {
        System.out.println("No street racing in BWM");
    }

    @Override
    public void noIllegalModifications() {
        System.out.println("No illegal modifications in BWM");
    }
    @Override
    public void carMaintenance() {
        System.out.println("Regular car maintenance is required for BWM.");
    }
}
