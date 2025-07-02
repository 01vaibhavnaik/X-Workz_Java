package com.xworkz.forEach.dto;

public class BagDTO {
    private String bagName;
    private String bagType;
    private String bagColor;
    private double bagPrice;
    private String bagBrand;
    private String bagMaterial;
    private String bagSize;

    public BagDTO(String bagName, String bagType, String bagColor, double bagPrice, String bagBrand, String bagMaterial, String bagSize) {
        this.bagName = bagName;
        this.bagType = bagType;
        this.bagColor = bagColor;
        this.bagPrice = bagPrice;
        this.bagBrand = bagBrand;
        this.bagMaterial = bagMaterial;
        this.bagSize = bagSize;
    }

    public String getBagName() {
        return bagName;
    }

    public String getBagType() {
        return bagType;
    }

    public String getBagColor() {
        return bagColor;
    }

    public double getBagPrice() {
        return bagPrice;
    }

    public String getBagBrand() {
        return bagBrand;
    }

    public String getBagMaterial() {
        return bagMaterial;
    }

    public String getBagSize() {
        return bagSize;
    }
}
