package com.xwrokz.tostring.external;

import java.lang.classfile.components.CodeRelabeler;

public class Crocodile {
    private String habitat;
    private int length;
    private String diet;

    public Crocodile(String habitat, int length, String diet) {
        this.habitat = habitat;
        this.length = length;
        this.diet = diet;
        System.out.println("Crocodile class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nLength: " + this.length + " meters\nDiet: " + this.diet;
    }
    @Override
    public int hashCode(){
        return 39;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Crocodile){
            Crocodile crocodile1=this;
            Crocodile crocodile2=(Crocodile) obj;
            if(crocodile1.diet==crocodile2.diet){
                return true;
            }
        }
        return false;
    }
}