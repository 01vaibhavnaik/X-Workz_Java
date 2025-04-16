package com.xworkz.classvariable.Clip;

public class ClipRunner {
    public static void main(String[] args) {
        Clip clip1=new Clip("red");
        Clip clip2=new Clip("blue");
        Clip clip3=new Clip("White");

        Clip[] clips={clip1,clip2,clip3};


    Pushpa pushpa=new Pushpa();
        pushpa.useClip(clips);
    }
}
