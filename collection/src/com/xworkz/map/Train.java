package com.xworkz.map;

import java.util.*;

public class Train {
    public static void main(String[] args) {
    Map<String,TrainDTO> getAll= new HashMap<>();
    TrainDTO train1=new TrainDTO("VandeBharat","Bangalore","Goa",3,12);
    TrainDTO train2=new TrainDTO("PatnaExp","Vasco","Patna",1,3);
    TrainDTO train3=new TrainDTO("Yashwantpur","Yashwantpur","Mysoor",8,3);
    TrainDTO train4=new TrainDTO("Rajdhani","rajasthan","goa",2,3);
    TrainDTO train5=new TrainDTO("koimbutur","kerla","mangalore",7,3);
    TrainDTO train6=new TrainDTO("Netravati","mangalore","udupi",3,4);
    TrainDTO train7=new TrainDTO("Maksganda","hubbali","davangiri",12,3);
    TrainDTO train8=new TrainDTO("Nijamuddin","Mysoor","Bangalore",3,7);
    TrainDTO train9=new TrainDTO("Murdeshwar","Vacsco","Mysoor",8,3);



    List<Map.Entry<String,TrainDTO>> ref=new ArrayList<>(getAll.entrySet());
     for(Map.Entry<String,TrainDTO> rf:ref){
         System.out.println(rf.getKey());

     }

     Iterator<Map.Entry<String,TrainDTO>> iterable=ref.iterator();
     while(iterable.hasNext()) System.out.println(iterable.next().getValue());

     ref.stream().forEach(s-> System.out.println(s.getValue()));


     getAll.forEach((s,t)-> System.out.println("Key"+s+"Value"+t));






    for (Map.Entry<String,TrainDTO> showDetails:getAll.entrySet()){
        System.out.println("Key : "+showDetails.getKey()+"\nValue : "+showDetails.getValue());
    }
    }
}
