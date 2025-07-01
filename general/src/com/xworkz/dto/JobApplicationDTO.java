package com.xworkz.dto;

import java.io.Serializable;

public class JobApplicationDTO implements Serializable {

    private String name;
    private  String email;
    private String education;
    private String skill;
    private double salary;
    private int experience;

    @Override
    public String toString() {
        return "jobApplicationDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", skill='" + skill + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
    public JobApplicationDTO() {
        System.out.println("no-args constructor in JobApplicationDTO");
    }
    public JobApplicationDTO(String name, String email, String education, String skill, double salary, int experience) {
        this.name = name;
        this.email = email;
        this.education = education;
        this.skill = skill;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getEducation() {
        return education;
    }

    public String getSkill() {
        return skill;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }
}
