package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class University {
    private String universityName;
    private String location;
    private int establishedYear;
    private String accreditation;
    private President president;
}
