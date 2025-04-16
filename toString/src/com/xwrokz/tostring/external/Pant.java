package com.xwrokz.tostring.external;

public class Pant {
    private String pantType;
    private int pantPrice;
    private String  pantColor;

    public Pant(String pantType,int pantPrice,String pantColor){
        this.pantType=pantType;
        this.pantPrice=pantPrice;
        this.pantColor=pantColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Pant Type:"+this.pantType+" \nPant Price:"+this.pantPrice+"\nPant Color:"+this.pantColor;
    }
    @Override
    public int hashCode(){
        return -62893;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Pant){
            Pant pant1=this;
            Pant pant2=(Pant) obj;
            if(pant1.pantColor== pant2.pantColor && pant1.pantPrice== pant2.pantPrice){
                return true;
            }
        }
        return false;
    }
}
