package com.xworkz.external;

import com.xworkz.Internal.JavaRule;

public class Java implements JavaRule {

    @Override
    public void timeToCompileJava() {
        System.out.println("Compiling Java code...");
    }

    @Override
    public void timeToRunJava() {
        System.out.println("Running Java code...");
    }

    @Override
    public void timeToDebugJava() {
        System.out.println("Debugging Java code...");
    }
}
