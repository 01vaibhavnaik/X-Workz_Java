package com.xworkz.task.internal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class Product {
    private String productName;
    private int productCode;
    private double price;
    private String manufacturer;
    private Company company;

}
