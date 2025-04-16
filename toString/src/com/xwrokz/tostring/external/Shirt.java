package com.xwrokz.tostring.external;

public class Shirt {
    private String shirtBrand;
    private int shirtPrice;
    private char shirtSize;

    public Shirt(String shirtBrand, int shirtPrice, char shirtSize) {
        this.shirtBrand = shirtBrand;
        this.shirtPrice = shirtPrice;
        this.shirtSize = shirtSize;
        System.out.println("String ,Int, Char arg cont Running");
    }

    @Override
    public String toString() {
        return "Shirt Brand:" + this.shirtBrand + " \nShirt Price:" + this.shirtPrice + "\nShirt Size:" + this.shirtSize;
    }
    @Override
    public int hashCode(){
        return 2960;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Shirt){
            Shirt shirt1=this;
            Shirt shirt2=(Shirt) obj;
            if(shirt1.shirtBrand== shirt2.shirtBrand && shirt1.shirtPrice== shirt2.shirtPrice && shirt1.shirtSize==shirt2.shirtSize){
                return true;
            }
        }
        return false;
    }
}
