package com.xwrokz.tostring.external;

public class Tortoise {
    private String habitat;
    private int lifespan;
    private String diet;

    public Tortoise(String habitat, int lifespan, String diet) {
        this.habitat = habitat;
        this.lifespan = lifespan;
        this.diet = diet;
        System.out.println("Tortoise class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nLifespan: " + this.lifespan + " years\nDiet: " + this.diet;
    }
    @Override
    public int hashCode(){
        return -54;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Tortoise){
            Tortoise tortoise1=this;
            Tortoise tortoise2=(Tortoise) obj;
            if(tortoise1.habitat==tortoise2.habitat && tortoise1.lifespan== tortoise2.lifespan && tortoise1.diet ==tortoise2.diet){
                return true;
            }
        }
        return false;
    }
}