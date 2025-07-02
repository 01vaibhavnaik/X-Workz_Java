package com.xworkz.forEach.runner;

import com.xworkz.forEach.dto.WaterFallDTO;

import java.util.ArrayList;
import java.util.Collection;

public class Waterfalls {
    public static void main(String[] args) {
        Collection<WaterFallDTO> waterfalls= new ArrayList<>();
        waterfalls.add(new WaterFallDTO("Mangeli Falls", 500, 2, "Goa", "easy", "Monsoon", 3));
        waterfalls.add(new WaterFallDTO("Chorlagundi Falls", 100, 1, "Goa", "Medium", "Monsoon", 2));
        waterfalls.add(new WaterFallDTO("Dudhsagar Falls", 310, 3, "Goa", "Difficult", "Monsoon", 4));
        waterfalls.add(new WaterFallDTO("Sada Falls", 80, 1, "Goa", "Medium", "Monsoon", 2));
        waterfalls.add(new WaterFallDTO("Vazra sakla Falls", 40, 1, "Goa", "Difficult", "Monsoon", 3));
        waterfalls.add(new WaterFallDTO("Kunchikal Falls", 455, 2, "Shimoga", "Medium", "Monsoon", 4));
        waterfalls.add(new WaterFallDTO("Sivasamudram Falls", 98, 1, "Mandya", "Medium", "Monsoon", 2));
        waterfalls.add(new WaterFallDTO("Bhimlat Falls", 60, 1, "Rajasthan", "Medium", "Monsoon", 1));
        waterfalls.add(new WaterFallDTO("Kempty Falls", 40, 1, "Uttarakhand", "Medium", "Monsoon", 1));
        waterfalls.add(new WaterFallDTO("Chitrakote Falls", 90, 1, "Chhattisgarh", "Medium", "Monsoon", 2));

        for(WaterFallDTO water: waterfalls) {
            System.out.println("Waterfall Name: " + water.getName());
            System.out.println("Price: " + water.getPrice() + " Rs");
            System.out.println("TrekTime: " + water.getTrekTime() + " Hours");
            System.out.println("Location: " + water.getLocation());
            System.out.println("Type: " + water.getType());
            System.out.println("Best Season: " + water.getSeason());
            System.out.println("Trek Distance: " + water.getTrekDistance() + " km");
            System.out.println("-----------------------------");
        }

    }
}
