package com.xworkz.task2.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class HeadOfDepartment {
    private String nameOfHead;
    private String phNumber;
    private List<Staff> staff;
}
