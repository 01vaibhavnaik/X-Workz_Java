package com.xwrokz.tostring.external;

public class Shark {
    private String species;
    private boolean isDangerous;
    private boolean canSurviveInFreshwater;

    public Shark(String species, boolean isDangerous, boolean canSurviveInFreshwater) {
        this.species = species;
        this.isDangerous = isDangerous;
        this.canSurviveInFreshwater = canSurviveInFreshwater;
        System.out.println("Shark class constructor running");
    }

    @Override
    public String toString() {
        return "Species: " + this.species + "\nIs Dangerous: " + this.isDangerous + "\nCan Survive in Freshwater: " + this.canSurviveInFreshwater;
    }
    @Override
    public int hashCode(){
        return 28960;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Shark){
            Shark shark1=this;
            Shark shark2=(Shark) obj;
            if(shark1.species== shark2.species && shark1.isDangerous== shark2.isDangerous && shark1.canSurviveInFreshwater==shark2.canSurviveInFreshwater){
                return true;
            }
        }
        return false;
    }
}
