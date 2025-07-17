package com.xworkz.task.runner;

import com.xworkz.task.internal.*;

import java.util.ArrayList;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {





        List<Staff> staff = new ArrayList<>();
        staff.add(new Staff("Nisha", "Dsa", new Detail("3yrs", 40000, new Education("BE", "SDIT", new University("VTU", 20000, new Chancellor("Praksh", 4))))));
        staff.add(new Staff("Usha", "Ai", new Detail("2yrs", 20000, new Education("BCA", "SDMC", new University("VTA", 40000, new Chancellor("Kumar", 5))))));
        staff.add(new Staff("Disha", "Ml", new Detail("1yrs", 10000, new Education("BCA", "SDMC", new University("VTA", 40000, new Chancellor("Kumar", 4))))));
        staff.add(new Staff("Ramya", "DBMS", new Detail("2.5yrs", 25000, new Education("MCA", "VIT", new University("MI", 45000, new Chancellor("Karuma", 5))))));
        List<Staff> staff1 = new ArrayList<>();
        staff1.add(new Staff("Deepu", "SEO", new Detail("5yrs", 50000, new Education("ME", "SIJ", new University("AtMS", 10000, new Chancellor("Rakesh", 10))))));
        staff1.add(new Staff("Sampu", "Accounts", new Detail("1yrs", 90000, new Education("CA", "SDM", new University("VIT", 20000, new Chancellor("Swamy", 15))))));
        staff1.add(new Staff("Samarth", "Chemestry", new Detail("10yrs", 100000, new Education("MSc", "SMJ", new University("MIT", 400000, new Chancellor("Karuppu",  7))))));
        staff1.add(new Staff("Soumya", "Cse", new Detail("2yrs", 25000, new Education("MCA", "VPT", new University("MIP", 45000, new Chancellor("Umavathi",  8))))));
        List<Staff> staff2 = new ArrayList<>();
        staff.add(new Staff("Preethi", "Data Structures", new Detail("3.5yrs", 32000, new Education("BTech", "AIT", new University("JNTU", 28000, new Chancellor("Rajendra",  10))))));
        staff.add(new Staff("Niveditha", "Web Dev", new Detail("2yrs", 26000,new Education("BSc CS", "Christ College", new University("Mysore University", 23000, new Chancellor("Leela",  8))))));
        List<Staff> staff3 = new ArrayList<>();
        staff1.add(new Staff("Girish", "Cyber Security", new Detail("4yrs", 47000, new Education("MTech", "SJBIT", new University("VTU", 50000, new Chancellor("Subramanya",  13))))));
        staff1.add(new Staff("Harshini", "Data Science", new Detail("1.5yrs", 29500,new Education("MCA", "Oxford College", new University("BU", 27000, new Chancellor("Yamini",  7))))));
        staff1.add(new Staff("Rohith", "Networking", new Detail("2yrs", 31000, new Education("BCA", "MSRIT", new University("RGPV", 25000, new Chancellor("Vishwanath",  9))))));
        List<Staff> staff4= new ArrayList<>();
        staff.add(new Staff("Divya", "AI Fundamentals", new Detail("4yrs", 37000, new Education("BE", "RNSIT", new University("Bangalore University", 31000, new Chancellor("Manjunath",  11))))));
        staff.add(new Staff("Shraddha", "Ethical Hacking", new Detail("2.5yrs", 29000,new Education("BSc IT", "KLE College", new University("Kuvempu University", 26000, new Chancellor("Revathi", 9))))));
        List<Staff> staff5 = new ArrayList<>();
        staff1.add(new Staff("Rakesh", "Software Testing", new Detail("5.5yrs", 54000, new Education("ME", "Dayananda Sagar", new University("VTU", 48000, new Chancellor("Kiran",  12))))));
        staff1.add(new Staff("Anjali", "Operating Systems", new Detail("3yrs", 35000,new Education("MSc CS", "Mount Carmel", new University("Christ University", 39000, new Chancellor("Nalini",  10))))));
        staff1.add(new Staff("Sujay", "System Programming", new Detail("2yrs", 31500,new Education("BCA", "BMS College", new University("RGUHS", 27000, new Chancellor("Gopal",  7))))));
        List<Staff> staff6 = new ArrayList<>();
        staff6.add(new Staff("Arjun", "Java", new Detail("4yrs", 42000, new Education("BE", "RVCE", new University("VTU", 21000, new Chancellor("Shankar",  12))))));
        staff6.add(new Staff("Bhavana", "Python", new Detail("2yrs", 28000, new Education("BSc", "PES", new University("BU", 25000, new Chancellor("Maya",  10))))));
        List<Staff> staff7 = new ArrayList<>();
        staff7.add(new Staff("Chandana", "AI", new Detail("3yrs", 35000, new Education("MTech", "NIE", new University("VTU", 30000, new Chancellor("Keshav",  11))))));
        staff7.add(new Staff("Dinesh", "DBMS", new Detail("1.5yrs", 22000, new Education("MCA", "MSRIT", new University("BU", 24000, new Chancellor("Preethi", 48))))));
        List<Staff> staff8 = new ArrayList<>();
        staff8.add(new Staff("Esha", "HR", new Detail("6yrs", 51000, new Education("MBA", "Christ", new University("BU", 23000, new Chancellor("Anitha", 13))))));
        staff8.add(new Staff("Feroz", "Accounts", new Detail("4yrs", 45000, new Education("BCom", "JNC", new University("BU", 21000, new Chancellor("Ravi",  10))))));
        List<Staff> staff9 = new ArrayList<>();
        staff9.add(new Staff("Geetha", "Finance", new Detail("5yrs", 47000, new Education("MCom", "St. Josephs", new University("BU", 28000, new Chancellor("Meera",  8))))));
        staff9.add(new Staff("Harsha", "Tax", new Detail("3yrs", 36000, new Education("CA", "Bangalore Univ", new University("BU", 29000, new Chancellor("Kumar", 7))))));
        List<Staff> staff10 = new ArrayList<>();
        staff10.add(new Staff("Indira", "OS", new Detail("2.5yrs", 30000, new Education("MCA", "BIT", new University("BU", 22000, new Chancellor("Rachna",  9))))));
        staff10.add(new Staff("Jeevan", "C++", new Detail("2yrs", 27000, new Education("BCA", "NMIT", new University("VTU", 21000, new Chancellor("Suraj",  6))))));
        List<Staff> staff11 = new ArrayList<>();
        staff11.add(new Staff("Karthik", "Cloud", new Detail("3yrs", 39000, new Education("BE", "MVIT", new University("VTU", 30000, new Chancellor("Chandru", 10))))));
        staff11.add(new Staff("Lavanya", "DevOps", new Detail("2yrs", 31000, new Education("BTech", "REVA", new University("VTU", 27000, new Chancellor("Shanthi",  8))))));
        List<Staff> staff12 = new ArrayList<>();
        staff12.add(new Staff("Ravi", "Circuits", new Detail("4yrs", 45000, new Education("BE", "IET", new University("AKTU", 42000, new Chancellor("Alok",  20))))));
        staff12.add(new Staff("Sneha", "Digital", new Detail("3.5yrs", 42000, new Education("BTech", "GIT", new University("AKTU", 39000, new Chancellor("Alok",  20))))));
        staff12.add(new Staff("Kavya", "DSP", new Detail("2yrs", 38000, new Education("BSc", "MIT", new University("AKTU", 31000, new Chancellor("Alok", 20))))));
        staff12.add(new Staff("Surya", "Logic", new Detail("5yrs", 47000, new Education("ME", "IITK", new University("AKTU", 44000, new Chancellor("Alok",  20))))));
        List<Staff> staff13 = new ArrayList<>();
        staff13.add(new Staff("Manu", "AI Core", new Detail("6yrs", 51000, new Education("MCA", "Amity", new University("AMU", 61000, new Chancellor("Neha",  15))))));
        staff13.add(new Staff("Amit", "ML Apps", new Detail("3yrs", 43000, new Education("MSc", "SMIT", new University("AMU", 58000, new Chancellor("Neha", 15))))));
        staff13.add(new Staff("Zoya", "Vision", new Detail("4.5yrs", 46000, new Education("BTech", "IMS", new University("AMU", 60000, new Chancellor("Neha", 15))))));
        staff13.add(new Staff("Tarun", "NLP", new Detail("2yrs", 39000, new Education("BE", "ITM", new University("AMU", 55000, new Chancellor("Neha", 20))))));
        List<Staff> staff14 = new ArrayList<>();
        staff14.add(new Staff("Deepa", "Design", new Detail("3yrs", 40000, new Education("BFA", "LU", new University("LUU", 30000, new Chancellor("Ravi",  12))))));
        staff14.add(new Staff("Megha", "Art Lab", new Detail("2.5yrs", 37000, new Education("MFA", "BHU", new University("LUU", 32000, new Chancellor("Ravi",  12))))));
        staff14.add(new Staff("Nikhil", "UI", new Detail("4yrs", 41000, new Education("BCA", "IGNOU", new University("LUU", 34000, new Chancellor("Ravi", 2))))));
        staff14.add(new Staff("Rashmi", "UX", new Detail("5yrs", 45000, new Education("BA", "DU", new University("LUU", 35000, new Chancellor("Ravi", 22))))));
        List<Staff> staff15 = new ArrayList<>();
        staff15.add(new Staff("Karan", "Fluid Mech", new Detail("6yrs", 52000, new Education("BE", "KIT", new University("IITK", 70000, new Chancellor("Jaya", 25))))));
        staff15.add(new Staff("Simran", "Thermal", new Detail("4yrs", 47000, new Education("ME", "NIET", new University("IITK", 69000, new Chancellor("Jaya", 6))))));
        staff15.add(new Staff("Harsh", "AutoCAD", new Detail("3yrs", 43000, new Education("Diploma", "UPTU", new University("IITK", 66000, new Chancellor("Jaya", 62))))));
        staff15.add(new Staff("Divya", "Mech Tools", new Detail("5yrs", 48000, new Education("BE", "JNTU", new University("IITK", 71000, new Chancellor("Jaya", 6))))));
        List<Staff> staff16 = new ArrayList<>();
        staff16.add(new Staff("Rekha", "Pharma", new Detail("4yrs", 44000, new Education("BPharm", "SMS", new University("HNU", 50000, new Chancellor("Shaam", 53))))));
        staff16.add(new Staff("Pradeep", "Biochem", new Detail("3yrs", 41000, new Education("BSc", "IMS", new University("HNU", 47000, new Chancellor("Shaam",  18))))));
        staff16.add(new Staff("Arun", "Microbio", new Detail("5yrs", 47000, new Education("MSc", "LU", new University("HNU", 49000, new Chancellor("Shaam", 8))))));
        staff16.add(new Staff("Jyoti", "Med Research", new Detail("2.5yrs", 39000, new Education("BPharm", "BHU", new University("HNU", 46000, new Chancellor("Shaam", 1))))));
        List<Staff> staff17 = new ArrayList<>();
        staff17.add(new Staff("Bhavya", "Civ Law", new Detail("4.5yrs", 43000, new Education("LLB", "IIL", new University("BLU", 48000, new Chancellor("Preet", 16))))));
        staff17.add(new Staff("Sahil", "Crim Law", new Detail("3yrs", 40000, new Education("BA", "SMIT", new University("BLU", 45000, new Chancellor("Preet", 56))))));
        staff17.add(new Staff("Anu", "Admin Law", new Detail("6yrs", 46000, new Education("LLM", "RIL", new University("BLU", 49000, new Chancellor("Preet",  16))))));
        staff17.add(new Staff("Farhan", "Comp Law", new Detail("2yrs", 37000, new Education("LLB", "IIL", new University("BLU", 47000, new Chancellor("Preet",  16))))));



        HeadOfDepartment headofdepartment=new HeadOfDepartment("Deepak","858754855455",staff);
        HeadOfDepartment headofdepartment1=new HeadOfDepartment("Deepak","858754855455",staff1);
        HeadOfDepartment headofdepartment2=new HeadOfDepartment("Deepak","858754855455",staff2);
        HeadOfDepartment headofdepartment3=new HeadOfDepartment("Deepak","858754855455",staff3);
        HeadOfDepartment headofdepartment4=new HeadOfDepartment("Deepak","858754855455",staff4);
        HeadOfDepartment headofdepartment5=new HeadOfDepartment("Deepak","858754855455",staff5);
        HeadOfDepartment headofdepartment6=new HeadOfDepartment("Deepak","858754855455",staff6);
        HeadOfDepartment headofdepartment7=new HeadOfDepartment("Deepak","858754855455",staff7);
        HeadOfDepartment headofdepartment8=new HeadOfDepartment("Deepak","858754855455",staff8);
        HeadOfDepartment headofdepartment9=new HeadOfDepartment("Deepak","858754855455",staff9);
        HeadOfDepartment headofdepartment10=new HeadOfDepartment("Deepak","858754855455",staff10);
        HeadOfDepartment headofdepartment11=new HeadOfDepartment("Deepak","858754855455",staff11);
        HeadOfDepartment headofdepartment12=new HeadOfDepartment("Deepak","858754855455",staff12);
        HeadOfDepartment headofdepartment13=new HeadOfDepartment("Deepak","858754855455",staff13);
        HeadOfDepartment headofdepartment14=new HeadOfDepartment("Deepak","858754855455",staff14);
        HeadOfDepartment headofdepartment15=new HeadOfDepartment("Deepak","858754855455",staff15);
        HeadOfDepartment headofdepartment16=new HeadOfDepartment("Deepak","858754855455",staff16);



        Department department=new Department("CSE",5,headofdepartment);
        Department department1=new Department("CSE",5,headofdepartment1);
        Department department2=new Department("CSE",5,headofdepartment2);
        Department department3=new Department("CSE",5,headofdepartment3);
        Department department4=new Department("CSE",5,headofdepartment4);
        Department department5=new Department("CSE",5,headofdepartment5);
        Department department6=new Department("CSE",5,headofdepartment6);
        Department department7=new Department("CSE",5,headofdepartment7);
        Department department8=new Department("CSE",5,headofdepartment8);
        Department department9=new Department("CSE",5,headofdepartment9);
        Department department10=new Department("CSE",5,headofdepartment10);
        Department department11=new Department("CSE",5,headofdepartment11);
        Department department12=new Department("CSE",5,headofdepartment12);
        Department department13=new Department("CSE",5,headofdepartment13);
        Department department14=new Department("CSE",5,headofdepartment14);
        Department department15=new Department("CSE",5,headofdepartment15);
        Department department16=new Department("CSE",5,headofdepartment16);




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
