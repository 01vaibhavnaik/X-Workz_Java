package com.xworkz.task.internal;

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
