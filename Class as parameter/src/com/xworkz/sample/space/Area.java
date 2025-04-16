package com.xworkz.sample.space;

public class Area {
    public  void run(Volume volume){
        System.out.println("Running run in Area");
        if(volume!=null){
            volume.volume();
        }else {
            System.out.println("pointing to null");
        }
    }
}
