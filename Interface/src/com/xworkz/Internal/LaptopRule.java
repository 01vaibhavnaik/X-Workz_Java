package com.xworkz.Internal;

public interface LaptopRule {
    void noVirus();
    void noOverheating();
    void noDataLoss();

    default void noFakeSoftware() {
        System.out.println("No Fake Software");
    }

}
