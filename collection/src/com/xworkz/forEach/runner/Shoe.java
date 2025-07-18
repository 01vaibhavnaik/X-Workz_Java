package com.xworkz.forEach.runner;

import com.xworkz.forEach.dto.ShoeDTO;

import java.util.ArrayList;
import java.util.Collection;

public class Shoe {
    public static void main(String[] args) {
        Collection<ShoeDTO> shoeNames = new ArrayList<>();
        shoeNames.add(new ShoeDTO("Nike Air Max", "Sneakers", "Black", 12000.00, "Nike", "Mesh", "10"));
        shoeNames.add(new ShoeDTO("Adidas Ultraboost", "Running", "White", 18000.00, "Adidas", "Primeknit", "9"));
        shoeNames.add(new ShoeDTO("Puma RS-X", "Casual", "Blue", 11000.00, "Puma", "Suede", "11"));
        shoeNames.add(new ShoeDTO("Reebok Classic", "Lifestyle", "Red", 10900.00, "Reebok", "Leather", "8"));
        shoeNames.add(new ShoeDTO("New Balance 574", "Heritage", "Gray", 10000.00, "New Balance", "Suede", "10"));
        shoeNames.add(new ShoeDTO("Asics Gel-Kayano", "Running", "Green", 10600.00, "Asics", "Mesh", "9"));
        shoeNames.add(new ShoeDTO("Under Armour HOVR", "Training", "Black", 10300.00, "Under Armour", "Mesh", "10"));
        shoeNames.add(new ShoeDTO("Vans Old Skool", "Skateboarding", "White", 7000.00, "Vans", "Canvas", "8"));
        shoeNames.add(new ShoeDTO("Converse Chuck Taylor", "Casual", "Black", 6000.00, "Converse", "Canvas", "9"));
        shoeNames.add(new ShoeDTO("Hoka One One Bondi", "Running", "Blue", 10500.00, "Hoka One One", "Mesh", "11"));

        for (ShoeDTO shoe : shoeNames) {
            System.out.println("Shoe Name: " + shoe.getShoeName());
            System.out.println("Type: " + shoe.getShoeType());
            System.out.println("Color: " + shoe.getShoeColor());
            System.out.println("Price: " + shoe.getShoePrice()+" Rs");
            System.out.println("Brand: " + shoe.getShoeBrand());
            System.out.println("Material: " + shoe.getShoeMaterial());
            System.out.println("Size: " + shoe.getShoeSize());
            System.out.println("-----------------------------");
        }

    }
}
