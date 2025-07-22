package com.xworkz.compare.runner;

import com.xworkz.compare.product.TrainDto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;


public class TrainRunner {
    public static void main(String[] args) {

        LocalDateTime localDateTime=LocalDateTime.now();

        TrainDto trainDto = new TrainDto(3,"Rajdhani", "Delhi", 5000,localDateTime);
        TrainDto trainDto1 = new TrainDto(5,"Shatabdi", "Mumbai", 3000,localDateTime);
        TrainDto trainDto2 = new TrainDto(11,"Duronto", "Kolkata", 4000,localDateTime);
        TrainDto trainDto3 = new TrainDto(34,"Jan Shatabdi", "Chennai", 2000,localDateTime);
        TrainDto trainDto4 = new TrainDto(13,"Garib Rath", "Bangalore", 1500, localDateTime);
        TrainDto trainDto5 = new TrainDto(23,"Express", "Hyderabad", 2500,localDateTime);
        TrainDto trainDto6 = new TrainDto(54,"Patna Exp", "Patna", 3500,localDateTime);
        TrainDto trainDto7 = new TrainDto(83,"Rajkot Exp", "Rajkot", 4500,localDateTime);
        TrainDto trainDto8 = new TrainDto(122,"Surat Exp", "Surat", 5500,localDateTime);
        TrainDto trainDto9 = new TrainDto(27,"Ahmedabad Exp", "Ahmedabad", 6000,localDateTime);
        TrainDto trainDto10 = new TrainDto(55,"Goa Exp", "Goa", 7000,localDateTime);
        TrainDto trainDto11 = new TrainDto(43,"Goa Exp", "Vacso", 7000,localDateTime);



        Collection<TrainDto> collection= new ArrayList<>(Arrays.asList(trainDto,trainDto1,trainDto2,trainDto3,trainDto4,trainDto5,trainDto6,trainDto7,trainDto8,
                trainDto9,trainDto10,trainDto11));
        System.out.println("-------------------------sort by Integer -----------------------------------");
        Comparator<TrainDto> no=(o1,o2)->Integer.compare(o1.getTrainNo(), o2.getTrainNo());
        collection.stream().sorted(no).forEach(s-> System.out.println("Train No :"+s.getTrainNo()+"   Train Name :"+s.getTrainName()));

        System.out.println("-------------------------sort by Acending -----------------------------------");
        collection.stream()
                .sorted(Comparator.comparing(TrainDto::getTrainName))
                .forEach(s -> System.out.println(s.getTrainName()));
        System.out.println("-------------------------sort by  Dcending-----------------------------------");
        collection.stream()
                .sorted(Comparator.comparing(TrainDto::getTrainName).reversed())
                .forEach(s -> System.out.println(s.getTrainName()));
        System.out.println("-------------------------sort by  String-----------------------------------");
        Comparator<TrainDto> list = (o1,o2)->o1.getTrainName().compareTo(o2.getTrainName());
        collection.stream().sorted(list).forEach(s-> System.out.println(s.getTrainName()));
        System.out.println("-------------------------sort by Name and Source -----------------------------------");
        Comparator<TrainDto> list1 = Comparator.comparing(TrainDto::getTrainName).thenComparing(TrainDto::getTrainSource);
        collection.stream().sorted(list1).forEach(s-> System.out.println("Name :"+s.getTrainName()+"    Source :"+s.getTrainSource()));




    }
}
