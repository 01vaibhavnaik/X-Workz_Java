package com.xworkz.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Food {

        public static void main(String[] args) {

            List<String> list = new ArrayList<>(Arrays.asList("Biryani","Noodles","Puri","Idly"));

            ListIterator<String> listIterator = list.listIterator();

            while (listIterator.hasNext()){
                String foodName = listIterator.next();
//                System.out.println("food name : "+ foodName);
                if (foodName.equals("Puri")){
                    listIterator.add("Chapati");
                }
            }
            System.out.println("food name : "+ list);



        }


    }

