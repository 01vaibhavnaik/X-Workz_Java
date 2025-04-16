package com.xwrokz.tostring.external;

public class AirConditioner {
    private String brand;
    private int coolingCapacity;
    private String color;
    private  final String price= "200Rs";

    public AirConditioner(String brand, int coolingCapacity, String color,String price) {
        this.brand = brand;
        this.coolingCapacity = coolingCapacity;
        this.color = color;
        price=price;
        System.out.println("AirConditioner class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nCooling Capacity: " + this.coolingCapacity + "\nColor: " + this.color +"\n Price "+this.price;
    }
    @Override
    public int hashCode(){
        return 9;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof AirConditioner){
            AirConditioner airConditioner1=this;
            AirConditioner airConditioner2=(AirConditioner) obj;
            if(airConditioner1.brand==airConditioner2.brand ){
                return true;
        }
        }
        return false;
    }
}
