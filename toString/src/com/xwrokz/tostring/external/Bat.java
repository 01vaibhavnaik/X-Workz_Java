package com.xwrokz.tostring.external;

public class Bat {
    private String habitat;
    private int wingspan;
    private boolean isNocturnal;

    public Bat(String habitat, int wingspan, boolean isNocturnal) {
        this.habitat = habitat;
        this.wingspan = wingspan;
        this.isNocturnal = isNocturnal;
        System.out.println("Bat class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWingspan: " + this.wingspan + " cm\nNocturnal: " + this.isNocturnal;
    }
    @Override
    public int hashCode(){
        return -3768;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Bat){
            Bat bat1=this;
            Bat bat2=(Bat) obj;
            if(bat1.habitat==bat2.habitat ){
                return true;
            }
        }
        return false;
    }
}