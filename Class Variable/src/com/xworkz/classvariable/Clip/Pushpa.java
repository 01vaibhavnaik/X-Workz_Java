package com.xworkz.classvariable.Clip;

public class Pushpa {


    void useClip(Clip[] clip){
        for(Clip ref:clip) {
            if (ref!= null) {
                ref.hold();
                ref.color();

            } else {
                System.out.println("Pointing to null");
            }
        }
    }
}
