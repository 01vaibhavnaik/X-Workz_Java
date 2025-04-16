package com.xwrokz.tostring.external;

public class Lion {
    private String habitat;
    private int maneSize;
    private String prideSize;

    public Lion(String habitat, int maneSize, String prideSize) {
        this.habitat = habitat;
        this.maneSize = maneSize;
        this.prideSize = prideSize;
        System.out.println("Lion class constructor running");
    }

    @Override
    public String toString() {
        return "Habitat: " + this.habitat + "\nMane Size: " + this.maneSize + " cm\nPride Size: " + this.prideSize;
    }
    @Override
    public int hashCode(){
        return -8765;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Lion){
            Lion lion1=this;
            Lion lion2=(Lion) obj;
            if(lion1.habitat== lion2.habitat && lion1.prideSize==lion2.prideSize){
                return true;
            }
        }
        return false;
    }
}
