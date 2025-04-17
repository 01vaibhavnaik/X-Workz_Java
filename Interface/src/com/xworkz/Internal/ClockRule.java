package com.xworkz.Internal;

public interface ClockRule {
    void setAlarm();
    void snoozeAlarm();
    void resetAlarm();
    default void noFakeAlarm() {
        System.out.println("No Fake Alarm");
    }
}
