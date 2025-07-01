package com.xworkz.collection.runner;

import com.xworkz.collection.external.Brand;

import java.util.ArrayList;
import java.util.Collection;

public class BrandRunner implements Brand {

    @Override
    public String brandName() {
        return "Xworkz";
    }

    public static void main(String[] args) {
        Collection<String> brands =new ArrayList<>();

        brands.add("Nike");
        brands.add("Rolls Royce");
        brands.add("Puma");
        brands.add("Dior");
        brands.add("Adidas");
        brands.add("Gucci");
        brands.add("Prada");
        brands.add("Chanel");
        brands.add("Louis Vuitton");
        brands.add("Hermes");

        System.out.println("Number Of Brands: " + brands.size());
        brands.clear();
        System.out.println("Number Of Brands After Clear: " + brands.size());
        System.out.println("After clear Adding New Brands...");

        brands.add("Tesla");
        brands.add("Apple");
        brands.add("Samsung");
        brands.add("Microsoft");
        brands.add("Google");
        brands.add("Amazon");
        brands.add("Facebook");
        brands.add("Sony");
        brands.add("LG");
        brands.add("Intel");
        System.out.println("Number Of Brands After Adding New Brands: " + brands.size());

    }
}
