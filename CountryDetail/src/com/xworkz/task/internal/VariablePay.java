package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class VariablePay {
    private int employeeId;
    private String employeeName;
    private double basicPay;
    private double variablePay;
    private Tax tax;

}
