package com.xworkz.internal;

public class ConsoleLogger implements Logger {

    @Override
    public void logMessage() {
        System.out.println("Logging message to console");
    }

}

