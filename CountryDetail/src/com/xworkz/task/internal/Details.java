package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Details {
    private String propertyType ;
    private String ownerName;
    private String phoneNumber;
    private int noOfRooms;
    private Address address;
}
