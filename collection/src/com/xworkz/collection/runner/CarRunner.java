package com.xworkz.collection.runner;

import com.xworkz.collection.external.Cars;

import java.util.ArrayList;
import java.util.Collection;

public class CarRunner implements Cars {

    public static void main(String[] args) {

        Collection<String> carNames = new ArrayList<>();

        carNames.add("Swift");
        carNames.add("Hyundai Creta");
        carNames.add("Tata Nexon");
        carNames.add("Mahindra XUV300");
        carNames.add("Renault Duster");
        carNames.add("Honda WR-V");
        carNames.add("Toyota Urban Cruiser");
        carNames.add("Nissan Magnite");
        carNames.add("Ford EcoSport");

        System.out.println("Number Of Cars: " + carNames.size());
        carNames.clear();
        System.out.println("Number Of Cars After Clear: " + carNames.size());
        System.out.println("After clear Adding New Cars...");

        carNames.add("Bugatti Veyron");
        carNames.add("Lamborghini Aventador");
        carNames.add("Ferrari 488");
        carNames.add("Porsche 911");
        carNames.add("McLaren 720S");
        carNames.add("Aston Martin DB11");
        carNames.add("Bentley Continental GT");
        carNames.add("Rolls-Royce Phantom");
        carNames.add("BMW M5 Competition");
        carNames.add("Mercedes-Benz S-Class");
        System.out.println("Number Of Cars After Adding New Cars: " + carNames.size());

    }

    @Override
    public String carName() {
        return "";
    }
}
