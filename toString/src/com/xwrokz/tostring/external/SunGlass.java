package com.xwrokz.tostring.external;

public class SunGlass {
    private String sunGlassBrand;
    private int sunGlassPrice;
    private String  sunGlassColor;

    public SunGlass(String sunGlassBrand,int sunGlassPrice,String sunGlassColor){
        this.sunGlassBrand=sunGlassBrand;
        this.sunGlassPrice=sunGlassPrice;
        this.sunGlassColor=sunGlassColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Sun Glass Brand:"+this.sunGlassBrand+" \nSun Glass Price:"+this.sunGlassPrice+"\nSun Glass Color:"+this.sunGlassColor;
    }
    @Override
    public int hashCode(){
        return 6678;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof SunGlass){
            SunGlass sunGlass1=this;
            SunGlass sunGlass2=(SunGlass) obj;
            if(sunGlass1.sunGlassBrand==sunGlass2.sunGlassBrand && sunGlass1.sunGlassPrice== sunGlass2.sunGlassPrice && sunGlass1.sunGlassColor ==sunGlass2.sunGlassColor){
                return true;
            }
        }
        return false;
    }
}
