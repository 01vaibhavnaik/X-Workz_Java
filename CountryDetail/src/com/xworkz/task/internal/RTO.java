package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class RTO {
    private int rtoCode ;
    private String location;
    private String officeHead;
    private  String contactNumber;
    private Inspector inspectors;
}
