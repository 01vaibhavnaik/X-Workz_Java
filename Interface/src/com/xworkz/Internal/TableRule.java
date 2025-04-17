package com.xworkz.Internal;

public interface TableRule {


    void timeToClearTable();

    void timeToCleanTable();

    void timeToDecorateTable();
    default void noFakeTable() {
        System.out.println("No Fake Table");
    }

}
