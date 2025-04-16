package com.xwrokz.tostring.external;

public class Whale {
    private String habitat;
    private int weight;
    private String diet;

    public Whale(String habitat, int weight, String diet) {
        this.habitat = habitat;
        this.weight = weight;
        this.diet = diet;
        System.out.println("Whale class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWeight: " + this.weight + " kg\nDiet: " + this.diet;
    }
    @Override
    public int hashCode(){
        return 45;
    }
}
