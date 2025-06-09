package com.xworkz.servler.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class WeatherDTO implements Serializable {
    private  String location;
    private String capture;
    private int temprature;
    private LocalDate date;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCapture() {
        return capture;
    }

    public void setCapture(String capture) {
        this.capture = capture;
    }

    public int getTemprature() {
        return temprature;
    }

    public void setTemprature(int temprature) {
        this.temprature = temprature;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
