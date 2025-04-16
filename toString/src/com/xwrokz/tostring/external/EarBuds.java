package com.xwrokz.tostring.external;

public class EarBuds {
    private String earBrand;
    private int earPrice;
    private String  earColor;

    public EarBuds(String earBrand,int earPrice,String earColor){
        this.earBrand=earBrand;
        this.earPrice=earPrice;
        this.earColor=earColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Ear Bud Brand:"+this.earBrand+" \nEar Bud Price:"+this.earPrice+"\nEar Bud Color:"+this.earColor;
    }
    @Override
    public int hashCode(){
        return -8983;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof EarBuds){
            EarBuds earBuds1=this;
            EarBuds earBuds2=(EarBuds) obj;
            if(earBuds1.earBrand==earBuds2.earBrand){
                return true;
            }
        }
        return false;
    }
}
