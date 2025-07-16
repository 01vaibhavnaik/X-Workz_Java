package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Company {
    private String companyName;
    private String compantAddress;
    private String companyOwnerName;
    private int establishedYear;
    private Owner[] owner;
}
