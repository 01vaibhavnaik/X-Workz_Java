package com.xworkz.external;

import com.xworkz.Internal.SchoolRule;

public class Student implements SchoolRule {
    @Override
    public void time() {
        System.out.println("Student should come on time");
    }

    @Override
    public void uniform() {
        System.out.println("Student should wear uniform");
    }

    @Override
    public void completeHomework() {
        System.out.println("Student should complete homework");
    }

    @Override
    public void extraCurricular() {
        System.out.println("Participating in extra-curricular activities is encouraged.");
    }



}
