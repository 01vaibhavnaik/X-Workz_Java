package com.xwrokz.tostring.external;

public class Eagle {
    private String habitat;
    private double wingspan;
    private String prey;

    public Eagle(String habitat, double wingspan, String prey) {
        this.habitat = habitat;
        this.wingspan = wingspan;
        this.prey = prey;
        System.out.println("Eagle class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nWingspan: " + this.wingspan + " m\nPrey: " + this.prey;
    }
    @Override
    public int hashCode(){
        return 9287;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Eagle){
            Eagle eagle1=this;
            Eagle eagle2=(Eagle) obj;
            if(eagle1.habitat==eagle2.habitat){
                return true;
            }
        }
        return false;
    }
}
