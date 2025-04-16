package com.xwrokz.tostring.external;

public class Cap {
    private String capBrand;
    private int capPrice;
    private String  capColor;

    public Cap(String capBrand,int capPrice,String capColor){
        this.capBrand=capBrand;
        this.capPrice=capPrice;
        this.capColor=capColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Cap Brand:"+this.capBrand+" \nCap Price:"+this.capPrice+"\nCap Color:"+this.capColor;
    }
    @Override
    public int hashCode(){
        return 8763;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cap){
            Cap cap1=this;
            Cap cap2=(Cap) obj;
            if(cap1.capBrand==cap2.capBrand){
                return true;
            }
        }
        return false;
    }
}
