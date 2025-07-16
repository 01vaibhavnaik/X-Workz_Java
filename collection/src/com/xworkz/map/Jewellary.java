package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;

public class Jewellary {
    public static void main(String[] args) {

        Map<String ,JewellaryDTO> getAll= new HashMap<>();

        JewellaryDTO jewellary1=new JewellaryDTO("Golden",1.2,"Rishi","Gold",10,"80%","10%","Circular",58,5);
        getAll.put("Gold",jewellary1);
        JewellaryDTO jewellary2=new JewellaryDTO("Silver",1.0,"Naik","Silver",10,"60%","10%","Square",80,50);
        getAll.put("Silver",jewellary2);

        for (Map.Entry<String,JewellaryDTO> reff: getAll.entrySet()){
            System.out.println("Key : "+reff.getKey()+"\nValue : "+reff.getValue());
        }
        

    }
}
