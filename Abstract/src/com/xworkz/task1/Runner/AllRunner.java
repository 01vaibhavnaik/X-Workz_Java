package com.xworkz.task1.Runner;


import com.xworkz.task1.External.*;

public class AllRunner {
    public static void main(String[] args) {

        System.out.println("1");
        GoaTrip goaTrip = new GoaTrip();
        System.out.println("------------------------------------------------------");
        System.out.println("2");
        Floor floor = new Floor();
        floor.builds();
        System.out.println("------------------------------------------------------");
        System.out.println("3");
        BMW bmw = new BMW();
        bmw.carName();
        bmw.car();
        System.out.println("------------------------------------------------------");
        System.out.println("4");
        Company company = new Company("Rin", 7, "2");
        System.out.println(company.toString());
        System.out.println("------------------------------------------------------");
        System.out.println("4");
        Build build1 = new Build("Asus", 70000, "Snapdragon");
        Build build2 = new Build("Lenevo", 30997);
        Build build3 = new Build("Dell");
        System.out.println(build1);
        System.out.println(build2);
        System.out.println(build3);

    }
}
