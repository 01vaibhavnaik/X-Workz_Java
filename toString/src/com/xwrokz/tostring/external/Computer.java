package com.xwrokz.tostring.external;

public class Computer {
    private String brand;
    private int ramSize;
    private String processorType;

    public Computer(String brand, int ramSize, String processorType) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.processorType = processorType;
        System.out.println("Computer class constructor running");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\nRAM Size: " + this.ramSize + "\nProcessor Type: " + this.processorType;
    }
    @Override
    public int hashCode(){
        return -7539;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Computer){
            Computer computer1=this;
            Computer computer2=(Computer) obj;
            if(computer1.ramSize==computer2.ramSize){
                return true;
            }
        }
        return false;
    }
}
