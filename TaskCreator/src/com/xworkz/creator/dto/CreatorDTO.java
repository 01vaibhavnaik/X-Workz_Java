package com.xworkz.creator.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class CreatorDTO implements Serializable {
    private String name;
    private String email;
    private long mobile;
    private String address;
    private String type;
    private String date;
    private String schedule;

    public CreatorDTO() {
        System.out.println("No-args constructor in CreatorDTO");
    }

    public CreatorDTO(String name, String email, long mobile, String address, String type, String date, String schedule) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.type = type;
        this.date = date;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public String getSchedule() {
        return schedule;
    }
}

