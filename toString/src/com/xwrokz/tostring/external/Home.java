package com.xwrokz.tostring.external;

public class Home {

    private String homeType;
    private int homeRent;
    private String  homeLocatin;

    public Home(String homeType,int homeRent,String homeLocatin){
        this.homeType=homeType;
        this.homeRent=homeRent;
        this.homeLocatin=homeLocatin;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Type:"+this.homeType+" \nRent:"+this.homeRent+"\nAddress:"+this.homeLocatin;
    }
    @Override
    public int hashCode(){
        return 92689;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Home){
            Home home1=this;
            Home home2=(Home) obj;
            if(home1.homeType== home2.homeType && home1.homeLocatin==home2.homeLocatin){
                return true;
            }
        }
        return false;
    }
}
