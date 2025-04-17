package com.xworkz.Internal;

public interface EmployeeRule {


    void timeToAttendMeeting();

    void timeToSubmitReport();

    void timeToCompleteTask();

    default void noFakeEmployee() {
        System.out.println("No Fake Employee");
    }
}
