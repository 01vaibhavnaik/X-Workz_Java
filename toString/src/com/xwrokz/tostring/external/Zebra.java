package com.xwrokz.tostring.external;

public class Zebra {
    private String habitat;
    private String stripePattern;
    private String diet;

    public Zebra(String habitat, String stripePattern, String diet) {
        this.habitat = habitat;
        this.stripePattern = stripePattern;
        this.diet = diet;
        System.out.println("Zebra class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nStripe Pattern: " + this.stripePattern + "\nDiet: " + this.diet;
    }
    @Override
    public int hashCode(){
        return -877654;
    }
}
