package com.xworkz.external;

import com.xworkz.Internal.ClockRule;

public class Alarm implements ClockRule {

    @Override
    public void setAlarm() {
        System.out.println("Alarm is set.");
    }

    @Override
    public void snoozeAlarm() {
        System.out.println("Alarm snoozed.");
    }

    @Override
    public void resetAlarm() {
        System.out.println("Alarm reset.");
    }
}
