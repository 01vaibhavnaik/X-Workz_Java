package com.xworkz.task2.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString

public class Country {

    private String countryName;
    private int noOfStates;
    private List<State> state;
}
