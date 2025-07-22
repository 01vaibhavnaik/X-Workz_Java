package com.xworkz.compare.runner;

import com.xworkz.compare.product.TrainDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;


public class TrainRunner {
    public static void main(String[] args) {
        TrainDto trainDto = new TrainDto("Rajdhani", "Delhi", 5000);
        TrainDto trainDto1 = new TrainDto("Shatabdi", "Mumbai", 3000);
        TrainDto trainDto2 = new TrainDto("Duronto", "Kolkata", 4000);
        TrainDto trainDto3 = new TrainDto("Jan Shatabdi", "Chennai", 2000);
        TrainDto trainDto4 = new TrainDto("Garib Rath", "Bangalore", 1500);
        TrainDto trainDto5 = new TrainDto("Express", "Hyderabad", 2500);
        TrainDto trainDto6 = new TrainDto("Patna Exp", "Patna", 3500);
        TrainDto trainDto7 = new TrainDto("Rajkot Exp", "Rajkot", 4500);
        TrainDto trainDto8 = new TrainDto("Surat Exp", "Surat", 5500);
        TrainDto trainDto9 = new TrainDto("Ahmedabad Exp", "Ahmedabad", 6000);
        TrainDto trainDto10 = new TrainDto("Goa Exp", "Goa", 7000);



        


        Collection<TrainDto> collection= new ArrayList<>(Arrays.asList(trainDto,trainDto1,trainDto2,trainDto3,trainDto4,trainDto5,trainDto6,trainDto7,trainDto8,
                trainDto9,trainDto10));

//      Comparator<TrainDto> list = (o1,o2)->o1.getTrainName().compareTo(o2.getTrainName());
        Comparator<TrainDto> list = Comparator.comparing(TrainDto::getTrainName).thenComparing(TrainDto::getTrainSource);

        collection.stream().sorted(list).forEach(s-> System.out.println(s));

    }
}
