package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class HeadOfDepartment {
    private String nameOfHead;
    private int age;
    private List<Staff> staff;
}
