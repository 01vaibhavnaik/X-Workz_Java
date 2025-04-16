package com.xwrokz.tostring.external;

public class Window {
    private String windowType;
    private int windowPrice;
    private String  windowColor;

    public Window(String windowType,int windowPrice,String windowColor){
        this.windowType=windowType;
        this.windowPrice=windowPrice;
        this.windowColor=windowColor;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Window Brand:"+this.windowType+" \nWindow Price:"+this.windowPrice+"\nWindow Color:"+this.windowColor;
    }
    @Override
    public int hashCode(){
        return 254678;
    }
}
