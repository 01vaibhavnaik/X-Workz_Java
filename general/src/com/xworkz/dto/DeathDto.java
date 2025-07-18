package com.xworkz.dto;


import java.io.Serializable;

public class DeathDto implements Serializable {
    private String name;
    private String cause;
    private String dateTime;
    private String age;
    private String certified;
    private String hospitalName;
    private String mannerofdeath;

    public DeathDto() {
        System.out.println("no-args constructor in DeathDto");
    }

    public DeathDto(String name, String cause, String dateTime, String age, String certified, String hospitalName,
                    String mannerofdeath) {

        this.name = name;
        this.cause = cause;
        this.dateTime = dateTime;
        this.age = age;
        this.certified = certified;
        this.hospitalName = hospitalName;
        this.mannerofdeath = mannerofdeath;
    }

    @Override
    public String toString() {
        return "DeathDto{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", cause='" + cause + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", certified='" + certified + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", mannerofdeath='" + mannerofdeath + '\'' +
                '}';
    }
}