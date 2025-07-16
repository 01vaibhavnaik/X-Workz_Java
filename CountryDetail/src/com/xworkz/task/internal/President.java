package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class President {
    private String presidentName;
    private String country;
    private int age;
    private String emailAddress;
    private Designation designation;

}
