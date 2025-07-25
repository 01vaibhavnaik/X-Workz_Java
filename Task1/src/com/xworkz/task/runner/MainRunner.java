package com.xworkz.task.runner;

import com.xworkz.task.internal.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {


        List<Staff> staff = new ArrayList<>();
        staff.add(new Staff("Nisha", "Dsa", new Detail("3yrs", 40000, new Education("BE", "SDIT", new University("VTU", 20000, new Chancellor("Praksh", 42,4))))));
        staff.add(new Staff("Usha", "Ai", new Detail("2yrs", 20000, new Education("BCA", "SDMC", new University("VTA", 40000, new Chancellor("Kumar", 52,45))))));
        staff.add(new Staff("Disha", "Ml", new Detail("1yrs", 10000, new Education("BCA", "SDMC", new University("VTA", 40000, new Chancellor("Kumar", 32,45))))));
        staff.add(new Staff("Ramya", "DBMS", new Detail("2.5yrs", 25000, new Education("MCA", "VIT", new University("MI", 45000, new Chancellor("Karuma", 32,45))))));
        List<Staff> staff1 = new ArrayList<>();
        staff1.add(new Staff("Deepu", "SEO", new Detail("5yrs", 50000, new Education("ME", "SIJ", new University("AtMS", 10000, new Chancellor("Rakesh", 22,4))))));
        staff1.add(new Staff("Sampu", "Accounts", new Detail("1yrs", 90000, new Education("CA", "SDM", new University("VIT", 20000, new Chancellor("Swamy",25,4 ))))));
        staff1.add(new Staff("Samarth", "Chemestry", new Detail("10yrs", 100000, new Education("MSc", "SMJ", new University("MIT", 400000, new Chancellor("Karuppu",  32,2))))));
        staff1.add(new Staff("Soumya", "Cse", new Detail("2yrs", 25000, new Education("MCA", "VPT", new University("MIP", 45000, new Chancellor("Umavathi",  52,8))))));
        List<Staff> staff2 = new ArrayList<>();
        staff.add(new Staff("Preethi", "Data Structures", new Detail("3.5yrs", 32000, new Education("BTech", "AIT", new University("JNTU", 28000, new Chancellor("Rajendra",  32,45))))));
        staff.add(new Staff("Niveditha", "Web Dev", new Detail("2yrs", 26000,new Education("BSc CS", "Christ College", new University("Mysore University", 23000, new Chancellor("Leela",  52,8))))));
        List<Staff> staff3 = new ArrayList<>();
        staff1.add(new Staff("Girish", "Cyber Security", new Detail("4yrs", 47000, new Education("MTech", "SJBIT", new University("VTU", 50000, new Chancellor("Subramanya",  52,45))))));
        staff1.add(new Staff("Harshini", "Data Science", new Detail("1.5yrs", 29500,new Education("MCA", "Oxford College", new University("BU", 27000, new Chancellor("Yamini",  25,4))))));
        staff1.add(new Staff("Rohith", "Networking", new Detail("2yrs", 31000, new Education("BCA", "MSRIT", new University("RGPV", 25000, new Chancellor("Vishwanath",  32,45))))));
        List<Staff> staff4= new ArrayList<>();
        staff.add(new Staff("Divya", "AI Fundamentals", new Detail("4yrs", 37000, new Education("BE", "RNSIT", new University("Bangalore University", 31000, new Chancellor("Manjunath",  52,8))))));
        staff.add(new Staff("Shraddha", "Ethical Hacking", new Detail("2.5yrs", 29000,new Education("BSc IT", "KLE College", new University("Kuvempu University", 26000, new Chancellor("Revathi", 42,4))))));
        List<Staff> staff5 = new ArrayList<>();
        staff1.add(new Staff("Rakesh", "Software Testing", new Detail("5.5yrs", 54000, new Education("ME", "Dayananda Sagar", new University("VTU", 48000, new Chancellor("Kiran",  52,45))))));
        staff1.add(new Staff("Anjali", "Operating Systems", new Detail("3yrs", 35000,new Education("MSc CS", "Mount Carmel", new University("Christ University", 39000, new Chancellor("Nalini",  52,8))))));
        staff1.add(new Staff("Sujay", "System Programming", new Detail("2yrs", 31500,new Education("BCA", "BMS College", new University("RGUHS", 27000, new Chancellor("Gopal",  32,45))))));
        List<Staff> staff6 = new ArrayList<>();
        staff6.add(new Staff("Arjun", "Java", new Detail("4yrs", 42000, new Education("BE", "RVCE", new University("VTU", 21000, new Chancellor("Shankar",  25,4))))));
        staff6.add(new Staff("Bhavana", "Python", new Detail("2yrs", 28000, new Education("BSc", "PES", new University("BU", 25000, new Chancellor("Maya",  32,45))))));
        List<Staff> staff7 = new ArrayList<>();
        staff7.add(new Staff("Chandana", "AI", new Detail("3yrs", 35000, new Education("MTech", "NIE", new University("VTU", 30000, new Chancellor("Keshav",  52,45))))));
        staff7.add(new Staff("Dinesh", "DBMS", new Detail("1.5yrs", 22000, new Education("MCA", "MSRIT", new University("BU", 24000, new Chancellor("Preethi", 42,4))))));
        List<Staff> staff8 = new ArrayList<>();
        staff8.add(new Staff("Esha", "HR", new Detail("6yrs", 51000, new Education("MBA", "Christ", new University("BU", 23000, new Chancellor("Anitha", 60,30))))));
        staff8.add(new Staff("Feroz", "Accounts", new Detail("4yrs", 45000, new Education("BCom", "JNC", new University("BU", 21000, new Chancellor("Ravi",  52,45))))));
        List<Staff> staff9 = new ArrayList<>();
        staff9.add(new Staff("Geetha", "Finance", new Detail("5yrs", 47000, new Education("MCom", "St. Josephs", new University("BU", 28000, new Chancellor("Meera",  58,10))))));
        staff9.add(new Staff("Harsha", "Tax", new Detail("3yrs", 36000, new Education("CA", "Bangalore Univ", new University("BU", 29000, new Chancellor("Kumar", 32,45))))));
        List<Staff> staff10 = new ArrayList<>();
        staff10.add(new Staff("Indira", "OS", new Detail("2.5yrs", 30000, new Education("MCA", "BIT", new University("BU", 22000, new Chancellor("Rachna",  90,60))))));
        staff10.add(new Staff("Jeevan", "C++", new Detail("2yrs", 27000, new Education("BCA", "NMIT", new University("VTU", 21000, new Chancellor("Suraj",  25,4))))));
        List<Staff> staff11 = new ArrayList<>();
        staff11.add(new Staff("Karthik", "Cloud", new Detail("3yrs", 39000, new Education("BE", "MVIT", new University("VTU", 30000, new Chancellor("Chandru", 52,45))))));
        staff11.add(new Staff("Lavanya", "DevOps", new Detail("2yrs", 31000, new Education("BTech", "REVA", new University("VTU", 27000, new Chancellor("Shanthi",  42,4))))));
        List<Staff> staff12 = new ArrayList<>();
        staff12.add(new Staff("Ravi", "Circuits", new Detail("4yrs", 45000, new Education("BE", "IET", new University("AKTU", 42000, new Chancellor("Alok",  40,6))))));
        staff12.add(new Staff("Sneha", "Digital", new Detail("3.5yrs", 42000, new Education("BTech", "GIT", new University("AKTU", 39000, new Chancellor("Alok",  32,45))))));
        staff12.add(new Staff("Kavya", "DSP", new Detail("2yrs", 38000, new Education("BSc", "MIT", new University("AKTU", 31000, new Chancellor("Alok", 20,1))))));
        staff12.add(new Staff("Surya", "Logic", new Detail("5yrs", 47000, new Education("ME", "IITK", new University("AKTU", 44000, new Chancellor("Alok",  22,1))))));
        List<Staff> staff13 = new ArrayList<>();
        staff13.add(new Staff("Manu", "AI Core", new Detail("6yrs", 51000, new Education("MCA", "Amity", new University("AMU", 61000, new Chancellor("Neha",  52,45))))));
        staff13.add(new Staff("Amit", "ML Apps", new Detail("3yrs", 43000, new Education("MSc", "SMIT", new University("AMU", 58000, new Chancellor("Neha", 32,45))))));
        staff13.add(new Staff("Zoya", "Vision", new Detail("4.5yrs", 46000, new Education("BTech", "IMS", new University("AMU", 60000, new Chancellor("Neha", 42,4))))));
        staff13.add(new Staff("Tarun", "NLP", new Detail("2yrs", 39000, new Education("BE", "ITM", new University("AMU", 55000, new Chancellor("Neha", 20,7))))));
        List<Staff> staff14 = new ArrayList<>();
        staff14.add(new Staff("Deepa", "Design", new Detail("3yrs", 40000, new Education("BFA", "LU", new University("LUU", 30000, new Chancellor("Ravi",  32,45))))));
        staff14.add(new Staff("Megha", "Art Lab", new Detail("2.5yrs", 37000, new Education("MFA", "BHU", new University("LUU", 32000, new Chancellor("Ravi",  25,4))))));
        staff14.add(new Staff("Nikhil", "UI", new Detail("4yrs", 41000, new Education("BCA", "IGNOU", new University("LUU", 34000, new Chancellor("Ravi", 23,5))))));
        staff14.add(new Staff("Rashmi", "UX", new Detail("5yrs", 45000, new Education("BA", "DU", new University("LUU", 35000, new Chancellor("Ravi", 32,45))))));
        List<Staff> staff15 = new ArrayList<>();
        staff15.add(new Staff("Karan", "Fluid Mech", new Detail("6yrs", 52000, new Education("BE", "KIT", new University("IITK", 70000, new Chancellor("Jaya", 25,6))))));
        staff15.add(new Staff("Simran", "Thermal", new Detail("4yrs", 47000, new Education("ME", "NIET", new University("IITK", 69000, new Chancellor("Jaya", 32,45))))));
        staff15.add(new Staff("Harsh", "AutoCAD", new Detail("3yrs", 43000, new Education("Diploma", "UPTU", new University("IITK", 66000, new Chancellor("Jaya", 52,45))))));
        staff15.add(new Staff("Divya", "Mech Tools", new Detail("5yrs", 48000, new Education("BE", "JNTU", new University("IITK", 71000, new Chancellor("Jaya", 52,5))))));
        List<Staff> staff16 = new ArrayList<>();
        staff16.add(new Staff("Rekha", "Pharma", new Detail("4yrs", 44000, new Education("BPharm", "SMS", new University("HNU", 50000, new Chancellor("Shaam", 32,45))))));
        staff16.add(new Staff("Pradeep", "Biochem", new Detail("3yrs", 41000, new Education("BSc", "IMS", new University("HNU", 47000, new Chancellor("Shaam",  52,45))))));
        staff16.add(new Staff("Arun", "Microbio", new Detail("5yrs", 47000, new Education("MSc", "LU", new University("HNU", 49000, new Chancellor("Shaam", 32,45))))));
        staff16.add(new Staff("Jyoti", "Med Research", new Detail("2.5yrs", 39000, new Education("BPharm", "BHU", new University("HNU", 46000, new Chancellor("Shaam", 42,4))))));
        List<Staff> staff17 = new ArrayList<>();
        staff17.add(new Staff("Bhavya", "Civ Law", new Detail("4.5yrs", 43000, new Education("LLB", "IIL", new University("BLU", 48000, new Chancellor("Preet", 25,4))))));
        staff17.add(new Staff("Sahil", "Crim Law", new Detail("3yrs", 40000, new Education("BA", "SMIT", new University("BLU", 45000, new Chancellor("Preet", 52,45))))));
        staff17.add(new Staff("Anu", "Admin Law", new Detail("6yrs", 46000, new Education("LLM", "RIL", new University("BLU", 49000, new Chancellor("Preet",  32,45))))));
        staff17.add(new Staff("Farhan", "Comp Law", new Detail("2yrs", 37000, new Education("LLB", "IIL", new University("BLU", 47000, new Chancellor("Preet",  25,4))))));



        HeadOfDepartment headofdepartment=new HeadOfDepartment("Deepak",55,staff);
        HeadOfDepartment headofdepartment1=new HeadOfDepartment("Deepak",35,staff1);
        HeadOfDepartment headofdepartment2=new HeadOfDepartment("Deepak",58,staff2);
        HeadOfDepartment headofdepartment3=new HeadOfDepartment("Deepak",85,staff3);
        HeadOfDepartment headofdepartment4=new HeadOfDepartment("Deepak",48,staff4);
        HeadOfDepartment headofdepartment5=new HeadOfDepartment("Deepak",88,staff5);
        HeadOfDepartment headofdepartment6=new HeadOfDepartment("Deepak",75,staff6);
        HeadOfDepartment headofdepartment7=new HeadOfDepartment("Deepak",48,staff7);
        HeadOfDepartment headofdepartment8=new HeadOfDepartment("Deepak",47,staff8);
        HeadOfDepartment headofdepartment9=new HeadOfDepartment("Deepak",54,staff9);
        HeadOfDepartment headofdepartment10=new HeadOfDepartment("Deepak",84,staff10);
        HeadOfDepartment headofdepartment11=new HeadOfDepartment("Deepak",78,staff11);
        HeadOfDepartment headofdepartment12=new HeadOfDepartment("Deepak",86,staff12);
        HeadOfDepartment headofdepartment13=new HeadOfDepartment("Deepak",37,staff13);
        HeadOfDepartment headofdepartment14=new HeadOfDepartment("Deepak",74,staff14);
        HeadOfDepartment headofdepartment15=new HeadOfDepartment("Deepak",43,staff15);
        HeadOfDepartment headofdepartment16=new HeadOfDepartment("Deepak",32,staff16);



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

        System.out.println("2.......");
        List<Staff> staffA = new ArrayList<>();
        staffA.add(new Staff("Amina", "Economics", new Detail("4yrs", 45000, new Education("BA", "University of Lagos", new University("UL", 30000, new Chancellor("Ndidi", 50, 12))))));
        staffA.add(new Staff("Kwame", "History", new Detail("2yrs", 28000, new Education("MA", "KNUST", new University("KNUST", 25000, new Chancellor("Kojo", 55, 15))))));
        staffA.add(new Staff("Zola", "Sociology", new Detail("3.5yrs", 35000, new Education("BA", "UCT", new University("UCT", 27000, new Chancellor("Lerato", 48, 10))))));
        staffA.add(new Staff("Thandi", "Political Science", new Detail("5yrs", 52000, new Education("MA", "WITS", new University("WITS", 31000, new Chancellor("Sipho", 53, 13))))));
        List<Staff> staffB = new ArrayList<>();
        staffB.add(new Staff("Juma", "Finance", new Detail("6yrs", 60000, new Education("MBA", "UoN", new University("UoN", 35000, new Chancellor("Wanjiku", 60, 20))))));
        staffB.add(new Staff("Eshe", "Accounts", new Detail("1.5yrs", 25000, new Education("BCom", "Makerere", new University("MU", 24000, new Chancellor("Sanyu", 52, 11))))));
        staffB.add(new Staff("Tariq", "Marketing", new Detail("3yrs", 39000, new Education("BBM", "AAU", new University("AAU", 26000, new Chancellor("Kebede", 49, 10))))));
        staffB.add(new Staff("Nala", "Operations", new Detail("2yrs", 34000, new Education("BBA", "RU", new University("RU", 28000, new Chancellor("Achieng", 47, 9))))));
        List<Staff> staffC = new ArrayList<>();
        staffC.add(new Staff("Biko", "Computer Science", new Detail("4.5yrs", 48000, new Education("BSc", "UWC", new University("UWC", 32000, new Chancellor("Zanele", 55, 14))))));
        staffC.add(new Staff("Fatou", "AI", new Detail("2yrs", 31000, new Education("MTech", "UG", new University("UG", 30000, new Chancellor("Kwabena", 51, 13))))));
        staffC.add(new Staff("Yemi", "Machine Learning", new Detail("3.5yrs", 42000, new Education("BTech", "KNUST", new University("KNUST", 29000, new Chancellor("Ama", 50, 12))))));
        staffC.add(new Staff("Nuru", "Software Eng", new Detail("1.5yrs", 29000, new Education("MCA", "UL", new University("UL", 28000, new Chancellor("Zuberi", 45, 10))))));

        HeadOfDepartment hodA = new HeadOfDepartment("Dr. Okafor", 50, staffA);
        HeadOfDepartment hodB = new HeadOfDepartment("Prof. Seko", 58, staffB);
        HeadOfDepartment hodC = new HeadOfDepartment("Dr. Amara", 46, staffC);

        Department deptA = new Department("Social Sciences", 3, hodA);
        Department deptB = new Department("Commerce", 2, hodB);
        Department deptC = new Department("Computer Engineering", 4, hodC);

        List<Portfolio> africaPortfolios1 = new ArrayList<>();
        africaPortfolios1.add(new Portfolio("Education Minister", 2, deptA));
        africaPortfolios1.add(new Portfolio("Finance Minister", 1, deptB));

        List<Portfolio> africaPortfolios2 = new ArrayList<>();
        africaPortfolios2.add(new Portfolio("Technology Minister", 3, deptC));
        africaPortfolios2.add(new Portfolio("Social Welfare", 1, deptA));

        List<Portfolio> africaPortfolios3 = new ArrayList<>();
        africaPortfolios3.add(new Portfolio("Innovation & Development", 4, deptC));
        africaPortfolios3.add(new Portfolio("Trade Affairs", 2, deptB));

        List<Minister> ministersAfrica1 = new ArrayList<>();
        ministersAfrica1.add(new Minister("Ngozi", "Unity Party", africaPortfolios1));
        ministersAfrica1.add(new Minister("Kofi", "Progressive Party", africaPortfolios2));
        ministersAfrica1.add(new Minister("Zahara", "Green Front", africaPortfolios3));

        List<Minister> ministersAfrica2 = new ArrayList<>();
        ministersAfrica2.add(new Minister("Mandisa", "People's Voice", africaPortfolios2));
        ministersAfrica2.add(new Minister("Temba", "Action Party", africaPortfolios1));
        ministersAfrica2.add(new Minister("Oba", "New Dawn", africaPortfolios3));

        List<Minister> ministersAfrica3 = new ArrayList<>();
        ministersAfrica3.add(new Minister("Sefu", "United Vision", africaPortfolios3));
        ministersAfrica3.add(new Minister("Halima", "Future Alliance", africaPortfolios1));
        ministersAfrica3.add(new Minister("Rashid", "Change Movement", africaPortfolios2));

        List<State> africanStates = new ArrayList<>();
        africanStates.add(new State("Nigeria", 562000, ministersAfrica1));
        africanStates.add(new State("South Africa", 459000, ministersAfrica2));
        africanStates.add(new State("Kenya", 395000, ministersAfrica3));

        Country country1 = new Country("Africa", 45, africanStates);


        System.out.println("3..");
        List<Staff> staffR1 = new ArrayList<>();
        staffR1.add(new Staff("Nikolai", "Mechanical Engg", new Detail("5yrs", 48000, new Education("BE", "Moscow State Technical Univ", new University("MSTU", 32000, new Chancellor("Petrov", 58, 18))))));
        staffR1.add(new Staff("Svetlana", "Electrical", new Detail("3yrs", 36000, new Education("Diploma", "St. Petersburg Polytechnic", new University("SPPU", 30000, new Chancellor("Ivanova", 54, 16))))));
        staffR1.add(new Staff("Dmitri", "Mining", new Detail("4yrs", 42000, new Education("BTech", "Ural Federal University", new University("UFU", 29500, new Chancellor("Volkov", 52, 15))))));
        staffR1.add(new Staff("Ekaterina", "Geology", new Detail("2yrs", 31000, new Education("BSc", "Novosibirsk State Univ", new University("NSU", 28500, new Chancellor("Sokolova", 49, 12))))));

        List<Staff> staffR2 = new ArrayList<>();
        staffR2.add(new Staff("Andrei", "Economics", new Detail("6yrs", 51000, new Education("MA", "Higher School of Economics", new University("HSE", 34000, new Chancellor("Lebedev", 60, 19))))));
        staffR2.add(new Staff("Irina", "Banking", new Detail("1.5yrs", 27000, new Education("BCom", "Bauman Moscow State Tech", new University("BMSTU", 31000, new Chancellor("Zaitseva", 53, 14))))));
        staffR2.add(new Staff("Alexei", "Business", new Detail("3yrs", 39000, new Education("MBA", "Kazan Federal Univ", new University("KFU", 30500, new Chancellor("Gusev", 50, 13))))));
        staffR2.add(new Staff("Anastasia", "Finance", new Detail("2.5yrs", 35000, new Education("BBM", "Siberian Federal Univ", new University("SFU", 28000, new Chancellor("Koroleva", 47, 10))))));

        List<Staff> staffR3 = new ArrayList<>();
        staffR3.add(new Staff("Sergei", "IT", new Detail("4yrs", 47000, new Education("MSc", "Tomsk State University", new University("TSU", 33000, new Chancellor("Fedorov", 57, 17))))));
        staffR3.add(new Staff("Olga", "Data Science", new Detail("2yrs", 32000, new Education("MTech", "Moscow Engineering Physics Inst", new University("MEPhI", 32000, new Chancellor("Smirnova", 51, 12))))));
        staffR3.add(new Staff("Maxim", "Cybersecurity", new Detail("3.5yrs", 41000, new Education("BTech", "ITMO Univ", new University("ITMO", 30000, new Chancellor("Orlov", 48, 11))))));
        staffR3.add(new Staff("Tatiana", "AI", new Detail("1.8yrs", 29500, new Education("MCA", "Southern Federal Univ", new University("SFedU", 28500, new Chancellor("Morozova", 46, 10))))));

        HeadOfDepartment hodR1 = new HeadOfDepartment("Prof. Ivanov", 55, staffR1);
        HeadOfDepartment hodR2 = new HeadOfDepartment("Dr. Romanova", 52, staffR2);
        HeadOfDepartment hodR3 = new HeadOfDepartment("Dr. Kuznetsov", 49, staffR3);

        Department deptR1 = new Department("Engineering", 3, hodR1);
        Department deptR2 = new Department("Finance & Economics", 2, hodR2);
        Department deptR3 = new Department("Computer Science", 4, hodR3);

        List<Portfolio> russiaPortfolios1 = new ArrayList<>();
        russiaPortfolios1.add(new Portfolio("Science Minister", 2, deptR1));
        russiaPortfolios1.add(new Portfolio("Finance Minister", 1, deptR2));

        List<Portfolio> russiaPortfolios2 = new ArrayList<>();
        russiaPortfolios2.add(new Portfolio("Technology Affairs", 3, deptR3));
        russiaPortfolios2.add(new Portfolio("Social Development", 1, deptR1));

        List<Portfolio> russiaPortfolios3 = new ArrayList<>();
        russiaPortfolios3.add(new Portfolio("Digital Innovations", 4, deptR3));
        russiaPortfolios3.add(new Portfolio("Trade and Commerce", 2, deptR2));

        List<Minister> ministersRussia1 = new ArrayList<>();
        ministersRussia1.add(new Minister("Natalia", "Unity Russia", russiaPortfolios1));
        ministersRussia1.add(new Minister("Oleg", "People's Bloc", russiaPortfolios2));
        ministersRussia1.add(new Minister("Ludmila", "Green Alliance", russiaPortfolios3));

        List<Minister> ministersRussia2 = new ArrayList<>();
        ministersRussia2.add(new Minister("Yuri", "Progressive Front", russiaPortfolios2));
        ministersRussia2.add(new Minister("Marina", "Action League", russiaPortfolios1));
        ministersRussia2.add(new Minister("Igor", "New Reformers", russiaPortfolios3));

        List<Minister> ministersRussia3 = new ArrayList<>();
        ministersRussia3.add(new Minister("Viktor", "Solidarity Party", russiaPortfolios3));
        ministersRussia3.add(new Minister("Elena", "Forward Together", russiaPortfolios1));
        ministersRussia3.add(new Minister("Pavel", "Modern Vision", russiaPortfolios2));

        List<State> russianStates = new ArrayList<>();
        russianStates.add(new State("Moscow Oblast", 720000, ministersRussia1));
        russianStates.add(new State("Saint Petersburg", 610000, ministersRussia2));
        russianStates.add(new State("Tatarstan", 530000, ministersRussia3));

        Country country2 = new Country("Russia", 85, russianStates);

        List<Staff> staffSL1 = new ArrayList<>();
        staffSL1.add(new Staff("Nimal", "Civil Engg", new Detail("4yrs", 37000, new Education("BE", "University of Moratuwa", new University("UoM", 29000, new Chancellor("Ruwan", 55, 15))))));
        staffSL1.add(new Staff("Kumari", "Mechanical", new Detail("2yrs", 31000, new Education("Diploma", "Ruhuna University", new University("RU", 27500, new Chancellor("Shanika", 50, 13))))));
        staffSL1.add(new Staff("Pradeep", "Survey", new Detail("3.5yrs", 34000, new Education("BTech", "University of Peradeniya", new University("UoP", 28000, new Chancellor("Wijesiri", 52, 12))))));
        staffSL1.add(new Staff("Ishara", "Planning", new Detail("2.5yrs", 32000, new Education("BSc", "South Eastern University", new University("SEUSL", 26000, new Chancellor("Dilani", 49, 11))))));

        List<Staff> staffSL2 = new ArrayList<>();
        staffSL2.add(new Staff("Janaka", "Commerce", new Detail("6yrs", 46000, new Education("MA", "University of Colombo", new University("UoC", 31000, new Chancellor("Rathnayake", 58, 18))))));
        staffSL2.add(new Staff("Yasodhara", "Accountancy", new Detail("1.5yrs", 27000, new Education("BCom", "Wayamba University", new University("WUSL", 27000, new Chancellor("Thilaka", 47, 10))))));
        staffSL2.add(new Staff("Sandun", "Banking", new Detail("3yrs", 35000, new Education("MBA", "Sabaragamuwa Univ", new University("SUSL", 26500, new Chancellor("Malith", 48, 12))))));
        staffSL2.add(new Staff("Rashmi", "MicroFinance", new Detail("2yrs", 29500, new Education("BBM", "Uva Wellassa University", new University("UWU", 25500, new Chancellor("Chamari", 45, 9))))));

        List<Staff> staffSL3 = new ArrayList<>();
        staffSL3.add(new Staff("Mahen", "IT", new Detail("5yrs", 40000, new Education("MSc", "Informatics Institute of Tech", new University("IIT", 30000, new Chancellor("Ashan", 53, 14))))));
        staffSL3.add(new Staff("Tharushi", "AI", new Detail("2yrs", 31000, new Education("MCA", "Open University of SL", new University("OUSL", 29000, new Chancellor("Bimsara", 46, 11))))));
        staffSL3.add(new Staff("Roshan", "Data Analytics", new Detail("4yrs", 38000, new Education("MTech", "Sri Lanka Inst. of Info Tech", new University("SLIIT", 29500, new Chancellor("Harsha", 51, 13))))));
        staffSL3.add(new Staff("Nadeesha", "DevOps", new Detail("1.8yrs", 28500, new Education("BSc", "NSBM Green University", new University("NSBM", 28000, new Chancellor("Sunethra", 44, 10))))));

        HeadOfDepartment hodSL1 = new HeadOfDepartment("Prof. Seneviratne", 54, staffSL1);
        HeadOfDepartment hodSL2 = new HeadOfDepartment("Dr. Weerakoon", 52, staffSL2);
        HeadOfDepartment hodSL3 = new HeadOfDepartment("Dr. Alwis", 48, staffSL3);

        Department deptSL1 = new Department("Civil & Mechanical", 2, hodSL1);
        Department deptSL2 = new Department("Finance", 3, hodSL2);
        Department deptSL3 = new Department("Information Tech", 4, hodSL3);

        List<Portfolio> slPortfolios1 = new ArrayList<>();
        slPortfolios1.add(new Portfolio("Public Infrastructure", 2, deptSL1));
        slPortfolios1.add(new Portfolio("National Finance", 1, deptSL2));

        List<Portfolio> slPortfolios2 = new ArrayList<>();
        slPortfolios2.add(new Portfolio("Digital Affairs", 3, deptSL3));
        slPortfolios2.add(new Portfolio("Health Services", 1, deptSL1));

        List<Portfolio> slPortfolios3 = new ArrayList<>();
        slPortfolios3.add(new Portfolio("Innovation & R&D", 4, deptSL3));
        slPortfolios3.add(new Portfolio("Trade & Economy", 2, deptSL2));

        List<Minister> ministersSL1 = new ArrayList<>();
        ministersSL1.add(new Minister("Chaminda", "People's Unity", slPortfolios1));
        ministersSL1.add(new Minister("Sajini", "Progress Front", slPortfolios2));
        ministersSL1.add(new Minister("Indika", "Green Movement", slPortfolios3));

        List<Minister> ministersSL2 = new ArrayList<>();
        ministersSL2.add(new Minister("Suranga", "Youth Reform Party", slPortfolios2));
        ministersSL2.add(new Minister("Dilani", "Future Vision", slPortfolios1));
        ministersSL2.add(new Minister("Ruwanthi", "Lanka Alliance", slPortfolios3));

        List<Minister> ministersSL3 = new ArrayList<>();
        ministersSL3.add(new Minister("Prasanna", "Sri Lanka Development Party", slPortfolios3));
        ministersSL3.add(new Minister("Sithara", "New Nation League", slPortfolios1));
        ministersSL3.add(new Minister("Ranjith", "Forward Lanka", slPortfolios2));

        List<State> sriLankaStates = new ArrayList<>();
        sriLankaStates.add(new State("Western Province", 620000, ministersSL1));
        sriLankaStates.add(new State("Central Province", 530000, ministersSL2));
        sriLankaStates.add(new State("Southern Province", 510000, ministersSL3));

        Country country3 = new Country("Sri Lanka", 9, sriLankaStates);

        List<Staff> staffNP1 = new ArrayList<>();
        staffNP1.add(new Staff("Ramesh", "Civil Engg", new Detail("5yrs", 36000, new Education("BE", "Pulchowk Engineering Campus", new University("IOE", 27000, new Chancellor("Sushil", 53, 13))))));
        staffNP1.add(new Staff("Bina", "Mechanical", new Detail("2.5yrs", 31500, new Education("Diploma", "Kathmandu University", new University("KU", 26000, new Chancellor("Nirupa", 50, 12))))));
        staffNP1.add(new Staff("Kamal", "Electrical", new Detail("3yrs", 33500, new Education("BTech", "Pokhara University", new University("PU", 25000, new Chancellor("Dinesh", 52, 10))))));
        staffNP1.add(new Staff("Meena", "Planning", new Detail("1.5yrs", 29000, new Education("BSc", "Purbanchal University", new University("PU", 24000, new Chancellor("Radha", 47, 9))))));

        List<Staff> staffNP2 = new ArrayList<>();
        staffNP2.add(new Staff("Ganesh", "Accounting", new Detail("4.5yrs", 42000, new Education("BCom", "Tribhuvan University", new University("TU", 29000, new Chancellor("Mahendra", 55, 15))))));
        staffNP2.add(new Staff("Sunita", "Finance", new Detail("2yrs", 31000, new Education("MBA", "Mid-Western University", new University("MWU", 26000, new Chancellor("Keshari", 48, 11))))));
        staffNP2.add(new Staff("Dipak", "Banking", new Detail("3.5yrs", 34500, new Education("BBA", "Far Western University", new University("FWU", 25000, new Chancellor("Tulasi", 50, 12))))));
        staffNP2.add(new Staff("Manisha", "Taxation", new Detail("1.8yrs", 30000, new Education("BBM", "Lumbini Buddhist University", new University("LBU", 23000, new Chancellor("Hemanta", 46, 10))))));

        List<Staff> staffNP3 = new ArrayList<>();
        staffNP3.add(new Staff("Sudip", "Software", new Detail("5.5yrs", 44000, new Education("MSc", "Kathmandu University", new University("KU", 29500, new Chancellor("Krishna", 54, 14))))));
        staffNP3.add(new Staff("Ritika", "AI Research", new Detail("3yrs", 33000, new Education("MCA", "Tribhuvan University", new University("TU", 28000, new Chancellor("Milan", 49, 11))))));
        staffNP3.add(new Staff("Prajwal", "DevOps", new Detail("2yrs", 30500, new Education("BSc", "Pokhara University", new University("PU", 27000, new Chancellor("Arjun", 51, 13))))));
        staffNP3.add(new Staff("Asmita", "UI/UX", new Detail("1.6yrs", 28500, new Education("BSc", "Purbanchal University", new University("PU", 26000, new Chancellor("Sabina", 45, 10))))));

        HeadOfDepartment hodNP1 = new HeadOfDepartment("Prof. K.C. Basnet", 56, staffNP1);
        HeadOfDepartment hodNP2 = new HeadOfDepartment("Dr. Sita Thapa", 53, staffNP2);
        HeadOfDepartment hodNP3 = new HeadOfDepartment("Dr. Milan Gurung", 50, staffNP3);

        Department deptNP1 = new Department("Engineering", 3, hodNP1);
        Department deptNP2 = new Department("Finance", 2, hodNP2);
        Department deptNP3 = new Department("Technology", 4, hodNP3);

        List<Portfolio> npPortfolios1 = new ArrayList<>();
        npPortfolios1.add(new Portfolio("Public Infrastructure", 2, deptNP1));
        npPortfolios1.add(new Portfolio("Revenue and Tax", 1, deptNP2));

        List<Portfolio> npPortfolios2 = new ArrayList<>();
        npPortfolios2.add(new Portfolio("Digital Services", 4, deptNP3));
        npPortfolios2.add(new Portfolio("Public Health", 2, deptNP1));

        List<Portfolio> npPortfolios3 = new ArrayList<>();
        npPortfolios3.add(new Portfolio("Science & Tech", 3, deptNP3));
        npPortfolios3.add(new Portfolio("Trade & Exports", 2, deptNP2));

        List<Minister> ministersNP1 = new ArrayList<>();
        ministersNP1.add(new Minister("Prakash", "Nepali Jana Party", npPortfolios1));
        ministersNP1.add(new Minister("Sarmila", "United Vision Party", npPortfolios2));
        ministersNP1.add(new Minister("Binod", "Progressive Forum", npPortfolios3));

        List<Minister> ministersNP2 = new ArrayList<>();
        ministersNP2.add(new Minister("Yam", "Reform Nepal", npPortfolios2));
        ministersNP2.add(new Minister("Kabita", "National Growth Party", npPortfolios1));
        ministersNP2.add(new Minister("Gokarna", "Federal Alliance", npPortfolios3));

        List<Minister> ministersNP3 = new ArrayList<>();
        ministersNP3.add(new Minister("Aayush", "Innovation First Party", npPortfolios3));
        ministersNP3.add(new Minister("Pabitra", "Youth Movement Nepal", npPortfolios1));
        ministersNP3.add(new Minister("Rajan", "United People's Party", npPortfolios2));

        List<State> nepalStates = new ArrayList<>();
        nepalStates.add(new State("Bagmati Pradesh", 480000, ministersNP1));
        nepalStates.add(new State("Gandaki Pradesh", 420000, ministersNP2));
        nepalStates.add(new State("Lumbini Pradesh", 390000, ministersNP3));

        Country country4 = new Country("Nepal", 7, nepalStates);

        List<Staff> staffMM1 = new ArrayList<>();
        staffMM1.add(new Staff("Thura", "Civil Works", new Detail("4yrs", 34000, new Education("BE", "Yangon Technological University", new University("YTU", 26000, new Chancellor("U Win Hlaing", 58, 14))))));
        staffMM1.add(new Staff("Hnin", "Mechanical", new Detail("2.2yrs", 30000, new Education("Diploma", "Mandalay Technological University", new University("MTU", 24500, new Chancellor("Daw Su Su", 52, 12))))));
        staffMM1.add(new Staff("Aung", "Survey", new Detail("3.5yrs", 32500, new Education("BSc", "Technological University Hmawbi", new University("TUH", 23800, new Chancellor("U Zaw Min", 50, 11))))));
        staffMM1.add(new Staff("Khin", "Water Management", new Detail("1.8yrs", 28800, new Education("BEng", "Technological University Kyaukse", new University("TUK", 23000, new Chancellor("Daw Thin Thin", 47, 9))))));

        List<Staff> staffMM2 = new ArrayList<>();
        staffMM2.add(new Staff("Moe", "Tax Officer", new Detail("5yrs", 41500, new Education("BCom", "Yangon University of Economics", new University("YUE", 27000, new Chancellor("U Kyaw Zin", 54, 13))))));
        staffMM2.add(new Staff("Ei Mon", "Finance Audit", new Detail("2.5yrs", 31000, new Education("MBA", "Mandalay University", new University("MU", 25000, new Chancellor("Daw Thet Htar", 49, 10))))));
        staffMM2.add(new Staff("Nyein", "Accountancy", new Detail("3yrs", 33500, new Education("BBM", "Dagon University", new University("DU", 24000, new Chancellor("U Tin Myo", 48, 11))))));
        staffMM2.add(new Staff("Su", "Revenue Analysis", new Detail("1.6yrs", 29500, new Education("BBA", "East Yangon University", new University("EYU", 22000, new Chancellor("Daw Thandar", 45, 9))))));

        List<Staff> staffMM3 = new ArrayList<>();
        staffMM3.add(new Staff("Zaw", "Software", new Detail("6yrs", 45500, new Education("MSc", "University of Computer Studies, Yangon", new University("UCSY", 28000, new Chancellor("U Hlaing Bwar", 57, 15))))));
        staffMM3.add(new Staff("Cherry", "AI Systems", new Detail("3.5yrs", 33500, new Education("MTech", "University of Computer Studies, Mandalay", new University("UCSM", 26500, new Chancellor("Daw May Thu", 51, 12))))));
        staffMM3.add(new Staff("Ko Ko", "Cyber Security", new Detail("2yrs", 31000, new Education("BSc", "Technological University Meiktila", new University("TUM", 25500, new Chancellor("U Khin Maung", 49, 11))))));
        staffMM3.add(new Staff("Htet", "Mobile Dev", new Detail("1.7yrs", 28000, new Education("BSc", "University of Computer Studies Sittwe", new University("UCS-S", 24000, new Chancellor("Daw Nandar", 46, 10))))));

        HeadOfDepartment hodMM1 = new HeadOfDepartment("Prof. Kyaing Soe", 56, staffMM1);
        HeadOfDepartment hodMM2 = new HeadOfDepartment("Dr. Mya Mya Than", 52, staffMM2);
        HeadOfDepartment hodMM3 = new HeadOfDepartment("Dr. Aung Moe", 53, staffMM3);

        Department deptMM1 = new Department("Construction", 3, hodMM1);
        Department deptMM2 = new Department("Finance", 2, hodMM2);
        Department deptMM3 = new Department("ICT", 4, hodMM3);

        List<Portfolio> mmPortfolios1 = new ArrayList<>();
        mmPortfolios1.add(new Portfolio("Roads & Bridges", 2, deptMM1));
        mmPortfolios1.add(new Portfolio("Revenue Dept", 1, deptMM2));

        List<Portfolio> mmPortfolios2 = new ArrayList<>();
        mmPortfolios2.add(new Portfolio("Digital Governance", 3, deptMM3));
        mmPortfolios2.add(new Portfolio("Transport Planning", 2, deptMM1));

        List<Portfolio> mmPortfolios3 = new ArrayList<>();
        mmPortfolios3.add(new Portfolio("Software Innovation", 3, deptMM3));
        mmPortfolios3.add(new Portfolio("Foreign Investment", 2, deptMM2));

        List<Minister> ministersMM1 = new ArrayList<>();
        ministersMM1.add(new Minister("Min Zaw", "Unity Development Party", mmPortfolios1));
        ministersMM1.add(new Minister("Thandar", "National Peace Alliance", mmPortfolios2));
        ministersMM1.add(new Minister("Htun Htun", "Progress Myanmar Party", mmPortfolios3));

        List<Minister> ministersMM2 = new ArrayList<>();
        ministersMM2.add(new Minister("Soe Win", "Economic Reform Party", mmPortfolios2));
        ministersMM2.add(new Minister("Lwin", "Green Future Party", mmPortfolios1));
        ministersMM2.add(new Minister("Than Than", "People’s League", mmPortfolios3));

        List<Minister> ministersMM3 = new ArrayList<>();
        ministersMM3.add(new Minister("Khine", "Smart Nation Union", mmPortfolios3));
        ministersMM3.add(new Minister("Moe Moe", "Rural Voice Alliance", mmPortfolios1));
        ministersMM3.add(new Minister("Khin Zaw", "Democratic Youth Force", mmPortfolios2));

        List<State> myanmarStates = new ArrayList<>();
        myanmarStates.add(new State("Yangon Region", 520000, ministersMM1));
        myanmarStates.add(new State("Mandalay Region", 460000, ministersMM2));
        myanmarStates.add(new State("Ayeyarwady Region", 400000, ministersMM3));

        Country country5 = new Country("Myanmar", 7, myanmarStates);


        List<Staff> staffIL1 = new ArrayList<>();
        staffIL1.add(new Staff("Yael", "Urban Planning", new Detail("4.5yrs", 35500, new Education("MUP", "Technion – Israel Institute of Technology", new University("Technion", 28500, new Chancellor("David Cohen", 60, 15))))));
        staffIL1.add(new Staff("Noam", "Structural", new Detail("2yrs", 30500, new Education("BEng", "Tel Aviv University", new University("TAU", 27000, new Chancellor("Rina Shalev", 55, 13))))));
        staffIL1.add(new Staff("Amit", "Architecture", new Detail("3.2yrs", 32800, new Education("BArch", "Bezalel Academy", new University("Bezalel", 25000, new Chancellor("Moshe Levi", 53, 12))))));
        staffIL1.add(new Staff("Eden", "Land Survey", new Detail("1.9yrs", 28900, new Education("Diploma", "Ariel University", new University("ArielU", 23000, new Chancellor("Tamar Harel", 49, 11))))));

        List<Staff> staffIL2 = new ArrayList<>();
        staffIL2.add(new Staff("Lior", "Tax Policy", new Detail("5.2yrs", 42000, new Education("MCom", "Hebrew University", new University("HUJI", 29000, new Chancellor("Nadav Gold", 58, 14))))));
        staffIL2.add(new Staff("Shira", "Audit", new Detail("2.8yrs", 32000, new Education("MBA", "Bar-Ilan University", new University("BIU", 26500, new Chancellor("Zohar Ben", 52, 11))))));
        staffIL2.add(new Staff("Dan", "Gov Accounts", new Detail("3.1yrs", 33800, new Education("BBM", "University of Haifa", new University("UoH", 25500, new Chancellor("Eli Naveh", 50, 10))))));
        staffIL2.add(new Staff("Talia", "Budget Review", new Detail("1.7yrs", 29800, new Education("BBA", "Sapir Academic College", new University("SAC", 22500, new Chancellor("Orli Meir", 46, 9))))));

        List<Staff> staffIL3 = new ArrayList<>();
        staffIL3.add(new Staff("Ronen", "IT Systems", new Detail("6.3yrs", 46000, new Education("MSc", "Weizmann Institute", new University("WIS", 29500, new Chancellor("Yaakov Sinai", 59, 15))))));
        staffIL3.add(new Staff("Tamar", "AI Integration", new Detail("3.6yrs", 34000, new Education("MTech", "Technion", new University("Technion", 27500, new Chancellor("Dror Ziv", 54, 13))))));
        staffIL3.add(new Staff("Gil", "Cyber Defense", new Detail("2.1yrs", 31200, new Education("BSc", "IDC Herzliya", new University("IDC", 26000, new Chancellor("Dana Raviv", 51, 11))))));
        staffIL3.add(new Staff("Rivka", "App Dev", new Detail("1.8yrs", 28200, new Education("BCA", "Open University of Israel", new University("OUI", 24000, new Chancellor("Ilana Peled", 47, 10))))));

        HeadOfDepartment hodIL1 = new HeadOfDepartment("Prof. Erez Shimon", 57, staffIL1);
        HeadOfDepartment hodIL2 = new HeadOfDepartment("Dr. Gila Levi", 54, staffIL2);
        HeadOfDepartment hodIL3 = new HeadOfDepartment("Dr. Amos Natan", 56, staffIL3);

        Department deptIL1 = new Department("Urban Development", 3, hodIL1);
        Department deptIL2 = new Department("Public Finance", 2, hodIL2);
        Department deptIL3 = new Department("Technology & Data", 4, hodIL3);

        List<Portfolio> ilPortfolios1 = new ArrayList<>();
        ilPortfolios1.add(new Portfolio("Infrastructure & Housing", 2, deptIL1));
        ilPortfolios1.add(new Portfolio("Revenue & Tax", 1, deptIL2));

        List<Portfolio> ilPortfolios2 = new ArrayList<>();
        ilPortfolios2.add(new Portfolio("E-Government", 3, deptIL3));
        ilPortfolios2.add(new Portfolio("Transportation Planning", 2, deptIL1));

        List<Portfolio> ilPortfolios3 = new ArrayList<>();
        ilPortfolios3.add(new Portfolio("Digital Innovation", 3, deptIL3));
        ilPortfolios3.add(new Portfolio("Foreign Affairs", 2, deptIL2));

        List<Minister> ministersIL1 = new ArrayList<>();
        ministersIL1.add(new Minister("Aviv Levi", "Labor Zionist Party", ilPortfolios1));
        ministersIL1.add(new Minister("Naomi Tzur", "Green Alliance", ilPortfolios2));
        ministersIL1.add(new Minister("Yaron Elad", "Future Vision Party", ilPortfolios3));

        List<Minister> ministersIL2 = new ArrayList<>();
        ministersIL2.add(new Minister("Ziv Ezra", "People First Party", ilPortfolios2));
        ministersIL2.add(new Minister("Adi Nir", "Eco Renewal Movement", ilPortfolios1));
        ministersIL2.add(new Minister("Batya Cohen", "United Progress Bloc", ilPortfolios3));

        List<Minister> ministersIL3 = new ArrayList<>();
        ministersIL3.add(new Minister("Yoel Dagan", "Smart Growth Party", ilPortfolios3));
        ministersIL3.add(new Minister("Nili Mor", "Citizen Voice Front", ilPortfolios1));
        ministersIL3.add(new Minister("Itai Rimon", "Innovation League", ilPortfolios2));

        List<State> israelStates = new ArrayList<>();
        israelStates.add(new State("Central District", 580000, ministersIL1));
        israelStates.add(new State("Northern District", 450000, ministersIL2));
        israelStates.add(new State("Southern District", 410000, ministersIL3));

        Country country6 = new Country("Israel", 6, israelStates);

        List<Staff> staffCH1 = new ArrayList<>();
        staffCH1.add(new Staff("Li Wei", "Infrastructure", new Detail("5yrs", 42000, new Education("BEng", "Tsinghua University", new University("THU", 30000, new Chancellor("Wang Hong", 59, 16))))));
        staffCH1.add(new Staff("Zhao Min", "Mechanical", new Detail("3yrs", 36000, new Education("Diploma", "Beihang University", new University("BUAA", 27500, new Chancellor("Liu Fang", 55, 13))))));
        staffCH1.add(new Staff("Chen Yan", "Design", new Detail("4.2yrs", 39000, new Education("BE", "Shanghai Jiao Tong University", new University("SJTU", 29000, new Chancellor("Zhou Ping", 57, 14))))));
        staffCH1.add(new Staff("Wang Qiang", "Environment", new Detail("2yrs", 32000, new Education("BSc", "Tongji University", new University("TJU", 26500, new Chancellor("Huang Mei", 53, 11))))));

        List<Staff> staffCH2 = new ArrayList<>();
        staffCH2.add(new Staff("Xu Hui", "Accounting", new Detail("5.5yrs", 44000, new Education("MBA", "Peking University", new University("PKU", 31000, new Chancellor("Gao Zhen", 60, 17))))));
        staffCH2.add(new Staff("Yang Lan", "Finance Audit", new Detail("3yrs", 37000, new Education("BBM", "Fudan University", new University("FDU", 28500, new Chancellor("Jin Li", 56, 12))))));
        staffCH2.add(new Staff("Zheng Bo", "Tax Officer", new Detail("2.5yrs", 34500, new Education("BCom", "Renmin University", new University("RUC", 27500, new Chancellor("Chen Tao", 52, 10))))));
        staffCH2.add(new Staff("Liu Ying", "Economic Planning", new Detail("1.9yrs", 31000, new Education("BA", "Sun Yat-sen University", new University("SYSU", 26000, new Chancellor("Wu Hui", 50, 9))))));

        List<Staff> staffCH3 = new ArrayList<>();
        staffCH3.add(new Staff("Zhou Lei", "IT Systems", new Detail("6yrs", 47000, new Education("MSc", "University of Science & Technology", new University("USTC", 32000, new Chancellor("Qian Fei", 58, 15))))));
        staffCH3.add(new Staff("Mei Chen", "AI Research", new Detail("4yrs", 39500, new Education("MTech", "Harbin Institute of Technology", new University("HIT", 30000, new Chancellor("Fang Wen", 54, 13))))));
        staffCH3.add(new Staff("Sun Tao", "Network Security", new Detail("2.8yrs", 34000, new Education("BSc", "Xidian University", new University("XDU", 28000, new Chancellor("Lu Bin", 51, 11))))));
        staffCH3.add(new Staff("Huang Yue", "UI/UX", new Detail("2.1yrs", 31500, new Education("BDes", "Beijing Institute of Technology", new University("BIT", 27000, new Chancellor("Zeng Lin", 49, 10))))));

        HeadOfDepartment hodCH1 = new HeadOfDepartment("Prof. Zhang Ning", 57, staffCH1);
        HeadOfDepartment hodCH2 = new HeadOfDepartment("Dr. Liu Xiu", 55, staffCH2);
        HeadOfDepartment hodCH3 = new HeadOfDepartment("Dr. Han Fang", 56, staffCH3);

        Department deptCH1 = new Department("Infrastructure", 3, hodCH1);
        Department deptCH2 = new Department("Finance", 2, hodCH2);
        Department deptCH3 = new Department("Technology", 4, hodCH3);

        List<Portfolio> chPortfolios1 = new ArrayList<>();
        chPortfolios1.add(new Portfolio("Urban Development", 2, deptCH1));
        chPortfolios1.add(new Portfolio("Budget Analysis", 1, deptCH2));

        List<Portfolio> chPortfolios2 = new ArrayList<>();
        chPortfolios2.add(new Portfolio("Smart Cities", 3, deptCH3));
        chPortfolios2.add(new Portfolio("Transport Planning", 2, deptCH1));

        List<Portfolio> chPortfolios3 = new ArrayList<>();
        chPortfolios3.add(new Portfolio("Digital Economy", 3, deptCH3));
        chPortfolios3.add(new Portfolio("Investment Strategy", 2, deptCH2));

        List<Minister> ministersCH1 = new ArrayList<>();
        ministersCH1.add(new Minister("Huang Bo", "Innovation Alliance", chPortfolios1));
        ministersCH1.add(new Minister("Li Na", "Progressive Unity", chPortfolios2));
        ministersCH1.add(new Minister("Gao Jun", "Tech Future Party", chPortfolios3));

        List<Minister> ministersCH2 = new ArrayList<>();
        ministersCH2.add(new Minister("Wang Rui", "Economic Reform Union", chPortfolios2));
        ministersCH2.add(new Minister("Zhang Xin", "National Growth Front", chPortfolios1));
        ministersCH2.add(new Minister("Chen Lei", "Civic Action Movement", chPortfolios3));

        List<Minister> ministersCH3 = new ArrayList<>();
        ministersCH3.add(new Minister("Liu Lin", "Digital Harmony Party", chPortfolios3));
        ministersCH3.add(new Minister("Tang Mei", "Rural Progress Group", chPortfolios1));
        ministersCH3.add(new Minister("He Yong", "Youth Vision Bloc", chPortfolios2));

        List<State> chinaStates = new ArrayList<>();
        chinaStates.add(new State("Beijing", 21500000, ministersCH1));
        chinaStates.add(new State("Shanghai", 24200000, ministersCH2));
        chinaStates.add(new State("Guangdong", 126000000, ministersCH3));

        Country country7 = new Country("China", 23, chinaStates);

        List<Staff> staffUS1 = new ArrayList<>();
        staffUS1.add(new Staff("Emily Carter", "Civil", new Detail("5.3yrs", 46000, new Education("BEng", "MIT", new University("Massachusetts Institute of Technology", 25000, new Chancellor("Dr. Robert Lang", 61, 17))))));
        staffUS1.add(new Staff("Daniel Evans", "Construction", new Detail("3.8yrs", 39500, new Education("Diploma", "UC Berkeley", new University("University of California", 24000, new Chancellor("Dr. Laura Chase", 57, 14))))));
        staffUS1.add(new Staff("Sarah James", "Architecture", new Detail("4.1yrs", 41000, new Education("BE", "Georgia Tech", new University("Georgia Institute of Technology", 23500, new Chancellor("Dr. Henry Shaw", 54, 13))))));
        staffUS1.add(new Staff("Joshua Reed", "Structural", new Detail("2.5yrs", 35500, new Education("BSc", "Stanford University", new University("Stanford", 27000, new Chancellor("Dr. Melissa Grant", 58, 16))))));

        List<Staff> staffUS2 = new ArrayList<>();
        staffUS2.add(new Staff("Megan Foster", "Accounts", new Detail("5.7yrs", 47000, new Education("MBA", "Harvard University", new University("Harvard", 28000, new Chancellor("Dr. Alan Blake", 60, 18))))));
        staffUS2.add(new Staff("Anthony Harris", "Audit", new Detail("3yrs", 39000, new Education("BBM", "NYU Stern", new University("New York University", 26000, new Chancellor("Dr. Rachel Lin", 56, 15))))));
        staffUS2.add(new Staff("Olivia Scott", "Revenue", new Detail("2.3yrs", 36000, new Education("BCom", "UCLA", new University("University of California, Los Angeles", 25000, new Chancellor("Dr. Ian Brooks", 55, 13))))));
        staffUS2.add(new Staff("Ethan Brooks", "Planning", new Detail("2yrs", 34000, new Education("BA", "University of Michigan", new University("U-Michigan", 24500, new Chancellor("Dr. Emily Ross", 53, 11))))));

        List<Staff> staffUS3 = new ArrayList<>();
        staffUS3.add(new Staff("Abigail Turner", "IT Infra", new Detail("6.1yrs", 48500, new Education("MSc", "Carnegie Mellon University", new University("CMU", 26000, new Chancellor("Dr. Michael Webb", 59, 16))))));
        staffUS3.add(new Staff("Christopher Allen", "AI Lead", new Detail("4yrs", 42000, new Education("MTech", "Caltech", new University("California Institute of Technology", 24000, new Chancellor("Dr. Susan Hale", 56, 14))))));
        staffUS3.add(new Staff("Grace Collins", "Data Analyst", new Detail("3.2yrs", 37500, new Education("BSc", "Purdue University", new University("Purdue", 23000, new Chancellor("Dr. Greg Moore", 52, 12))))));
        staffUS3.add(new Staff("Andrew Rivera", "UX Design", new Detail("2.4yrs", 34500, new Education("BDes", "University of Illinois", new University("UIUC", 22500, new Chancellor("Dr. Amanda Hayes", 51, 11))))));

        HeadOfDepartment hodUS1 = new HeadOfDepartment("Dr. Charles Monroe", 58, staffUS1);
        HeadOfDepartment hodUS2 = new HeadOfDepartment("Dr. Denise Hall", 57, staffUS2);
        HeadOfDepartment hodUS3 = new HeadOfDepartment("Dr. Kevin Ford", 55, staffUS3);

        Department deptUS1 = new Department("Infrastructure", 4, hodUS1);
        Department deptUS2 = new Department("Finance", 3, hodUS2);
        Department deptUS3 = new Department("Technology", 5, hodUS3);

        List<Portfolio> usPortfolios1 = new ArrayList<>();
        usPortfolios1.add(new Portfolio("Urban Infrastructure", 2, deptUS1));
        usPortfolios1.add(new Portfolio("Public Accounts", 1, deptUS2));

        List<Portfolio> usPortfolios2 = new ArrayList<>();
        usPortfolios2.add(new Portfolio("Digital USA", 3, deptUS3));
        usPortfolios2.add(new Portfolio("Transport Policy", 2, deptUS1));

        List<Portfolio> usPortfolios3 = new ArrayList<>();
        usPortfolios3.add(new Portfolio("Cyber Development", 3, deptUS3));
        usPortfolios3.add(new Portfolio("Economic Investment", 2, deptUS2));

        List<Minister> ministersUS1 = new ArrayList<>();
        ministersUS1.add(new Minister("Linda Matthews", "People's Democratic", usPortfolios1));
        ministersUS1.add(new Minister("Ryan Mitchell", "Progress Alliance", usPortfolios2));
        ministersUS1.add(new Minister("Donna Hayes", "Innovation Front", usPortfolios3));

        List<Minister> ministersUS2 = new ArrayList<>();
        ministersUS2.add(new Minister("Jason King", "Reform Party", usPortfolios2));
        ministersUS2.add(new Minister("Chloe Bennett", "Unity Bloc", usPortfolios1));
        ministersUS2.add(new Minister("Nathan Perry", "National Vision", usPortfolios3));

        List<Minister> ministersUS3 = new ArrayList<>();
        ministersUS3.add(new Minister("Laura Simmons", "Tech Forward", usPortfolios3));
        ministersUS3.add(new Minister("Tyler Dean", "Rural Policy", usPortfolios1));
        ministersUS3.add(new Minister("Kayla Morris", "Youth Movement", usPortfolios2));

        List<State> usStates = new ArrayList<>();
        usStates.add(new State("California", 39500000, ministersUS1));
        usStates.add(new State("Texas", 29000000, ministersUS2));
        usStates.add(new State("Florida", 21500000, ministersUS3));

        Country country8 = new Country("United States", 50, usStates);

        List<Staff> staffJapan1 = new ArrayList<>();
        staffJapan1.add(new Staff("Haruka Sato", "Planning", new Detail("5.2yrs", 43000, new Education("BE", "University of Tokyo", new University("University of Tokyo", 24000, new Chancellor("Dr. Kenji Nakamura", 62, 15))))));
        staffJapan1.add(new Staff("Takeshi Yamamoto", "Design", new Detail("3.6yrs", 38500, new Education("BArch", "Kyoto University", new University("Kyoto University", 23000, new Chancellor("Dr. Aiko Takahashi", 58, 14))))));
        staffJapan1.add(new Staff("Yui Tanaka", "Construction", new Detail("4yrs", 40000, new Education("Diploma", "Osaka Institute", new University("Osaka University", 21000, new Chancellor("Dr. Hiroshi Watanabe", 55, 13))))));
        staffJapan1.add(new Staff("Kenta Fujimoto", "Maintenance", new Detail("2.8yrs", 36500, new Education("BSc", "Hokkaido University", new University("Hokkaido University", 22000, new Chancellor("Dr. Naomi Ishikawa", 54, 12))))));

        List<Staff> staffJapan2 = new ArrayList<>();
        staffJapan2.add(new Staff("Misaki Kobayashi", "Revenue", new Detail("5.5yrs", 45500, new Education("BBM", "Tohoku University", new University("Tohoku University", 20000, new Chancellor("Dr. Riku Arai", 60, 16))))));
        staffJapan2.add(new Staff("Sho Yamada", "Taxation", new Detail("3yrs", 37000, new Education("MBA", "Keio University", new University("Keio University", 19000, new Chancellor("Dr. Fumiko Kondo", 59, 14))))));
        staffJapan2.add(new Staff("Aya Nakagawa", "Policy", new Detail("2.6yrs", 35000, new Education("BCom", "Nagoya University", new University("Nagoya University", 18500, new Chancellor("Dr. Kazuki Ito", 53, 12))))));
        staffJapan2.add(new Staff("Ren Takanashi", "Budget", new Detail("2.1yrs", 33000, new Education("BA", "Waseda University", new University("Waseda University", 19500, new Chancellor("Dr. Minami Ueda", 52, 11))))));

        List<Staff> staffJapan3 = new ArrayList<>();
        staffJapan3.add(new Staff("Sora Ishida", "Networks", new Detail("6yrs", 47500, new Education("MSc", "Tokyo Tech", new University("Tokyo Institute of Technology", 20500, new Chancellor("Dr. Yuto Hoshino", 57, 14))))));
        staffJapan3.add(new Staff("Mei Aoyama", "AI Systems", new Detail("4.4yrs", 42000, new Education("MTech", "Kyushu University", new University("Kyushu University", 21500, new Chancellor("Dr. Emi Hayashi", 55, 13))))));
        staffJapan3.add(new Staff("Reo Nishimura", "DevOps", new Detail("3.1yrs", 39000, new Education("BSc", "Chiba University", new University("Chiba University", 19800, new Chancellor("Dr. Kaito Fujiwara", 51, 10))))));
        staffJapan3.add(new Staff("Nanami Sugimoto", "UI/UX", new Detail("2.5yrs", 34500, new Education("BDes", "Shizuoka University", new University("Shizuoka University", 18000, new Chancellor("Dr. Ayaka Mori", 50, 9))))));

        HeadOfDepartment hodJapan1 = new HeadOfDepartment("Dr. Akira Nishida", 59, staffJapan1);
        HeadOfDepartment hodJapan2 = new HeadOfDepartment("Dr. Sakura Yamaguchi", 57, staffJapan2);
        HeadOfDepartment hodJapan3 = new HeadOfDepartment("Dr. Daiki Honda", 56, staffJapan3);

        Department deptJapan1 = new Department("Infrastructure", 4, hodJapan1);
        Department deptJapan2 = new Department("Finance", 3, hodJapan2);
        Department deptJapan3 = new Department("Technology", 5, hodJapan3);

        List<Portfolio> japanPortfolios1 = new ArrayList<>();
        japanPortfolios1.add(new Portfolio("Smart Cities", 2, deptJapan1));
        japanPortfolios1.add(new Portfolio("Public Revenue", 1, deptJapan2));

        List<Portfolio> japanPortfolios2 = new ArrayList<>();
        japanPortfolios2.add(new Portfolio("Digital Transformation", 3, deptJapan3));
        japanPortfolios2.add(new Portfolio("Transport Innovation", 2, deptJapan1));

        List<Portfolio> japanPortfolios3 = new ArrayList<>();
        japanPortfolios3.add(new Portfolio("Cyber Security", 3, deptJapan3));
        japanPortfolios3.add(new Portfolio("International Trade", 2, deptJapan2));

        List<Minister> ministersJapan1 = new ArrayList<>();
        ministersJapan1.add(new Minister("Rina Matsuda", "Liberal Union", japanPortfolios1));
        ministersJapan1.add(new Minister("Takumi Okabe", "People's Reform", japanPortfolios2));
        ministersJapan1.add(new Minister("Nao Shirai", "New Future", japanPortfolios3));

        List<Minister> ministersJapan2 = new ArrayList<>();
        ministersJapan2.add(new Minister("Satoshi Murakami", "Progressive Wave", japanPortfolios2));
        ministersJapan2.add(new Minister("Yuka Arai", "Unity Movement", japanPortfolios1));
        ministersJapan2.add(new Minister("Haruto Shimizu", "Reform Bloc", japanPortfolios3));

        List<Minister> ministersJapan3 = new ArrayList<>();
        ministersJapan3.add(new Minister("Kaho Fujii", "Digital Alliance", japanPortfolios3));
        ministersJapan3.add(new Minister("Ryusei Nomura", "National Vision", japanPortfolios1));
        ministersJapan3.add(new Minister("Asahi Ishikawa", "Green Voice", japanPortfolios2));

        List<State> japanStates = new ArrayList<>();
        japanStates.add(new State("Tokyo", 14000000, ministersJapan1));
        japanStates.add(new State("Osaka", 8800000, ministersJapan2));
        japanStates.add(new State("Hokkaido", 5300000, ministersJapan3));

        Country country9 = new Country("Japan", 47, japanStates);


        List<Staff> staffParis1 = new ArrayList<>();
        staffParis1.add(new Staff("Camille Laurent", "Urban Planning", new Detail("4.8yrs", 41500, new Education("BE", "Université Paris-Saclay", new University("Université Paris-Saclay", 23000, new Chancellor("Dr. Émile Marchand", 60, 14))))));
        staffParis1.add(new Staff("Louis Moreau", "Architecture", new Detail("3.2yrs", 39000, new Education("BArch", "Sorbonne University", new University("Sorbonne University", 21000, new Chancellor("Dr. Marie Lefèvre", 58, 13))))));
        staffParis1.add(new Staff("Juliette Robert", "Civil Works", new Detail("4yrs", 40500, new Education("Diploma", "École des Ponts", new University("École des Ponts", 20000, new Chancellor("Dr. Antoine Charpentier", 55, 12))))));
        staffParis1.add(new Staff("Mathis Blanc", "Public Infrastructure", new Detail("2.6yrs", 37000, new Education("BSc", "Grenoble INP", new University("Grenoble INP", 19000, new Chancellor("Dr. Elise Garnier", 54, 11))))));

        List<Staff> staffParis2 = new ArrayList<>();
        staffParis2.add(new Staff("Emma Rousseau", "Taxation", new Detail("5yrs", 45000, new Education("BBM", "Université de Strasbourg", new University("Université de Strasbourg", 21000, new Chancellor("Dr. Hugo Renaud", 59, 14))))));
        staffParis2.add(new Staff("Lucas Fabre", "Audit", new Detail("3.5yrs", 38000, new Education("MBA", "HEC Paris", new University("HEC Paris", 22000, new Chancellor("Dr. Anaïs Noël", 57, 13))))));
        staffParis2.add(new Staff("Chloé Giraud", "Finance", new Detail("2.9yrs", 36000, new Education("BCom", "NEOMA Business School", new University("NEOMA", 20000, new Chancellor("Dr. Bastien Dufour", 56, 12))))));
        staffParis2.add(new Staff("Gabriel Roy", "Budget Planning", new Detail("2.2yrs", 34000, new Education("BA", "INSEEC", new University("INSEEC", 19500, new Chancellor("Dr. Claire Millet", 52, 10))))));

        List<Staff> staffParis3 = new ArrayList<>();
        staffParis3.add(new Staff("Noémie Pires", "Data Systems", new Detail("6.1yrs", 47000, new Education("MSc", "ENS Paris", new University("ENS Paris", 21500, new Chancellor("Dr. Loïc Fontaine", 58, 13))))));
        staffParis3.add(new Staff("Hugo Navarro", "AI Research", new Detail("4.6yrs", 42500, new Education("MTech", "EPITA", new University("EPITA", 20500, new Chancellor("Dr. Léa Courtois", 55, 12))))));
        staffParis3.add(new Staff("Alice Caron", "Cyber Policy", new Detail("3yrs", 39500, new Education("BSc", "École Normale Supérieure", new University("École Normale Supérieure", 20000, new Chancellor("Dr. Julien Picard", 53, 11))))));
        staffParis3.add(new Staff("Nathan Petit", "Cloud Infra", new Detail("2.7yrs", 35000, new Education("BTech", "IMT Atlantique", new University("IMT Atlantique", 19000, new Chancellor("Dr. Pauline Georges", 51, 10))))));

        HeadOfDepartment hodParis1 = new HeadOfDepartment("Dr. Vincent Morel", 59, staffParis1);
        HeadOfDepartment hodParis2 = new HeadOfDepartment("Dr. Margaux Simon", 56, staffParis2);
        HeadOfDepartment hodParis3 = new HeadOfDepartment("Dr. Thomas Barre", 58, staffParis3);

        Department deptParis1 = new Department("Urban Development", 4, hodParis1);
        Department deptParis2 = new Department("Finance Management", 3, hodParis2);
        Department deptParis3 = new Department("Digital Services", 4, hodParis3);

        List<Portfolio> parisPortfolios1 = new ArrayList<>();
        parisPortfolios1.add(new Portfolio("Housing Schemes", 2, deptParis1));
        parisPortfolios1.add(new Portfolio("Municipal Budget", 1, deptParis2));

        List<Portfolio> parisPortfolios2 = new ArrayList<>();
        parisPortfolios2.add(new Portfolio("E-Governance", 3, deptParis3));
        parisPortfolios2.add(new Portfolio("Public Works", 2, deptParis1));

        List<Portfolio> parisPortfolios3 = new ArrayList<>();
        parisPortfolios3.add(new Portfolio("Smart Technology", 3, deptParis3));
        parisPortfolios3.add(new Portfolio("Urban Economy", 2, deptParis2));

        List<Minister> ministersParis1 = new ArrayList<>();
        ministersParis1.add(new Minister("Isabelle Lefevre", "National Front", parisPortfolios1));
        ministersParis1.add(new Minister("Antoine Marchal", "Democratic Circle", parisPortfolios2));
        ministersParis1.add(new Minister("Manon Lambert", "People's Unity", parisPortfolios3));

        List<Minister> ministersParis2 = new ArrayList<>();
        ministersParis2.add(new Minister("Théo Delattre", "United Movement", parisPortfolios2));
        ministersParis2.add(new Minister("Léa Chartier", "Republic Bloc", parisPortfolios1));
        ministersParis2.add(new Minister("Benoît Guerin", "Hope Front", parisPortfolios3));

        List<Minister> ministersParis3 = new ArrayList<>();
        ministersParis3.add(new Minister("Inès Perrot", "Tech Alliance", parisPortfolios3));
        ministersParis3.add(new Minister("Quentin Lefranc", "New Path", parisPortfolios1));
        ministersParis3.add(new Minister("Élodie Renault", "Social Progress", parisPortfolios2));

        List<State> parisStates = new ArrayList<>();
        parisStates.add(new State("Île-de-France", 12200000, ministersParis1));
        parisStates.add(new State("Provence-Alpes-Côte d'Azur", 5200000, ministersParis2));
        parisStates.add(new State("Auvergne-Rhône-Alpes", 8000000, ministersParis3));

        Country country10 = new Country("France", 18, parisStates);


        Collection<Country> countries=new ArrayList<>(Arrays.asList(country,country1,country2,country3,country4,country5,
                country6,country7,country8,country9,country10));

        System.out.println("Countries with more than 5 states:");
        countries.stream()
                .filter(c -> c.getState().size() > 5)
                .forEach(c -> System.out.println(c.getCountryName()));





    }
}
