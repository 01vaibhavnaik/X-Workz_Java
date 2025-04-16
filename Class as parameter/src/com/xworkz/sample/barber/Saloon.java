package com.xworkz.sample.barber;

public class Saloon {
    public void run(Barber barber){
        System.out.println("Running run in Saloon");
        if (barber!=null){
            barber.hairCutting();
        }else {
            System.out.println("Pointing to null");
        }
    }
}
