package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Address {
    private String streetName;
    private String cityName;
    private String stateName;
    private String countryName;
    private City city;
}
