package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Portfolio {
    private String portfolioType;
    private int noOfportfolio;
    private Department department;

}
