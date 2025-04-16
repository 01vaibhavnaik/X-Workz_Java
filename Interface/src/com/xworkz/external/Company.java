package com.xworkz.external;

import com.xworkz.Internal.CompanyRule;

public class Company implements CompanyRule {

    @Override
    public void timeToWork() {
        System.out.println("Time to work.");
    }

    @Override
    public void timeToTakeBreak() {
        System.out.println("Time to take a break.");
    }

    @Override
    public void timeToLeaveOffice() {
        System.out.println("Time to leave the office.");
    }
}
