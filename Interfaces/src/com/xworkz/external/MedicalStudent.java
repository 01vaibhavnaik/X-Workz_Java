package com.xworkz.external;

import com.xworkz.internal.CollegeRules;

public class MedicalStudent {
    private CollegeRules collegeRules;

    public MedicalStudent(CollegeRules collegeRules) {
        this.collegeRules = collegeRules;
    }

    public void display() {
        System.out.println("MedicalStudent is running");
        if (collegeRules != null) {
            this.collegeRules.study();
        } else {
            System.err.println("Null");
        }
    }
}
