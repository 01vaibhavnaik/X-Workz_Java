package com.xwrokz.tostring.external;

public class Guitar {
    private String brand;
    private int stringCount;
    private String type;

    public Guitar(String brand, int stringCount, String type) {
        this.brand = brand;
        this.stringCount = stringCount;
        this.type = type;
        System.out.println("Guitar class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nString Count: " + this.stringCount + "\nType: " + this.type;
    }
    @Override
    public int hashCode(){
        return 927;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Guitar){
            Guitar guitar1=this;
            Guitar guitar2=(Guitar) obj;
            if(guitar1.type== guitar2.type){
                return true;
            }
        }
        return false;
    }
}
