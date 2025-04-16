package com.xwrokz.tostring.external;

public class Helmet {
    private String brand;
    private String material;
    private int size;

    public Helmet(String brand, String material, int size) {
        this.brand = brand;
        this.material = material;
        this.size = size;
        System.out.println("Helmet class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nMaterial: " + this.material + "\nSize: " + this.size;
    }
    @Override
    public int hashCode(){
        return 9927;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Helmet){
            Helmet helmet1=this;
            Helmet helmet2=(Helmet) obj;
            if(helmet1.brand== helmet2.brand && helmet1.size==helmet2.size){
                return true;
            }
        }
        return false;
    }
}
