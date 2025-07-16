package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Owner {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private House[] house;
}
