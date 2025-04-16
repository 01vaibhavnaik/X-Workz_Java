package com.xwrokz.tostring.external;

public class Shoe {
    private String shoeBrand;
    private int shoePrice;
    private String  shoeColor;

    public Shoe(String shoeBrand,int shoePrice,String shoeColor){
        this.shoeBrand=shoeBrand;
        this.shoePrice=shoePrice;
        this.shoeColor=shoeColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Shoe Brand:"+this.shoeBrand+" \nShoe Price:"+this.shoePrice+"\nShoe Color:"+this.shoeColor;
    }
    @Override
    public int hashCode(){
        return -28960;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Shoe){
            Shoe shoe1=this;
            Shoe shoe2=(Shoe) obj;
            if(shoe1.shoeBrand== shoe2.shoeBrand && shoe1.shoePrice== shoe2.shoePrice && shoe1.shoeColor ==shoe2.shoeColor){
                return true;
            }
        }
        return false;
    }
}
