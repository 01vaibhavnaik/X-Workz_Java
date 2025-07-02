package com.xworkz.forEach.runner;

import com.xworkz.forEach.dto.BagDTO;

import java.util.ArrayList;
import java.util.Collection;

public class Bag {
    public static void main(String[] args) {
        Collection<BagDTO> bagNames = new ArrayList<>();
        bagNames.add(new BagDTO("Backpack", "Casual", "Black", 1500.00, "Wildcraft", "Nylon", "Medium"));
        bagNames.add(new BagDTO("Laptop Bag", "Professional", "Gray", 2500.00, "Targus", "Leather", "Large"));
        bagNames.add(new BagDTO("Travel Bag", "Travel", "Blue", 3500.00, "American Tourister", "Polyester", "Large"));
        bagNames.add(new BagDTO("Gym Bag", "Sports", "Red", 1200.00, "Nike", "Canvas", "Medium"));
        bagNames.add(new BagDTO("Handbag", "Fashion", "Pink", 2000.00, "Fossil", "Leather", "Small"));
        bagNames.add(new BagDTO("Messenger Bag", "Casual", "Brown", 1800.00, "Timbuk2", "Canvas", "Medium"));
        bagNames.add(new BagDTO("Diaper Bag", "Baby Care", "Yellow", 2200.00, "Skip Hop", "Nylon", "Large"));
        bagNames.add(new BagDTO("Camera Bag", "Photography", "Black", 3000.00, "Lowepro", "Polyester", "Medium"));
        bagNames.add(new BagDTO("School Bag", "Education", "Green", 800.00, "Puma", "Polyester", "Large"));
        bagNames.add(new BagDTO("Hiking Bag", "Outdoor", "Orange", 4000.00, "Deuter", "Nylon", "Large"));

        for(BagDTO bag:bagNames){
            System.out.println("Bag Name: " + bag.getBagName());
            System.out.println("Type: " + bag.getBagType());
            System.out.println("Color: " + bag.getBagColor());
            System.out.println("Price: " + bag.getBagPrice() + " Rs");
            System.out.println("Brand: " + bag.getBagBrand());
            System.out.println("Material: " + bag.getBagMaterial());
            System.out.println("Size: " + bag.getBagSize());
            System.out.println("-----------------------------");
        }
    }
}
