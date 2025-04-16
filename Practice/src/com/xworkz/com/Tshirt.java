package com.xworkz.com;

public class Tshirt {
    private String brand;
    private int price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Tshirt){
            Tshirt tshirt1=this;
            Tshirt tshirt2=(Tshirt)obj;
            if(tshirt1.brand==tshirt2.brand && tshirt1.price==tshirt2.price){
                return true;
            }
        }
        return false;
    }
}
