package com.xworkz.classvariable.Clip;

public class Clip {
    String color;

    Clip(String color){
        this.color=color;
    }
    void color(){
        System.out.println("Color:"+color);
    }

    void hold(){
        System.out.println("Holding clip");
    }
}
