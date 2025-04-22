package com.xworkz.internal;

public class ErrorReporter implements Reporter{

    @Override
    public void report() {
        System.out.println("Reporting error...");
    }

}
