package com.xwrokz.tostring.external;

public class Rabbit {
    private String breed;
    private boolean isDomestic;
    private boolean hasLongEars;

    public Rabbit(String breed, boolean isDomestic, boolean hasLongEars) {
        this.breed = breed;
        this.isDomestic = isDomestic;
        this.hasLongEars = hasLongEars;
        System.out.println("Rabbit class constructor running");
    }

    @Override
    public String toString() {
        return "Breed: " + this.breed + "\nIs Domestic: " + this.isDomestic + "\nHas Long Ears: " + this.hasLongEars;
    }
    @Override
    public int hashCode(){
        return 2345678;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Rabbit){
            Rabbit rabbit1=this;
            Rabbit rabbit2=(Rabbit) obj;
            if(rabbit1.hasLongEars== rabbit2.hasLongEars && rabbit1.isDomestic== rabbit2.isDomestic){
                return true;
            }
        }
        return false;
    }
}
