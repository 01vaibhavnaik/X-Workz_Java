package com.xworkz.internal;

public class TemperatureSensor implements Sensor {

    @Override
    public void readValue() {
        System.out.println("Reading temperature value");
    }


}
