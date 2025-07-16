package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Registration {
    private int registrationNumber;
    private String vehicleType;
    private String ownerName;
    private String ownerAddress;
    private RTO rto;
}
