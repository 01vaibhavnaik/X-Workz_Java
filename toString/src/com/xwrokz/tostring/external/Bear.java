package com.xwrokz.tostring.external;

public class Bear {
    private String habitat;
    private int weight;
    private String diet;

    public Bear(String habitat, int weight, String diet) {
        this.habitat = habitat;
        this.weight = weight;
        this.diet = diet;
        System.out.println("Bear class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWeight: " + this.weight + " kg\nDiet: " + this.diet;
    }
    @Override
    public int hashCode(){
        return -3537;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Bear){
            Bear bear1=this;
            Bear bear2=(Bear) obj;
            if(bear1.habitat==bear2.habitat ){
                return true;
            }
        }
        return false;
    }
}