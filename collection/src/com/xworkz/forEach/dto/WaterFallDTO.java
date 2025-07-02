package com.xworkz.forEach.dto;

public class WaterFallDTO {

    private String name;
    private int price;
    private int trekTime;
    private String location;
    private String type;
    private String season;
    private int trekDistance;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getTrekTime() {
        return trekTime;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public String getSeason() {
        return season;
    }

    public int getTrekDistance() {
        return trekDistance;
    }

    public WaterFallDTO(String name, int price, int trekTime, String location, String type, String season,
                        int trekDistance) {
        this.name = name;
        this.price = price;
        this.trekTime = trekTime;
        this.location = location;
        this.type = type;
        this.season = season;
        this.trekDistance = trekDistance;


    }


}
