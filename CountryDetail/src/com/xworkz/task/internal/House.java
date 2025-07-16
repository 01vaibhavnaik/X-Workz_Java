package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class House {
    private String houseNumber;
    private String streetName;
    private String cityName;
    private String stateName;
    private Details details;

}
