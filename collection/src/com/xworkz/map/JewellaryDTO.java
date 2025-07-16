package com.xworkz.map;

public class JewellaryDTO {
    String color;
    double price;
    String brand;
    String material;
    int warranty;
    String purity;
    String discount;
    String shape;
    int weight;
    int stock;

    public JewellaryDTO(String color, double price, String brand, String material, int warranty, String purity, String discount, String shape, int weight, int stock) {
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.material = material;
        this.warranty = warranty;
        this.purity = purity;
        this.discount = discount;
        this.shape = shape;
        this.weight = weight;
        this.stock = stock;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public int getWarranty() {
        return warranty;
    }

    public String getPurity() {
        return purity;
    }

    public String getDiscount() {
        return discount;
    }

    public String getShape() {
        return shape;
    }

    public int getWeight() {
        return weight;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "JewellaryDTO{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", warranty=" + warranty +
                ", purity='" + purity + '\'' +
                ", discount=" + discount +
                ", shape='" + shape + '\'' +
                ", weight='" + weight + '\'' +
                ", stock=" + stock +
                '}';
    }
}
