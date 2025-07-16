package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class SalaryExpectation {
    private String employeeName;
    private String jobTitle;
    private double expectedSalary;
    private int yearsOfExperience;
    private Bonus bonus;
}
