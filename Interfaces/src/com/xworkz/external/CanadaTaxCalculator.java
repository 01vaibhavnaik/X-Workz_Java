package com.xworkz.external;

import com.xworkz.internal.TaxCalculator;

public class CanadaTaxCalculator {
    private TaxCalculator taxCalculator;

    public CanadaTaxCalculator(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }
    public void calculateTax() {
        if (taxCalculator != null) {
            taxCalculator.calculateTax();
        } else {
            System.err.println("Null");
        }
    }
}
