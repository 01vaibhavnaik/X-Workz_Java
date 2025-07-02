package com.xworkz.forEach.dto;

public class ShoeDTO {
    private String shoeName;
    private String shoeType;
    private String shoeColor;
    private double shoePrice;
    private String shoeBrand;
    private String shoeMaterial;
    private String shoeSize;

    public ShoeDTO(String shoeName, String shoeType, String shoeColor, double shoePrice, String shoeBrand, String shoeMaterial, String shoeSize) {
        this.shoeName = shoeName;
        this.shoeType = shoeType;
        this.shoeColor = shoeColor;
        this.shoePrice = shoePrice;
        this.shoeBrand = shoeBrand;
        this.shoeMaterial = shoeMaterial;
        this.shoeSize = shoeSize;
    }

    public String getShoeName() {
        return shoeName;
    }

    public String getShoeType() {
        return shoeType;
    }

    public String getShoeColor() {
        return shoeColor;
    }

    public double getShoePrice() {
        return shoePrice;
    }

    public String getShoeBrand() {
        return shoeBrand;
    }

    public String getShoeMaterial() {
        return shoeMaterial;
    }

    public String getShoeSize() {
        return shoeSize;
    }
}
