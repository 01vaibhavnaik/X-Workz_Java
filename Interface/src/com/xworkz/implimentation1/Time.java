package com.xworkz.implimentation1;

import com.xworkz.Internal.ClockRule;
import com.xworkz.Internal.CompanyRule;

public class Time implements ClockRule, CompanyRule {
    @Override
    public void setAlarm() {
        System.out.println("Alarm set");
    }

    @Override
    public void snoozeAlarm() {
        System.out.println("Alarm snoozed");
    }

    @Override
    public void resetAlarm() {
        System.out.println("Alarm reset");
    }

    @Override
    public void timeToWork() {
        System.out.println("Time to work");
    }

    @Override
    public void timeToTakeBreak() {
        System.out.println("Time to take a break");
    }

    @Override
    public void timeToLeaveOffice() {
        System.out.println("Time to leave office");
    }
}
