package com.xwrokz.tostring.external;

public class Seagull {
    private String habitat;
    private int wingspan;
    private String diet;

    public Seagull(String habitat, int wingspan, String diet) {
        this.habitat = habitat;
        this.wingspan = wingspan;
        this.diet = diet;
        System.out.println("Seagull class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWingspan: " + this.wingspan + " cm\nDiet: " + this.diet;
    }
    @Override
    public int hashCode(){
        return -872658;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Seagull){
            Seagull seagull1=this;
            Seagull seagull2=(Seagull) obj;
            if(seagull1.habitat== seagull2.habitat && seagull1.wingspan== seagull2.wingspan && seagull1.diet==seagull2.diet){
                return true;
            }
        }
        return false;
    }
}