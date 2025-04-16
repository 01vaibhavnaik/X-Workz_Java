package com.xwrokz.tostring.external;

public class Parrot {
    private String color;
    private String habitat;
    private boolean canTalk;

    public Parrot(String color, String habitat, boolean canTalk) {
        this.color = color;
        this.habitat = habitat;
        this.canTalk = canTalk;
        System.out.println("Parrot class constructor running");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + "\nHabitat: " + this.habitat + "\nCan Talk: " + this.canTalk;
    }
    @Override
    public int hashCode(){
        return -7642;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Parrot){
            Parrot parrot1=this;
            Parrot parrot2=(Parrot) obj;
            if(parrot1.habitat== parrot2.habitat && parrot1.canTalk== parrot2.canTalk){
                return true;
            }
        }
        return false;
    }
}
