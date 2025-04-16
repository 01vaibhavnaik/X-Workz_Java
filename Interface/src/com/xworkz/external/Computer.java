package com.xworkz.external;

import com.xworkz.Internal.ComputerRule;

public class Computer implements ComputerRule {

    @Override
    public void timeToCompile() {
        System.out.println("Time to compile");
    }

    @Override
    public void timeToRun() {
        System.out.println("Time to run");
    }

    @Override
    public void timeToExecute() {
        System.out.println("Time to execute");
    }
}
