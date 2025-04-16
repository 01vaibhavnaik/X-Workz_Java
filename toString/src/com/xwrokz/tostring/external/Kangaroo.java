package com.xwrokz.tostring.external;

public class Kangaroo {
    private String habitat;
    private int weight;
    private int jumpHeight;

    public Kangaroo(String habitat, int weight, int jumpHeight) {
        this.habitat = habitat;
        this.weight = weight;
        this.jumpHeight = jumpHeight;
        System.out.println("Kangaroo class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWeight: " + this.weight + " kg\nJump Height: " + this.jumpHeight + " m";
    }
    @Override
    public int hashCode(){
        return 9211;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Kangaroo){
            Kangaroo kangaroo1=this;
            Kangaroo kangaroo2=(Kangaroo) obj;
            if(kangaroo1.weight== kangaroo2.weight && kangaroo1.jumpHeight==kangaroo2.jumpHeight){
                return true;
            }
        }
        return false;
    }
}