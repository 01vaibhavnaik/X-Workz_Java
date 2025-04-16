package com.xworkz.sample.pillow;

public class Soft {
    public void run(Pillow pillow){
        System.out.println("Running run in pillow");
        if(pillow!=null){
            pillow.soft();
        }else {
            System.out.println("Pointing to null");
        }
    }
}
