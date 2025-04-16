package com.xwrokz.tostring.external;

public class Penguin {
    private String habitat;
    private int weight;
    private String diet;

    public Penguin(String habitat, int weight, String diet) {
        this.habitat = habitat;
        this.weight = weight;
        this.diet = diet;
        System.out.println("Penguin class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWeight: " + this.weight + " kg\nDiet: " + this.diet;
    }
    @Override
    public int hashCode(){
        return -275;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Penguin){
            Penguin penguin1=this;
            Penguin penguin2=(Penguin) obj;
            if(penguin1.habitat== penguin2.habitat && penguin1.diet== penguin2.diet){
                return true;
            }
        }
        return false;
    }
}
