package com.xwrokz.tostring.external;

public class Dolphine {
    private String habitat;
    private int weight;
    private boolean isEndangered;

    public Dolphine(String habitat, int weight, boolean isEndangered) {
        this.habitat = habitat;
        this.weight = weight;
        this.isEndangered = isEndangered;
        System.out.println("Dolphin class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWeight: " + this.weight + " kg\nEndangered: " + this.isEndangered;
    }
    @Override
    public int hashCode(){
        return 863;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Dolphine){
            Dolphine dolphine1=this;
            Dolphine dolphine2=(Dolphine) obj;
            if(dolphine1.habitat==dolphine2.habitat){
                return true;
            }
        }
        return false;
    }
}
