package com.xwrokz.tostring.external;

public class Cow {
    private String breed;
    private boolean isMilkingBreed;
    private boolean isHorned;

    public Cow(String breed, boolean isMilkingBreed, boolean isHorned) {
        this.breed = breed;
        this.isMilkingBreed = isMilkingBreed;
        this.isHorned = isHorned;
        System.out.println("Cow class constructor running");
    }

    @Override
    public String toString() {
        return "Breed: " + this.breed + "\nIs Milking Breed: " + this.isMilkingBreed + "\nIs Horned: " + this.isHorned;
    }
    @Override
    public int hashCode(){
        return -39;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cow){
            Cow cow1=this;
            Cow cow2=(Cow) obj;
            if(cow1.breed==cow2.breed){
                return true;
            }
        }
        return false;
    }
}
