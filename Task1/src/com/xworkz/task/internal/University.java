package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class University {
    private String nameOfUniversity;
    private int noOfStudents;
    private Chancellor chancellor;
}
