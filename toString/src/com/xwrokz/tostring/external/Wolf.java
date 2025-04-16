package com.xwrokz.tostring.external;

public class Wolf {
    private String habitat;
    private int packSize;
    private String prey;

    public Wolf(String habitat, int packSize, String prey) {
        this.habitat = habitat;
        this.packSize = packSize;
        this.prey = prey;
        System.out.println("Wolf class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nPack Size: " + this.packSize + "\nPrey: " + this.prey;
    }
    @Override
    public int hashCode(){
        return 987654;
    }
}

