package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Government {
    private String typeOfGovernment;
    private String countryName;
    private int numberOfMinistries;
    private String headOfState;
    private PrimeMinister primeMinister;

}
