package com.xworkz.external;

import com.xworkz.Internal.TableRule;

public class Table implements TableRule {

    @Override
    public void timeToClearTable() {
        System.out.println("Clearing the table...");
    }

    @Override
    public void timeToCleanTable() {
        System.out.println("Cleaning the table...");
    }

    @Override
    public void timeToDecorateTable() {
        System.out.println("Decorating the table...");
    }
}
