package com.xworkz.external;

import com.xworkz.Internal.EmployeeRule;

public class Emloyee implements EmployeeRule {

    @Override
    public void timeToAttendMeeting() {
        System.out.println("Time to attend meeting");
    }

    @Override
    public void timeToSubmitReport() {
        System.out.println("Time to submit report");
    }

    @Override
    public void timeToCompleteTask() {
        System.out.println("Time to complete task");
    }
}
