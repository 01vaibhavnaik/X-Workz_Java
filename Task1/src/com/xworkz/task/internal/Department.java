package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Department {
    private String nameOfDepartment;
    private int noOfEmployees;
    private HeadOfDepartment headOfDepartment;

}
