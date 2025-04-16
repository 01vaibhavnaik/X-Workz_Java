package com.xwrokz.tostring.external;

public class Swan {
    private String color;
    private String habitat;
    private double wingspan;

    public Swan(String color, String habitat, double wingspan) {
        this.color = color;
        this.habitat = habitat;
        this.wingspan = wingspan;
        System.out.println("Swan class constructor running");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + "\nHabitat: " + this.habitat + "\nWingspan: " + this.wingspan + " meters";
    }
    @Override
    public int hashCode(){
        return 6568;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Swan){
            Swan swan1=this;
            Swan swan2=(Swan) obj;
            if(swan1.color==swan2.color && swan1.habitat== swan2.habitat && swan1.wingspan ==swan2.wingspan){
                return true;
            }
        }
        return false;
    }
}