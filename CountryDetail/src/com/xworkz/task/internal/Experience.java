package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Experience {
    private String companyName;
    private String jobTitle;
    private int yearsOfExperience;
    private String location;
    private Education education;
}
