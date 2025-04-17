package com.xworkz.Internal;

public interface CompanyRule {

    void timeToWork();

    void timeToTakeBreak();

    void timeToLeaveOffice();

    default void noFakeCompany() {
        System.out.println("No Fake Company");
    }


}
