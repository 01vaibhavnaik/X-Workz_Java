package com.xwrokz.tostring.external;

public class Color {
    private String colorBrand;
    private int colorPrice;
    private String  colorMfd;

    public Color(String colorBrand,int colorPrice,String colorMfd){
        this.colorBrand=colorBrand;
        this.colorPrice=colorPrice;
        this.colorMfd=colorMfd;
        System.out.println("String ,int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Color Brand:"+this.colorBrand+" \nColor Price:"+this.colorPrice+"Rs"+"\nColor MFD:"+this.colorMfd;
    }
    @Override
    public int hashCode(){
        return 830;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Color){
            Color color1=this;
            Color color2=(Color) obj;
            if(color1.colorBrand==color2.colorBrand){
                return true;
            }
        }
        return false;
    }
}
