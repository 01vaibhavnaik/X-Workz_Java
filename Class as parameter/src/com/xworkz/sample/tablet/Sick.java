package com.xworkz.sample.tablet;

public class Sick {
    public void  run(Dolo dolo){
        System.out.println("Running run in Sick");
        if(dolo!=null){
            dolo.tablet();
        }else {
            System.out.println("Pointing to null");
        }
    }
}
