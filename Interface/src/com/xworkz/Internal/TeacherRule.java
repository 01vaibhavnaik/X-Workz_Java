package com.xworkz.Internal;

public interface TeacherRule {
    void timeToTeach();

    void timeToEat();

    void timeToSleep();

    default void noFakeTeacher() {
        System.out.println("No Fake Teacher");
    }


}
