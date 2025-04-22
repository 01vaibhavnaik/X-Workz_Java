package com.xworkz.external;

import com.xworkz.internal.Reporter;

public class BugTracker {
    private Reporter reporter;

    public BugTracker(Reporter reporter) {
        this.reporter = reporter;
    }
    public void trackBug() {
        if(reporter != null) {
            reporter.report();
        } else {
            System.out.println("No reporter provided.");
        }
    }
}
