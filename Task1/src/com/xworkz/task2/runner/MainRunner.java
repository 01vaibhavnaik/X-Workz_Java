package com.xworkz.task2.runner;

import com.xworkz.task2.internal.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {




o

        Department department=new Department("CSE",5,headofdepartment);
        Department department1=new Department("CSE",5,headofdepartment);
        Department department2=new Department("CSE",5,headofdepartment);
        Department department3=new Department("CSE",5,headofdepartment);
        Department department4=new Department("CSE",5,headofdepartment);
        Department department5=new Department("CSE",5,headofdepartment);
        Department department6=new Department("CSE",5,headofdepartment);
        Department department7=new Department("CSE",5,headofdepartment);
        Department department8=new Department("CSE",5,headofdepartment);
        Department department9=new Department("CSE",5,headofdepartment);
        Department department10=new Department("CSE",5,headofdepartment);
        Department department11=new Department("CSE",5,headofdepartment);
        Department department12=new Department("CSE",5,headofdepartment);
        Department department13=new Department("CSE",5,headofdepartment);
        Department department14=new Department("CSE",5,headofdepartment);
        Department department15=new Department("CSE",5,headofdepartment);
        Department department16=new Department("CSE",5,headofdepartment);




        List<Portfolio> portfolio=new ArrayList<>();
        portfolio.add(new Portfolio("Digital",1,department));
        portfolio.add(new Portfolio("Paper",1,department1));
        List<Portfolio> portfolio1=new ArrayList<>();
        portfolio.add(new Portfolio("paper",2,department2));
        portfolio.add(new Portfolio("Paper",2,department3));
        List<Portfolio> portfolio2=new ArrayList<>();
        portfolio.add(new Portfolio("Digital",4,department4));
        portfolio.add(new Portfolio("Paper",1,department5));
        List<Portfolio> portfolio3=new ArrayList<>();
        portfolio.add(new Portfolio("Digital",4,department6));
        portfolio.add(new Portfolio("Paper",2,department7));
        List<Portfolio> portfolio4=new ArrayList<>();
        portfolio.add(new Portfolio("Digital",4,department8));
        portfolio.add(new Portfolio("Digital",2,department9));
        List<Portfolio> portfolio5=new ArrayList<>();
        portfolio.add(new Portfolio("Paper",3,department10));
        portfolio.add(new Portfolio("Digital",6,department11));
        List<Portfolio> portfolio6=new ArrayList<>();
        portfolio.add(new Portfolio("Paper",2,department12));
        portfolio.add(new Portfolio("Digital",2,department13));
        List<Portfolio> portfolio7=new ArrayList<>();
        portfolio.add(new Portfolio("Paper",4,department14));
        portfolio.add(new Portfolio("Digital",6,department15));
        List<Portfolio> portfolio8=new ArrayList<>();
        portfolio.add(new Portfolio("Paper",1,department15));
        portfolio.add(new Portfolio("Digital",3,department16));






        List<Minister> ministers=new ArrayList<>();
        ministers.add(new Minister("Vaibhav","7937286882",portfolio));
        ministers.add(new Minister("Chaitanya","875365622",portfolio1));
        ministers.add(new Minister("Sankalp","58763532387",portfolio2));
        List<Minister> ministers1=new ArrayList<>();
        ministers.add(new Minister("Roshan","76563573313",portfolio3));
        ministers.add(new Minister("Rishi","655325883232",portfolio4));
        ministers.add(new Minister("Sarthak","5762524654276",portfolio5));
        List<Minister> ministers2=new ArrayList<>();
        ministers.add(new Minister("Abhijit","656735256835",portfolio6));
        ministers.add(new Minister("Ketan","36723444555",portfolio7));
        ministers.add(new Minister("karthik","87678637367",portfolio8));

        List<State> states=new ArrayList<>();
        states.add(new State("Goa",2,ministers));
        states.add(new State("Karnataka",2,ministers1));
        states.add(new State("Kerla",2,ministers2));

        Country country=new Country("India",28,states);





    }
}
