package com.xworkz.sample.rocket;

public class SpeedType {
    public void type(Rocket rocket){
        System.out.println("Running type in Speed type");
        if(rocket!=null) {
            rocket.speed();
        }
        else {
            System.out.println("Pointing to null");
        }
    }


}
