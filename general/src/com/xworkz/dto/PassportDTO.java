package com.xworkz.dto;

import java.io.Serializable;

public class PassportDTO implements Serializable {
    private String name;
    private long adharNo;
    private String address;
    private long panNo;
    private String country;
    private String state;
    private String city;
    private long pinCode;
    private String passportType;
    private long refNo;

    public PassportDTO(String name, long adharNo, String address, long panNo, String country, String state, String city, long pinCode, String passportType, long refNo) {
        this.name = name;
        this.adharNo = adharNo;
        this.address = address;
        this.panNo = panNo;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.passportType = passportType;
        this.refNo = refNo;
        System.out.println(this.name);
    }
    public String getName() {
        return name;
    }




}
