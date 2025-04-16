package com.xwrokz.tostring.external;

public class Snake {
    private String species;
    private boolean isVenomous;
    private boolean canClimb;

    public Snake(String species, boolean isVenomous, boolean canClimb) {
        this.species = species;
        this.isVenomous = isVenomous;
        this.canClimb = canClimb;
        System.out.println("Snake class constructor running");
    }

    @Override
    public String toString() {
        return "Species: " + this.species + "\nIs Venomous: " + this.isVenomous + "\nCan Climb: " + this.canClimb;
    }
    @Override
    public int hashCode(){
        return -4567;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Snake){
            Snake snake1=this;
            Snake snake2=(Snake) obj;
            if(snake1.species==snake2.species && snake1.isVenomous== snake2.isVenomous && snake1.canClimb ==snake2.canClimb){
                return true;
            }
        }
        return false;
    }
}