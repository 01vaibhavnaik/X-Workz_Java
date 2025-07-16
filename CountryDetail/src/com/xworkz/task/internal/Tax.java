package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Tax {
    private String taxType;
    private double taxRate;
    private int filingYear;
    private String collectionAgency;
    private Government government;
}
