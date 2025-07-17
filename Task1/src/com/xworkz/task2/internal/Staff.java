package com.xworkz.task2.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Staff {
    private String nameOfStaff;
    private String emailId;
    private Detail detail;
}
