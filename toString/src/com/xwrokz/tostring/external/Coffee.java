package com.xwrokz.tostring.external;

public class Coffee {
    private String coffeeType;
    private int coffeePrice;
    private String  coffeeLocation;

    public Coffee(String coffeeType,int coffeePrice,String coffeeLocation){
        this.coffeeType=coffeeType;
        this.coffeePrice=coffeePrice;
        this.coffeeLocation=coffeeLocation;
        System.out.println("String ,Int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Coffee Type:"+this.coffeeType+" \nCoffee Price:"+this.coffeePrice+"\nLocation :"+this.coffeeLocation;
    }
    @Override
    public int hashCode(){
        return 73;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Coffee){
            Coffee coffee1=this;
            Coffee coffee2=(Coffee) obj;
            if(coffee1.coffeeLocation==coffee2.coffeeLocation){
                return true;
            }
        }
        return false;
    }
}
