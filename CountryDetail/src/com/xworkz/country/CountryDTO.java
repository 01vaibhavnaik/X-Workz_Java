package com.xworkz.country;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class CountryDTO {
    private String countryName;
    private int pinCode;
    private int populationInMillions;
    private int noOfStates;
    private int massInSqrMtrs;
    private String primeMinister;
    private String primaryLang;
    private String secondaryLang;
    private String gdp;
}
