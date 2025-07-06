package com.xworkz.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Bike {
    public static void main(String[] args) {
        List<String> bikeName= new ArrayList<>(Arrays.asList("X-pulse","GT-650","Kawasaki","Harley","Bullet"));

        ListIterator<String> listIterator= bikeName.listIterator();

        while(listIterator.hasNext()){
            String bike=listIterator.next();
            if(bike.equals("GT-650")) {
                listIterator.add("Duccati");
            }


        }
        System.out.println("After Adding: "+bikeName);
    }
}
