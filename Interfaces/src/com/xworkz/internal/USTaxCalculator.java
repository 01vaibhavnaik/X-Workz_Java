package com.xworkz.internal;

public class USTaxCalculator implements TaxCalculator {

    @Override
    public void calculateTax() {
        System.out.println("Calculating tax in US");
    }
}
