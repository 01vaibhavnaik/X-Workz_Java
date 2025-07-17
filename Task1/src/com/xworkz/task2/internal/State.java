package com.xworkz.task2.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@Getter
@ToString

public class State {
    private String stateName;
    private int noOfDistrict;
    private List<Minister> minister;
}
