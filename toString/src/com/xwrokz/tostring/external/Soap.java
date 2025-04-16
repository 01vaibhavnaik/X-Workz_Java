package com.xwrokz.tostring.external;

public class Soap {
    private String brand;
    private int weight;
    private String scent;

    public Soap(String brand, int weight, String scent) {
        this.brand = brand;
        this.weight = weight;
        this.scent = scent;
        System.out.println("Soap class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nWeight: " + this.weight + "\nScent: " + this.scent;
    }
    @Override
    public int hashCode(){
        return 745678;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Soap){
            Soap soap1=this;
            Soap soap2=(Soap) obj;
            if(soap1.brand==soap2.brand && soap1.weight== soap2.weight && soap1.scent ==soap2.scent){
                return true;
            }
        }
        return false;
    }
}
