package com.xworkz.task2.internal;

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
