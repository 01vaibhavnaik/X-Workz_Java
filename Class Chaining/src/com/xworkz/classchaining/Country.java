package com.xworkz.classchaining;

public class Country {
    String countryName="India";
    String continentName="Asia";
    int population=114;
    int states =27;

    PrimeMinister pm=new PrimeMinister();

    void display(){
        System.out.println("Country Name:"+countryName);
        System.out.println("Continent Name:"+continentName);
        System.out.println("No Of Population:"+population);
        System.out.println("No Of States:"+states);
        if(pm!=null){
            pm.pmDisplay();
        }else {
            System.out.println("Pointing to null");
        }
    }
}
