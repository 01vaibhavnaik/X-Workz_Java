package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Staff {
    private String nameOfStaff;
    private String subject;
    private Detail detail;
}
