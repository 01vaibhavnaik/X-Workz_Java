package com.xworkz.classchaining;

public class City {
    String cityName;
    Ward[] wards;
    City(String cityName,Ward[] wards){
        this.cityName=cityName;
        this.wards=wards;



    }
    void cityDisplay(){
        System.out.println("City name"+this.cityName);
        for(Ward ref:wards){
            if(ref!=null){
                ref.wardDisplay();;
            }else System.err.println("pointing to null");
        }
    }
}
