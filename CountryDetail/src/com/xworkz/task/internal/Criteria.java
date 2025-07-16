package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Criteria {
    private String criteriaName;
    private String description;
    private int weightage;
    private String criteriaOwner;
    private SalaryExpectation salaryExpectation;
}
