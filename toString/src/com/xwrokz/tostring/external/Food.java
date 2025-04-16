package com.xwrokz.tostring.external;

public class Food {
    private String foodType;
    private int foodPrice;
    private String  foodLocation;

    public Food(String foodType,int foodPrice,String foodLocation){
        this.foodType=foodType;
        this.foodPrice=foodPrice;
        this.foodLocation=foodLocation;
        System.out.println("String ,int, String arg cont Running");
    }
    @Override
    public String toString(){
        return "Food Type:"+this.foodType+" \nFood Price:"+this.foodPrice+"Rs"+"\nFood Shop Location:"+this.foodLocation;
    }
    @Override
    public int hashCode(){
        return -3922;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Fan){
            Food food1=this;
            Food food2=(Food) obj;
            if(food1.foodType==food2.foodType){
                return true;
            }
        }
        return false;
    }
}
