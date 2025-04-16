package com.xworkz.task1.Internal;

public abstract class Industry {
    private String name;
    private int product;
    private String room;

    public Industry(String name,int product,String room){
        this.name=name;
        this.product=product;
        this.room=room;
    }

    @Override
    public String toString() {
        return "Industry{" +
                "name='" + name + '\'' +
                ", product=" + product +
                ", room='" + room + '\'' +
                '}';
    }
}
