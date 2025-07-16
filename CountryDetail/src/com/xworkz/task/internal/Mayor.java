package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Mayor {
    private String name;
    private String city;
    private int yearsInOffice;
    private String contactNumber;
    private Vehicle vehicle;

}
