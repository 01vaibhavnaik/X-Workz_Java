package com.xworkz.task2.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Univercity {
    private String nameOfUniversity;
    private int noOfStudents;
    private Chancellor chancellor;
}
