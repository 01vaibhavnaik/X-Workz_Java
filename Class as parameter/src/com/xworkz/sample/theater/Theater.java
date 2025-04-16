package com.xworkz.sample.theater;

public class Theater {
    public void post(Poster poster){
        System.out.println("Runnig post in theater");
        if(poster!=null) {
            poster.show();
        }
        else{
            System.out.println("pointing to null");
        }
    }
}
