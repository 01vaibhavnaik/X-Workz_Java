package com.xworkz.external;

import com.xworkz.Internal.LaptopRule;

public class Laptop implements LaptopRule {

    @Override
    public void noVirus() {
        System.out.println("No Virus");
    }

    @Override
    public void noOverheating() {
        System.out.println("No Overheating");
    }

    @Override
    public void noDataLoss() {
        System.out.println("No Data Loss");
    }
}
