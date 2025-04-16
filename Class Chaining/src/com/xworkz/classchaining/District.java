package com.xworkz.classchaining;

public class District {
    String districtName;
    City[] city;

    public District(String dakshninaKannada, City[] cities) {
    }


    void districtDisplay(){
            System.out.println("Name Of District" +districtName);
            for (City ref : city) {
                if (ref != null) {
                    ref.cityDisplay();
                } else {
                    System.out.println("Pointing to null");
                }
            }

        }
    }

