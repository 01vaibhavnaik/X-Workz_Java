package com.xwrokz.tostring.external;

public class Chair {
    private String chairCompany;
    private int chairPrice;
    private String  chairColor;

    public Chair(String chairCompany,int chairPrice,String chairColor){
        this.chairCompany=chairCompany;
        this.chairPrice=chairPrice;
        this.chairColor=chairColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Chair Company:"+this.chairCompany+" \nChair Price:"+this.chairPrice+"\nChair Color:"+this.chairColor;
    }
    @Override
    public int hashCode(){
        return 7893;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Chair){
            Chair chair1=this;
            Chair chair2=(Chair) obj;
            if(chair1.chairPrice==chair2.chairPrice){
                return true;
            }
        }
        return false;
    }
}
