package com.xworkz.external;

import com.xworkz.Internal.TeacherRule;

public class Teacher implements TeacherRule {

    @Override
    public void timeToTeach() {
        System.out.println("Time to teach.");
    }

    @Override
    public void timeToEat() {
        System.out.println("Time to eat.");
    }

    @Override
    public void timeToSleep() {
        System.out.println("Time to sleep.");
    }

    @Override
    public void noFakeTeacher() {
        System.out.println("No fake teacher.");
    }
}
