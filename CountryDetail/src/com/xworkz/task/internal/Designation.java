package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Designation {
    private String designationName;
    private String department;
    private String jobDescription;
    private double salaryRange;
    private Role role;
}
