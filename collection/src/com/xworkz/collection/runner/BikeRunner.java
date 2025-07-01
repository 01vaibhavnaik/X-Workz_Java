package com.xworkz.collection.runner;

import com.xworkz.collection.external.Bike;

import java.util.ArrayList;
import java.util.Collection;

public class BikeRunner implements Bike {


    public static void main(String[] args) {

        Collection<String> bikeNames = new ArrayList<>();


        bikeNames.add("KTM");
        bikeNames.add("R15");
        bikeNames.add("mt15");
        bikeNames.add("H2R");
        bikeNames.add("Harley");
        bikeNames.add("Hyabusa");
        bikeNames.add("Royal Enfield");
        bikeNames.add("Hymalayan");
        bikeNames.add("FZ");
        bikeNames.add("Dominar");

        System.out.println("Number Of Bikes: "+bikeNames.size());
        bikeNames.clear();
        System.out.println("Number Of Bikes After Clear: "+ bikeNames.size());
        System.out.println("After clear Adding New Bikes...");

        bikeNames.add("Dominar");
        bikeNames.add("Kawasaki");
        bikeNames.add("Harley Davidson");
        bikeNames.add("BMW");
        bikeNames.add("Aprilia");
        bikeNames.add("Ducati");
        bikeNames.add("Triumph");
        bikeNames.add("GT-650");
        bikeNames.add("Kawasaki Ninja");
        bikeNames.add("Himalayan");

        System.out.println("Number Of Bikes After Adding New Bikes: " + bikeNames.size());




    }

    @Override
    public String bikeName() {
        return "";
    }
}
