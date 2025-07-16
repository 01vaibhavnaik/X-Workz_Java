package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class City {
    private String name;
    private String state;
    private int population;
    private String areaCode;
    private Information information;
}
