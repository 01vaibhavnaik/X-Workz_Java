package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Bonus {
    private String bonusName;
    private double bonusAmount;
    private  String bonusDate;
    private String bonusType;
    private VariablePay variablePay;

}
