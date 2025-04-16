package com.xworkz.sample.shop;

public class Shop {
    public void run(Display display){
        System.out.println("Runnig run in shop");
        if(display!=null) {
            display.ads();
        }else {
            System.out.println("Pointing to null");
        }
    }
}
