package com.xworkz.task.runner;

import com.xworkz.task.internal.*;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ProductRunner {
    public static void main(String[] args) {
        System.out.println("Running ProductRunner");


        Ward ward = new Ward(1, "Ward 1", 5000, "John Doe");
        Constituency constituency = new Constituency("Bangalore South", "Bangalore", 123456, "Bangalore South Constituency",ward);
        PrimeMinister primeMinister = new PrimeMinister("Narendra Modi", "3/2/2022", "BJP", 5,constituency);
        Government government = new Government("Central Government", "India", 1947, "New Delhi",primeMinister);
        Tax tax = new Tax("Income Tax", 0.2, 2010, "Sudhir",government);
        VariablePay variablePay = new VariablePay(5647, "Chaitanya", 20000, 50000,tax);
        Bonus bonus = new Bonus("Performance Bonus", 5000, "22/12/2023", "Annual bonus based on performance",variablePay);
        SalaryExpectation salaryExpected = new SalaryExpectation("Vaibhav", "Software", 502921, 3, bonus );
        List<Criteria> criteria=new ArrayList<>(Arrays.asList(new Criteria("Bachelor's Degree in Computer Science", "Required",7,"Sravan",salaryExpected),
                new Criteria("5+ years of experience in software development", "Required",6,"Omkar",salaryExpected)));
        Role role = new Role("Software Engineer", "Develops software applications", 75739, 8,criteria);
        Designation designation = new Designation("President", "Head of State", "software", 12345,role);
        President president = new President("Dr. A.P.J. Abdul Kalam", "President of India", 5, "1234567890",designation);
        University university = new University("Bangalore University", "Bangalore", 1976, "Bangalore", president);
        Education education=new Education("CSE","SDIT",2025,8.2,university);
        List<Experience> experience=new ArrayList<>(Arrays.asList(new Experience("Infosis","SoftWare",5,"Bangalore",education),
                new Experience("Google","Developer",7,"Delhi",education)));
        Inspector inspector = new Inspector("Rajesh", "Senior Inspector", 10, "9876543210",experience);
        RTO rto = new RTO(83568, "Bangalore", "KA-01", "4567894333",inspector);
        Registration registration = new Registration(12345, "Car", "John Doe", "Bangalore MG Road",rto);
        Vehicle vehicle=new Vehicle("KA-01-AB-1234", "Car", 2012, "Corolla", registration);
        Mayor mayor=new Mayor("John Doe", "Mayor of Bangalore", 5, "3456789",vehicle );
        Information information=new Information(5372,"500sqr","https//some/name","4567876545",mayor);
        City city=new City("Bangalore","Karnataka",357833,"5-AD-73",information);
        Address address=new Address("Bangalore MG Road","Bangalore","Karnataka","India",city);
        Details detail= new Details("someon","Vaibhav","567898543",50,address);
        Owner[] owners=new Owner[]{new Owner("Vaibhav","832451427","vaibhav@gmail.com","Goa",
                       new House[]{(new House("161/3","Savarde","Curchorem","Goa",detail)),
                        new House("824/3","Bashweshwar Park","Bangaore","Karnataka",detail)}),
                       new Owner("Chaitanya","9405899323","chaitu@gmail.com","Goa",
                       new House[]{(new House("65-A","Savri","Sanguem","Goa",detail)),
                         new House("356-Cs","Kalnath Temple","Curchorem","Goa",detail)})};
        Company company=new Company("TechCorp", "123 Tech Street", "vsi",456,owners);
        Product product=new Product("MobilePhone",5678,56,"indust",company);
//----------------------------------------------------------------------------------------------------------------
        Ward ward1= new Ward(2, "Ward 2", 6000, "Dinesh Kumar");
        Constituency constituency1 = new Constituency("Bangalore North", "Bangalore", 654321, "Bangalore North Constituency",ward1);
        PrimeMinister primeMinister1 = new PrimeMinister("Arvind Kejriwal", "4/2/2023", "AAP", 4,constituency1);
        Government government1 = new Government("State Government", "Delhi", 1999, "Delhi",primeMinister1);
        Tax tax1 = new Tax("Sales Tax", 0.1, 2015, "Ravi",government1);
        VariablePay variablePay1 = new VariablePay(1234, "Anjali", 30000, 60000,tax1);
        Bonus bonus1 = new Bonus("Holiday Bonus", 3000, "15/12/2023", "Bonus for holiday season",variablePay1);
        SalaryExpectation salaryExpected1 = new SalaryExpectation("Rahul", "Marketing", 402921, 2, bonus1 );
        List<Criteria> criteria1=new ArrayList<>(Arrays.asList(new Criteria("Bachelor's Degree in Marketing", "Required",5,"Suresh",salaryExpected1),
                new Criteria("3+ years of experience in marketing", "Required",4,"Ramesh",salaryExpected1)));
        Role role1 = new Role("Marketing Manager", "Manages marketing campaigns", 45739, 5,criteria1);
        Designation designation1 = new Designation("Vice President", "Second in command", "marketing", 67890,role1);
        President president1 = new President("Sonia Gandhi", "President of Congress", 6, "0987654321",designation1);
        University university1 = new University("Delhi University", "Delhi", 1980, "Delhi", president1);
        Education education1=new Education("MBA","Delhi University",2024,9.0,university1);
        List<Experience> experience1=new ArrayList<>(Arrays.asList(new Experience("TCS","Marketing",4,"Delhi",education1),
                new Experience("Wipro","Sales",6,"Mumbai",education1)));
        Inspector inspector1 = new Inspector("Suresh", "Junior Inspector", 8, "1234567890",experience1);
        RTO rto1 = new RTO(12345, "Delhi", "DL-01", "9876543210",inspector1);
        Registration registration1 = new Registration(67890, "Bike", "Rahul Sharma", "Delhi Connaught Place",rto1);
        Vehicle vehicle1=new Vehicle("DL-01-CD-5678", "Bike", 2015, "Ducati", registration1);
        Mayor mayor1=new Mayor("Anjali Sharma", "Mayor of Delhi", 3, "2345678",vehicle1 );
        Information information1=new Information(1234,"600sqr","https//some/other/name","9876543210",mayor1);
        City city1=new City("Delhi","Delhi",123456,"7-AD-89",information1);
        Address address1=new Address("Delhi Connaught Place","Delhi","Delhi","India",city1);
        Details detail1= new Details("someone1","Rahul","678901234",30,address1);
        Owner[] owners1=new Owner[]{new Owner("Rahul","832451428","rahul@gmail.com","Delhi",
                       new House[]{(new House("161/4","Connaught Place","Delhi","Delhi",detail1)),
                        new House("824/4","Rajiv Gandhi Park","Delhi","Delhi",detail1)}),
                        new Owner("Anjali","9405899324","anjali@gmail.com","Delhi",
                        new House[]{(new House("65-B","Connaught Place","Delhi","Delhi",detail1)),
                        new House("356-Ds","India Gate","Delhi","Delhi",detail1)})};
        Company company1=new Company("TechSolutions", "456 Tech Avenue", "vsi",789,owners1);
        Product product1=new Product("Laptop",1234,78,"electronics",company1);
//----------------------------------------------------------------------------------------------------------------
        Ward ward2= new Ward(3, "Ward 3", 7000, "Ravi Kumar");
        Constituency constituency2 = new Constituency("Bangalore East", "Bangalore", 789012, "Bangalore East Constituency",ward2);
        PrimeMinister primeMinister2 = new PrimeMinister("Yogi Adityanath", "5/2/2024", "BJP", 6,constituency2);
        Government government2 = new Government("State Government", "Uttar Pradesh", 2000, "Lucknow",primeMinister2);
        Tax tax2 = new Tax("Property Tax", 0.15, 2018, "Kumar",government2);
        VariablePay variablePay2 = new VariablePay(7890, "Priya", 40000, 70000,tax2);
        Bonus bonus2 = new Bonus("Festival Bonus", 4000, "10/11/2023", "Bonus for festival season",variablePay2);
        SalaryExpectation salaryExpected2 = new SalaryExpectation("Sita", "Finance", 602921, 4, bonus2 );
        List<Criteria> criteria2=new ArrayList<>(Arrays.asList(new Criteria("Bachelor's Degree in Finance", "Required",6,"Rohit",salaryExpected2),
                new Criteria("4+ years of experience in finance", "Required",5,"Amit",salaryExpected2)));
        Role role2 = new Role("Finance Manager", "Manages financial operations", 65739, 7,criteria2);
        Designation designation2 = new Designation("Chief Financial Officer", "Head of Finance", "finance", 78901,role2);
        President president2 = new President("Smriti Irani", "President of BJP", 7, "1234567890",designation2);
        University university2 = new University("Lucknow University", "Lucknow", 1990, "Lucknow", president2);
        Education education2=new Education("B.Com","Lucknow University",2023,8.5,university2);
        List<Experience> experience2=new ArrayList<>(Arrays.asList(new Experience("HDFC","Finance",5,"Lucknow",education2),
                new Experience("ICICI","Banking",7,"Mumbai",education2)));
        Inspector inspector2 = new Inspector("Kumar", "Senior Inspector", 12, "9876543210",experience2);
        RTO rto2 = new RTO(45678, "Lucknow", "UP-01", "1234567890",inspector2);
        Registration registration2 = new Registration(78901, "Truck", "Rohit Sharma", "Lucknow Hazratganj",rto2);
        Vehicle vehicle2=new Vehicle("UP-01-TR-7890", "Truck", 2018, "Tata", registration2);
        Mayor mayor2=new Mayor("Priya Sharma", "Mayor of Lucknow", 4, "3456789",vehicle2 );
        Information information2=new Information(6789,"800sqr","https//some/other/name2","4567890123",mayor2);
        City city2=new City("Lucknow","Uttar Pradesh",456789,"8-AD-90",information2);
        Address address2=new Address("Lucknow Hazratganj","Lucknow","Uttar Pradesh","India",city2);
        Details detail2= new Details("someone2","Rohit","789012345",35,address2);
        Owner[] owners2=new Owner[]{new Owner("Rohit","832451429","rohit@gmail.com","Lucknow",
                       new House[]{(new House("161/5","Hazratganj","Lucknow","Uttar Pradesh",detail2)),
                        new House("824/5","Ambedkar Park","Lucknow","Uttar Pradesh",detail2)}),
                        new Owner("Priya","9405899325","priya@gmail.com","Lucknow",
                        new House[]{(new House("65-C","Hazratganj","Lucknow","Uttar Pradesh",detail2)),
                        new House("356-Es","Bara Imambara","Lucknow","Uttar Pradesh",detail2)})};
        Company company2=new Company("TechWorld", "789 Tech Boulevard", "vsi",123,owners2);
        Product product2=new Product("Tablet",7890,89,"electronics",company2);
//--------------------------------------------------------------------------------------------------------------------------------------------------------

        Ward ward3= new Ward(4, "Ward 4", 8000, "Anil Kumar");
        Constituency constituency3 = new Constituency("Bangalore West", "Bangalore", 890123, "Bangalore West Constituency",ward3);
        PrimeMinister primeMinister3 = new PrimeMinister("Mamata Banerjee", "6/2/2025", "TMC", 8,constituency3);
        Government government3 = new Government("State Government", "West Bengal", 2005, "Kolkata",primeMinister3);
        Tax tax3 = new Tax("Luxury Tax", 0.25, 2020, "Banerjee",government3);
        VariablePay variablePay3 = new VariablePay(8901, "Suresh", 50000, 80000,tax3);
        Bonus bonus3 = new Bonus("Year-End Bonus", 6000, "31/12/2023", "Bonus for year-end performance",variablePay3);
        SalaryExpectation salaryExpected3 = new SalaryExpectation("Ravi", "HR", 702921, 6, bonus3 );
        List<Criteria> criteria3=new ArrayList<>(Arrays.asList(new Criteria("Bachelor's Degree in HR", "Required",8,"Anil",salaryExpected3),
                new Criteria("6+ years of experience in HR", "Required",7,"Kiran",salaryExpected3)));
        Role role3 = new Role("HR Manager", "Manages human resources", 85739, 9,criteria3);
        Designation designation3 = new Designation("Chief Human Resources Officer", "Head of HR", "hr", 89012,role3);
        President president3 = new President("Arun Jaitley", "President of BJP", 9, "2345678901",designation3);
        University university3 = new University("Kolkata University", "Kolkata", 1985, "Kolkata", president3);
        Education education3=new Education("MBA","Kolkata University",2022,9.5,university3);
        List<Experience> experience3=new ArrayList<>(Arrays.asList(new Experience("HCL","HR",7,"Kolkata",education3),
                new Experience("Infosys","Recruitment",9,"Chennai",education3)));
        Inspector inspector3 = new Inspector("Anil", "Junior Inspector", 15, "1234567890",experience3);
        RTO rto3 = new RTO(56789, "Kolkata", "WB-01", "2345678901",inspector3);
        Registration registration3 = new Registration(89012, "Bus", "Kiran Kumar", "Kolkata Park Street",rto3);
        Vehicle vehicle3=new Vehicle("WB-01-BU-8901", "Bus", 2020, "Volvo", registration3);
        Mayor mayor3=new Mayor("Suresh Kumar", "Mayor of Kolkata", 5, "4567890",vehicle3 );
        Information information3=new Information(7890,"900sqr","https//some/other/name3","5678901234",mayor3);
        City city3=new City("Kolkata","West Bengal",567890,"9-AD-01",information3);
        Address address3=new Address("Kolkata Park Street","Kolkata","West Bengal","India",city3);
        Details detail3= new Details("someone3","Kiran","890123456",40,address3);
        Owner[] owners3=new Owner[]{new Owner("Kiran","832451430","kiran@gmail.com","Kolkata",
                       new House[]{(new House("161/6","Park Street","Kolkata","West Bengal",detail3)),
                        new House("824/6","Victoria Memorial","Kolkata","West Bengal",detail3)}),
                        new Owner("Suresh","9405899326","suresh@gmail.com","Kolkata",
                         new House[]{(new House("65-D","Park Street","Kolkata","West Bengal",detail3)),
                        new House("356-Fs","Howrah Bridge","Kolkata","West Bengal",detail3)})};
        Company company3=new Company("TechSolutions", "890 Tech Lane", "vsi",456,owners3);
        Product product3=new Product("Smartwatch",8901,99,"electronics",company3);
//----------------------------------------------------------------------------------------------------------------
        Ward ward4 = new Ward(4, "Ward 4", 8004, "Councilor 4");
        Constituency constituency4 = new Constituency("City 4", "District 4", 890004, "Constituency 4", ward4);
        PrimeMinister primeMinister4 = new PrimeMinister("PM Name 4", "01/01/2024", "Party 4", 4, constituency4);
        Government government4 = new Government("State Government", "State 4", 2004, "Capital 4", primeMinister4);
        Tax tax4 = new Tax("Tax Type 4", 0.24, 2014, "Authority 4", government4);
        VariablePay variablePay4 = new VariablePay(8904, "Employee 4", 50040, 80040, tax4);
        Bonus bonus4 = new Bonus("Year-End Bonus", 6004, "31/12/2024", "Performance bonus", variablePay4);
        SalaryExpectation salaryExpected4 = new SalaryExpectation("Candidate 4", "HR", 70294, 4, bonus4);
        List<Criteria> criteria4 = Arrays.asList(
                new Criteria("Criteria A 4", "Required", 4, "Reviewer A", salaryExpected4),
                new Criteria("Criteria B 4", "Preferred", 5, "Reviewer B", salaryExpected4)
        );
        Role role4 = new Role("Role 4", "Description for role 4", 85704, 4, criteria4);
        Designation designation4 = new Designation("Designation 4", "Head of Department 4", "HR", 89004, role4);
        President president4 = new President("President 4", "Title 4", 4, "234564", designation4);
        University university4 = new University("University 4", "City 4", 1984, "Address 4", president4);
        Education education4 = new Education("MBA", "University 4", 2024, 8.5, university4);
        List<Experience> experience4 = Arrays.asList(
                new Experience("Company A", "HR", 9, "City 4", education4),
                new Experience("Company B", "Recruitment", 10, "City 4", education4)
        );
        Inspector inspector4 = new Inspector("Inspector 4", "Rank 4", 14, "123454890", experience4);
        RTO rto4 = new RTO(56704, "City 4", "WB-4", "2345648901", inspector4);
        Registration registration4 = new Registration(89004, "VehicleType 4", "Owner 4", "Address 4", rto4);
        Vehicle vehicle4 = new Vehicle("WB-04-XX-8904", "VehicleType 4", 2019, "Brand 4", registration4);
        Mayor mayor4 = new Mayor("Mayor 4", "Mayor Title 4", 5, "45678490", vehicle4);
        Information information4 = new Information(7804, "804 sqr", "https://info/4", "5678941234", mayor4);
        City city4 = new City("City 4", "State 4", 56784, "Zone-4", information4);
        Address address4 = new Address("Street 4", "City 4", "State 4", "India", city4);
        Details detail4 = new Details("Person 4", "Contact 4", "89012456", 34, address4);
        Owner[] owners4 = {
                new Owner("Owner A 4", "832454430", "ownerA4@mail.com", "City 4",
                        new House[]{
                                new House("161/6-4", "Area 1", "City 4", "State 4", detail4),
                                new House("824/6-4", "Area 2", "City 4", "State 4", detail4)
                        }),
                new Owner("Owner B 4", "940584326", "ownerB4@mail.com", "City 4",
                        new House[]{
                                new House("65-D-4", "Area 3", "City 4", "State 4", detail4),
                                new House("356-Fs-4", "Area 4", "City 4", "State 4", detail4)
                        })
        };
        Company company4 = new Company("TechSolutions 4", "890 Tech Lane", "vsi", 460, owners4);
        Product product4 = new Product("Smartwatch 4", 8904, 104, "electronics", company4);
//---------------------------------------------------------------------------------------------------------------------------------------
        Ward ward5 = new Ward(5, "Ward 5", 8005, "Councilor 5");
        Constituency constituency5 = new Constituency("City 5", "District 5", 890005, "Constituency 5", ward5);
        PrimeMinister primeMinister5 = new PrimeMinister("PM Name 5", "05/01/2025", "Party 5", 5, constituency5);
        Government government5 = new Government("State Government", "State 5", 2005, "Capital 5", primeMinister5);
        Tax tax5 = new Tax("Tax Type 5", 0.25, 2015, "Authority 5", government5);
        VariablePay variablePay5 = new VariablePay(8905, "Employee 5", 50050, 80050, tax5);
        Bonus bonus5 = new Bonus("Performance Bonus", 6005, "31/12/2025", "Annual performance bonus", variablePay5);
        SalaryExpectation salaryExpected5 = new SalaryExpectation("Candidate 5", "Finance", 70295, 5, bonus5);
        List<Criteria> criteria5 = Arrays.asList(
                new Criteria("Criteria A 5", "Required", 5, "Reviewer A", salaryExpected5),
                new Criteria("Criteria B 5", "Preferred", 6, "Reviewer B", salaryExpected5)
        );
        Role role5 = new Role("Role 5", "Finance Analyst", 85705, 5, criteria5);
        Designation designation5 = new Designation("Designation 5", "Finance Head", "Finance", 89005, role5);
        President president5 = new President("President 5", "Finance Leader", 5, "234565", designation5);
        University university5 = new University("University 5", "City 5", 1985, "Address 5", president5);
        Education education5 = new Education("B.Com", "University 5", 2025, 8.8, university5);
        List<Experience> experience5 = Arrays.asList(
                new Experience("Company C", "Finance", 5, "City 5", education5),
                new Experience("Company D", "Audit", 7, "City 5", education5)
        );
        Inspector inspector5 = new Inspector("Inspector 5", "Rank 5", 13, "123455890", experience5);
        RTO rto5 = new RTO(56705, "City 5", "WB-5", "2345658901", inspector5);
        Registration registration5 = new Registration(89005, "Car", "Owner 5", "Address 5", rto5);
        Vehicle vehicle5 = new Vehicle("WB-05-XX-8905", "Car", 2021, "Hyundai", registration5);
        Mayor mayor5 = new Mayor("Mayor 5", "Mayor Title 5", 6, "45678590", vehicle5);
        Information information5 = new Information(7805, "805 sqr", "https://info/5", "5678951234", mayor5);
        City city5 = new City("City 5", "State 5", 56785, "Zone-5", information5);
        Address address5 = new Address("Street 5", "City 5", "State 5", "India", city5);
        Details detail5 = new Details("Person 5", "Contact 5", "89012556", 35, address5);
        Owner[] owners5 = {
                new Owner("Owner A 5", "832455430", "ownerA5@mail.com", "City 5",
                        new House[]{
                                new House("161/6-5", "Area 1", "City 5", "State 5", detail5),
                                new House("824/6-5", "Area 2", "City 5", "State 5", detail5)
                        }),
                new Owner("Owner B 5", "940585326", "ownerB5@mail.com", "City 5",
                        new House[]{
                                new House("65-D-5", "Area 3", "City 5", "State 5", detail5),
                                new House("356-Fs-5", "Area 4", "City 5", "State 5", detail5)
                        })
        };
        Company company5 = new Company("TechSolutions 5", "891 Tech Lane", "vsi", 461, owners5);
        Product product5 = new Product("Smartwatch 5", 8905, 105, "electronics", company5);
//-----------------------------------------------------------------------------------------------------------------------------------------
        Ward ward6 = new Ward(6, "Ward 6", 8006, "Councilor 6");
        Constituency constituency6 = new Constituency("City 6", "District 6", 890006, "Constituency 6", ward6);
        PrimeMinister primeMinister6 = new PrimeMinister("PM Name 6", "06/01/2026", "Party 6", 6, constituency6);
        Government government6 = new Government("State Government", "State 6", 2006, "Capital 6", primeMinister6);
        Tax tax6 = new Tax("Tax Type 6", 0.26, 2016, "Authority 6", government6);
        VariablePay variablePay6 = new VariablePay(8906, "Employee 6", 50060, 80060, tax6);
        Bonus bonus6 = new Bonus("Festive Bonus", 6006, "25/12/2026", "Holiday bonus", variablePay6);
        SalaryExpectation salaryExpected6 = new SalaryExpectation("Candidate 6", "Marketing", 70296, 6, bonus6);
        List<Criteria> criteria6 = Arrays.asList(
                new Criteria("Criteria A 6", "Required", 6, "Reviewer A", salaryExpected6),
                new Criteria("Criteria B 6", "Optional", 7, "Reviewer B", salaryExpected6)
        );
        Role role6 = new Role("Role 6", "Marketing Lead", 85706, 6, criteria6);
        Designation designation6 = new Designation("Designation 6", "Marketing Director", "Marketing", 89006, role6);
        President president6 = new President("President 6", "Marketing Guru", 6, "234566", designation6);
        University university6 = new University("University 6", "City 6", 1986, "Address 6", president6);
        Education education6 = new Education("MBA", "University 6", 2026, 9.1, university6);
        List<Experience> experience6 = Arrays.asList(
                new Experience("Company E", "Marketing", 6, "City 6", education6),
                new Experience("Company F", "Sales", 8, "City 6", education6)
        );
        Inspector inspector6 = new Inspector("Inspector 6", "Rank 6", 12, "123456890", experience6);
        RTO rto6 = new RTO(56706, "City 6", "WB-6", "2345668901", inspector6);
        Registration registration6 = new Registration(89006, "Scooter", "Owner 6", "Address 6", rto6);
        Vehicle vehicle6 = new Vehicle("WB-06-XX-8906", "Scooter", 2022, "Honda", registration6);
        Mayor mayor6 = new Mayor("Mayor 6", "Mayor Title 6", 7, "45678690", vehicle6);
        Information information6 = new Information(7806, "806 sqr", "https://info/6", "5678961234", mayor6);
        City city6 = new City("City 6", "State 6", 56786, "Zone-6", information6);
        Address address6 = new Address("Street 6", "City 6", "State 6", "India", city6);
        Details detail6 = new Details("Person 6", "Contact 6", "89012656", 36, address6);
        Owner[] owners6 = {
                new Owner("Owner A 6", "832456430", "ownerA6@mail.com", "City 6",
                        new House[]{
                                new House("161/6-6", "Area 1", "City 6", "State 6", detail6),
                                new House("824/6-6", "Area 2", "City 6", "State 6", detail6)
                        }),
                new Owner("Owner B 6", "940586326", "ownerB6@mail.com", "City 6",
                        new House[]{
                                new House("65-D-6", "Area 3", "City 6", "State 6", detail6),
                                new House("356-Fs-6", "Area 4", "City 6", "State 6", detail6)
                        })
        };
        Company company6 = new Company("TechSolutions 6", "892 Tech Lane", "vsi", 462, owners6);
        Product product6 = new Product("Smartwatch 6", 8906, 106, "electronics", company6);
//-----------------------------------------------------------------------------------------------------------------------------------
        Ward ward7 = new Ward(7, "Ward 7", 8007, "Councilor 7");
        Constituency constituency7 = new Constituency("City 7", "District 7", 890007, "Constituency 7", ward7);
        PrimeMinister primeMinister7 = new PrimeMinister("PM Name 7", "01/07/2025", "Party 7", 7, constituency7);
        Government government7 = new Government("Central Government", "State 7", 2007, "Capital 7", primeMinister7);
        Tax tax7 = new Tax("Service Tax", 0.18, 2017, "Authority 7", government7);
        VariablePay variablePay7 = new VariablePay(8907, "Employee 7", 51000, 81000, tax7);
        Bonus bonus7 = new Bonus("Mid-Year Bonus", 6100, "01/07/2025", "Mid-year performance bonus", variablePay7);
        SalaryExpectation salaryExpected7 = new SalaryExpectation("Candidate 7", "Finance", 70307, 7, bonus7);
        List<Criteria> criteria7 = Arrays.asList(
                new Criteria("CPA Certification", "Required", 7, "Finance Manager", salaryExpected7),
                new Criteria("5+ years in auditing", "Preferred", 6, "Audit Head", salaryExpected7)
        );
        Role role7 = new Role("Finance Analyst", "Handles financial audits", 85707, 7, criteria7);
        Designation designation7 = new Designation("Head of Finance", "Finance Leader", "Finance", 89007, role7);
        President president7 = new President("President 7", "Head of Finance Board", 7, "237777777", designation7);
        University university7 = new University("Finance University", "City 7", 1987, "Address 7", president7);
        Education education7 = new Education("M.Com", "Finance University", 2025, 9.0, university7);
        List<Experience> experience7 = Arrays.asList(
                new Experience("Ernst & Young", "Auditor", 5, "City 7", education7),
                new Experience("Deloitte", "Tax Consultant", 4, "City 7", education7)
        );
        Inspector inspector7 = new Inspector("Inspector 7", "Senior Inspector", 17, "9876543210", experience7);
        RTO rto7 = new RTO(56707, "City 7", "WB-07", "2399999999", inspector7);
        Registration registration7 = new Registration(89007, "SUV", "Ravi Kumar", "Street 77, City 7", rto7);
        Vehicle vehicle7 = new Vehicle("WB-07-ZZ-8907", "SUV", 2021, "Toyota", registration7);
        Mayor mayor7 = new Mayor("Mayor 7", "Mayor of District 7", 7, "456777770", vehicle7);
        Information information7 = new Information(7807, "1000 sqr", "https://info/city7", "5678977777", mayor7);
        City city7 = new City("City 7", "State 7", 56787, "Zone-7", information7);
        Address address7 = new Address("7th Avenue", "City 7", "State 7", "India", city7);
        Details detail7 = new Details("Ravi Singh", "Manager", "7777777777", 37, address7);
        Owner[] owners7 = {
                new Owner("Owner A 7", "932457777", "ownera7@mail.com", "City 7",
                        new House[]{
                                new House("7A", "Green Park", "City 7", "State 7", detail7),
                                new House("7B", "Blue Hills", "City 7", "State 7", detail7)
                        }),
                new Owner("Owner B 7", "940588877", "ownerb7@mail.com", "City 7",
                        new House[]{
                                new House("7C", "Sunset Road", "City 7", "State 7", detail7),
                                new House("7D", "Lakeview Street", "City 7", "State 7", detail7)
                        })
        };
        Company company7 = new Company("FinTech Innovations", "7 Finance Road", "fin", 707, owners7);
        Product product7 = new Product("SmartGlasses", 8907, 250, "wearable-tech", company7);
//-----------------------------------------------------------------------------------------------------------------------------------
        Ward ward8 = new Ward(8, "Ward 8", 8008, "Councilor 8");
        Constituency constituency8 = new Constituency("City 8", "District 8", 890008, "Constituency 8", ward8);
        PrimeMinister primeMinister8 = new PrimeMinister("PM Name 8", "01/08/2025", "Party 8", 8, constituency8);
        Government government8 = new Government("State Government", "State 8", 2008, "Capital 8", primeMinister8);
        Tax tax8 = new Tax("Import Tax", 0.20, 2018, "Authority 8", government8);
        VariablePay variablePay8 = new VariablePay(8908, "Employee 8", 52000, 82000, tax8);
        Bonus bonus8 = new Bonus("Festival Bonus", 6200, "15/10/2025", "Festival season bonus", variablePay8);
        SalaryExpectation salaryExpected8 = new SalaryExpectation("Candidate 8", "Marketing", 70308, 8, bonus8);
        List<Criteria> criteria8 = Arrays.asList(
                new Criteria("MBA in Marketing", "Required", 8, "Lead A", salaryExpected8),
                new Criteria("Experience with SEO", "Preferred", 6, "Lead B", salaryExpected8)
        );
        Role role8 = new Role("Marketing Manager", "Leads marketing strategy", 85708, 8, criteria8);
        Designation designation8 = new Designation("Head of Marketing", "Marketing Leader", "Marketing", 89008, role8);
        President president8 = new President("President 8", "Marketing Board Chair", 8, "238888888", designation8);
        University university8 = new University("Marketing Institute", "City 8", 1988, "Campus 8", president8);
        Education education8 = new Education("MBA", "Marketing Institute", 2025, 8.8, university8);
        List<Experience> experience8 = Arrays.asList(
                new Experience("Google", "SEO Analyst", 5, "City 8", education8),
                new Experience("Amazon", "Content Strategist", 4, "City 8", education8)
        );
        Inspector inspector8 = new Inspector("Inspector 8", "Inspector Grade A", 18, "9888888888", experience8);
        RTO rto8 = new RTO(56708, "City 8", "WB-08", "2388888888", inspector8);
        Registration registration8 = new Registration(89008, "Sedan", "Anita Sharma", "88 Drive, City 8", rto8);
        Vehicle vehicle8 = new Vehicle("WB-08-ZZ-8908", "Sedan", 2022, "Hyundai", registration8);
        Mayor mayor8 = new Mayor("Mayor 8", "Mayor of Zone 8", 6, "456888888", vehicle8);
        Information information8 = new Information(7808, "1200 sqr", "https://info/city8", "5678988888", mayor8);
        City city8 = new City("City 8", "State 8", 56788, "Zone-8", information8);
        Address address8 = new Address("8th Cross", "City 8", "State 8", "India", city8);
        Details detail8 = new Details("Anita Sharma", "Marketing Lead", "8888888888", 33, address8);
        Owner[] owners8 = {
                new Owner("Owner A 8", "933338888", "ownera8@mail.com", "City 8",
                        new House[]{
                                new House("8A", "Metro Heights", "City 8", "State 8", detail8),
                                new House("8B", "Sunrise Complex", "City 8", "State 8", detail8)
                        }),
                new Owner("Owner B 8", "940588888", "ownerb8@mail.com", "City 8",
                        new House[]{
                                new House("8C", "Lakeside Villas", "City 8", "State 8", detail8),
                                new House("8D", "Orchid Lane", "City 8", "State 8", detail8)
                        })
        };
        Company company8 = new Company("AdMarketing Solutions", "8th Avenue", "ads", 808, owners8);
        Product product8 = new Product("Digital Billboard", 8908, 799, "advertising", company8);
//-----------------------------------------------------------------------------------------------------------------------------------
        Ward ward9 = new Ward(9, "Ward 9", 9009, "Councilor 9");
        Constituency constituency9 = new Constituency("City 9", "District 9", 890009, "Constituency 9", ward9);
        PrimeMinister primeMinister9 = new PrimeMinister("PM Name 9", "02/02/2025", "Party 9", 9, constituency9);
        Government government9 = new Government("Central Government", "State 9", 2009, "Capital 9", primeMinister9);
        Tax tax9 = new Tax("Entertainment Tax", 0.18, 2019, "Authority 9", government9);
        VariablePay variablePay9 = new VariablePay(8909, "Employee 9", 53000, 83000, tax9);
        Bonus bonus9 = new Bonus("Quarterly Bonus", 6300, "30/09/2025", "Bonus for Q3", variablePay9);
        SalaryExpectation salaryExpected9 = new SalaryExpectation("Candidate 9", "Design", 70309, 9, bonus9);
        List<Criteria> criteria9 = Arrays.asList(
                new Criteria("Degree in UI/UX", "Required", 9, "Manager A", salaryExpected9),
                new Criteria("3+ years in Figma", "Preferred", 7, "Manager B", salaryExpected9)
        );
        Role role9 = new Role("UX Designer", "Designs product interfaces", 85709, 9, criteria9);
        Designation designation9 = new Designation("Design Head", "Creative Lead", "Design", 89009, role9);
        President president9 = new President("President 9", "Creative Director", 9, "239999999", designation9);
        University university9 = new University("Design University", "City 9", 1989, "Main Road 9", president9);
        Education education9 = new Education("B.Des", "Design University", 2021, 9.2, university9);
        List<Experience> experience9 = Arrays.asList(
                new Experience("Adobe", "UI Designer", 3, "City 9", education9),
                new Experience("Canva", "Graphic Lead", 4, "City 9", education9)
        );
        Inspector inspector9 = new Inspector("Inspector 9", "Inspector Grade B", 12, "9999999999", experience9);
        RTO rto9 = new RTO(56709, "City 9", "WB-09", "2399999999", inspector9);
        Registration registration9 = new Registration(89009, "SUV", "Rajiv Singh", "Sector 9, City 9", rto9);
        Vehicle vehicle9 = new Vehicle("WB-09-SV-8909", "SUV", 2021, "Mahindra", registration9);
        Mayor mayor9 = new Mayor("Mayor 9", "Mayor of City 9", 7, "456999999", vehicle9);
        Information information9 = new Information(7809, "1500 sqr", "https://info/city9", "5678999999", mayor9);
        City city9 = new City("City 9", "State 9", 56789, "Zone-9", information9);
        Address address9 = new Address("9th Lane", "City 9", "State 9", "India", city9);
        Details detail9 = new Details("Rajiv Singh", "UX Head", "9999999999", 35, address9);
        Owner[] owners9 = {
                new Owner("Owner A 9", "933339999", "ownera9@mail.com", "City 9",
                        new House[]{
                                new House("9A", "Elite Residency", "City 9", "State 9", detail9),
                                new House("9B", "Green Enclave", "City 9", "State 9", detail9)
                        }),
                new Owner("Owner B 9", "940589999", "ownerb9@mail.com", "City 9",
                        new House[]{
                                new House("9C", "Palm Grove", "City 9", "State 9", detail9),
                                new House("9D", "Sunset Heights", "City 9", "State 9", detail9)
                        })
        };
        Company company9 = new Company("UXExperts Inc", "9th Floor, Tech Park", "ux", 909, owners9);
        Product product9 = new Product("UX Audit Tool", 8909, 349, "software", company9);
//-----------------------------------------------------------------------------------------------------------------------------------
        Ward ward10 = new Ward(10, "Ward 10", 9010, "Councilor 10");
        Constituency constituency10 = new Constituency("City 10", "District 10", 890010, "Constituency 10", ward10);
        PrimeMinister primeMinister10 = new PrimeMinister("PM Name 10", "10/03/2025", "Party 10", 10, constituency10);
        Government government10 = new Government("Federal Government", "State 10", 2010, "Capital 10", primeMinister10);
        Tax tax10 = new Tax("Import Duty", 0.22, 2021, "Authority 10", government10);
        VariablePay variablePay10 = new VariablePay(8910, "Employee 10", 55000, 85000, tax10);
        Bonus bonus10 = new Bonus("Festival Bonus", 7000, "01/11/2025", "Diwali Bonus", variablePay10);
        SalaryExpectation salaryExpected10 = new SalaryExpectation("Candidate 10", "Marketing", 70310, 10, bonus10);
        List<Criteria> criteria10 = Arrays.asList(
                new Criteria("MBA in Marketing", "Required", 10, "Manager X", salaryExpected10),
                new Criteria("Experience with SEO", "Preferred", 8, "Manager Y", salaryExpected10)
        );
        Role role10 = new Role("Marketing Manager", "Leads marketing strategies", 85710, 10, criteria10);
        Designation designation10 = new Designation("CMO", "Chief Marketing Officer", "Marketing", 89010, role10);
        President president10 = new President("President 10", "Marketing Director", 10, "2311111111", designation10);
        University university10 = new University("Marketing University", "City 10", 1990, "Main Street 10", president10);
        Education education10 = new Education("MBA", "Marketing University", 2020, 9.0, university10);
        List<Experience> experience10 = Arrays.asList(
                new Experience("Google", "Marketing Lead", 5, "City 10", education10),
                new Experience("Amazon", "Ad Specialist", 6, "City 10", education10)
        );
        Inspector inspector10 = new Inspector("Inspector 10", "Senior Inspector", 16, "9999100000", experience10);
        RTO rto10 = new RTO(56710, "City 10", "WB-10", "2311111111", inspector10);
        Registration registration10 = new Registration(89010, "Car", "Priya Sharma", "Sector 10, City 10", rto10);
        Vehicle vehicle10 = new Vehicle("WB-10-CA-8910", "Car", 2022, "Hyundai", registration10);
        Mayor mayor10 = new Mayor("Mayor 10", "Mayor of City 10", 6, "4567100000", vehicle10);
        Information information10 = new Information(7810, "1000 sqr", "https://info/city10", "5678910000", mayor10);
        City city10 = new City("City 10", "State 10", 56790, "Zone-10", information10);
        Address address10 = new Address("Sector 10", "City 10", "State 10", "India", city10);
        Details detail10 = new Details("Priya Sharma", "Marketing Head", "9999100000", 32, address10);
        Owner[] owners10 = {
                new Owner("Owner A 10", "9333310000", "ownera10@mail.com", "City 10",
                        new House[]{
                                new House("10A", "Maple Residency", "City 10", "State 10", detail10),
                                new House("10B", "Riverfront Apartments", "City 10", "State 10", detail10)
                        }),
                new Owner("Owner B 10", "9405810000", "ownerb10@mail.com", "City 10",
                        new House[]{
                                new House("10C", "Skyline Towers", "City 10", "State 10", detail10),
                                new House("10D", "Heritage Villas", "City 10", "State 10", detail10)
                        })
        };
        Company company10 = new Company("MarketGurus Ltd.", "Sector 10 Tech Park", "marketing", 1010, owners10);
        Product product10 = new Product("AdAnalytics Pro", 8910, 449, "software", company10);

//-----------------------------------------------------------------------------------------------------------------------------------
        Ward ward11 = new Ward(11, "Ward 11", 9011, "Councilor 11");
        Constituency constituency11 = new Constituency("City 11", "District 11", 890011, "Constituency 11", ward11);
        PrimeMinister primeMinister11 = new PrimeMinister("PM Name 11", "11/04/2025", "Party 11", 11, constituency11);
        Government government11 = new Government("State Government", "State 11", 2011, "Capital 11", primeMinister11);
        Tax tax11 = new Tax("Service Tax", 0.18, 2022, "Authority 11", government11);
        VariablePay variablePay11 = new VariablePay(8911, "Employee 11", 51000, 81000, tax11);
        Bonus bonus11 = new Bonus("Quarterly Bonus", 5500, "30/06/2025", "Q2 Performance Bonus", variablePay11);
        SalaryExpectation salaryExpected11 = new SalaryExpectation("Candidate 11", "Engineering", 70311, 11, bonus11);
        List<Criteria> criteria11 = Arrays.asList(
                new Criteria("B.Tech in CSE", "Required", 11, "Lead A", salaryExpected11),
                new Criteria("5+ years experience in Java", "Preferred", 9, "Lead B", salaryExpected11)
        );
        Role role11 = new Role("Software Engineer", "Develops backend systems", 85711, 11, criteria11);
        Designation designation11 = new Designation("Senior Engineer", "Tech Lead", "Engineering", 89011, role11);
        President president11 = new President("President 11", "Engineering Director", 11, "2311122222", designation11);
        University university11 = new University("Engineering Institute 11", "City 11", 1991, "Tech Street 11", president11);
        Education education11 = new Education("B.Tech", "Engineering Institute 11", 2021, 8.9, university11);
        List<Experience> experience11 = Arrays.asList(
                new Experience("TCS", "Developer", 4, "City 11", education11),
                new Experience("Capgemini", "Software Engineer", 5, "City 11", education11)
        );
        Inspector inspector11 = new Inspector("Inspector 11", "Inspector Rank 11", 12, "9999201111", experience11);
        RTO rto11 = new RTO(56711, "City 11", "WB-11", "2311122222", inspector11);
        Registration registration11 = new Registration(89011, "SUV", "Rahul Sharma", "Sector 11, City 11", rto11);
        Vehicle vehicle11 = new Vehicle("WB-11-SU-8911", "SUV", 2023, "Toyota", registration11);
        Mayor mayor11 = new Mayor("Mayor 11", "Mayor of City 11", 6, "4567111111", vehicle11);
        Information information11 = new Information(7811, "1100 sqr", "https://info/city11", "5678911111", mayor11);
        City city11 = new City("City 11", "State 11", 56791, "Zone-11", information11);
        Address address11 = new Address("Sector 11", "City 11", "State 11", "India", city11);
        Details detail11 = new Details("Rahul Sharma", "Tech Lead", "9999201111", 31, address11);
        Owner[] owners11 = {
                new Owner("Owner A 11", "9333321111", "ownera11@mail.com", "City 11",
                        new House[]{
                                new House("11A", "Ocean View", "City 11", "State 11", detail11),
                                new House("11B", "Green Meadows", "City 11", "State 11", detail11)
                        }),
                new Owner("Owner B 11", "9405821111", "ownerb11@mail.com", "City 11",
                        new House[]{
                                new House("11C", "Sunrise Residency", "City 11", "State 11", detail11),
                                new House("11D", "Valley Heights", "City 11", "State 11", detail11)
                        })
        };
        Company company11 = new Company("CodeCrafters Inc.", "Sector 11 IT Park", "engineering", 1011, owners11);
        Product product11 = new Product("CloudCore System", 8911, 549, "software", company11);
//-------------------------------------------------------------------------------------------------------------------------------
        Ward ward12 = new Ward(12, "Ward 12", 9012, "Councilor 12");
        Constituency constituency12 = new Constituency("City 12", "District 12", 890012, "Constituency 12", ward12);
        PrimeMinister primeMinister12 = new PrimeMinister("PM Name 12", "12/05/2025", "Party 12", 12, constituency12);
        Government government12 = new Government("Central Government", "State 12", 2012, "Capital 12", primeMinister12);
        Tax tax12 = new Tax("Professional Tax", 0.20, 2021, "Authority 12", government12);
        VariablePay variablePay12 = new VariablePay(8912, "Employee 12", 52000, 82000, tax12);
        Bonus bonus12 = new Bonus("Mid-Year Bonus", 6200, "30/06/2025", "Mid-year performance reward", variablePay12);
        SalaryExpectation salaryExpected12 = new SalaryExpectation("Candidate 12", "Sales", 70312, 5, bonus12);
        List<Criteria> criteria12 = Arrays.asList(
                new Criteria("MBA in Sales", "Required", 7, "Manager A", salaryExpected12),
                new Criteria("5 years in FMCG", "Preferred", 8, "Manager B", salaryExpected12)
        );
        Role role12 = new Role("Sales Manager", "Manages sales teams", 85712, 6, criteria12);
        Designation designation12 = new Designation("National Sales Head", "Oversees sales regions", "Sales", 89012, role12);
        President president12 = new President("President 12", "Chairman", 12, "2323123456", designation12);
        University university12 = new University("Business University 12", "City 12", 1992, "Business Ave 12", president12);
        Education education12 = new Education("MBA", "Business University 12", 2022, 8.2, university12);
        List<Experience> experience12 = Arrays.asList(
                new Experience("Unilever", "Sales Executive", 4, "City 12", education12),
                new Experience("Nestle", "Area Sales Manager", 6, "City 12", education12)
        );
        Inspector inspector12 = new Inspector("Inspector 12", "Sales Tax Officer", 13, "9999212121", experience12);
        RTO rto12 = new RTO(56712, "City 12", "WB-12", "2323123456", inspector12);
        Registration registration12 = new Registration(89012, "Car", "Aman Joshi", "City 12 Lane", rto12);
        Vehicle vehicle12 = new Vehicle("WB-12-CA-8912", "Car", 2022, "Honda", registration12);
        Mayor mayor12 = new Mayor("Mayor 12", "Mayor of City 12", 7, "4567121212", vehicle12);
        Information information12 = new Information(7812, "950 sqr", "https://info/12", "5678912121", mayor12);
        City city12 = new City("City 12", "State 12", 56792, "Zone-12", information12);
        Address address12 = new Address("Road 12", "City 12", "State 12", "India", city12);
        Details detail12 = new Details("Aman Joshi", "Sales Lead", "9999212121", 30, address12);
        Owner[] owners12 = {
                new Owner("Owner A 12", "9333321212", "ownera12@mail.com", "City 12",
                        new House[]{
                                new House("12A", "Business Street", "City 12", "State 12", detail12),
                                new House("12B", "Growth Avenue", "City 12", "State 12", detail12)
                        }),
                new Owner("Owner B 12", "9405821212", "ownerb12@mail.com", "City 12",
                        new House[]{
                                new House("12C", "River View", "City 12", "State 12", detail12),
                                new House("12D", "City Heights", "City 12", "State 12", detail12)
                        })
        };
        Company company12 = new Company("SalesForce Pvt Ltd", "Market Tower", "sales", 1012, owners12);
        Product product12 = new Product("CRM Suite", 8912, 109, "software", company12);
//------------------------------------------------------------------------------------------------------------------------------------
        Ward ward13 = new Ward(13, "Ward 13", 9013, "Councilor 13");
        Constituency constituency13 = new Constituency("City 13", "District 13", 890013, "Constituency 13", ward13);
        PrimeMinister primeMinister13 = new PrimeMinister("PM Name 13", "13/06/2025", "Party 13", 13, constituency13);
        Government government13 = new Government("State Government", "State 13", 2013, "Capital 13", primeMinister13);
        Tax tax13 = new Tax("Import Tax", 0.27, 2015, "Authority 13", government13);
        VariablePay variablePay13 = new VariablePay(8913, "Employee 13", 53000, 83000, tax13);
        Bonus bonus13 = new Bonus("Annual Bonus", 6300, "31/12/2025", "Year-end award", variablePay13);
        SalaryExpectation salaryExpected13 = new SalaryExpectation("Candidate 13", "Finance", 70313, 6, bonus13);
        List<Criteria> criteria13 = Arrays.asList(
                new Criteria("CA Certification", "Required", 8, "Auditor A", salaryExpected13),
                new Criteria("6 years in finance", "Required", 9, "Auditor B", salaryExpected13)
        );
        Role role13 = new Role("Finance Manager", "Manages financial records", 85713, 7, criteria13);
        Designation designation13 = new Designation("CFO", "Chief Financial Officer", "Finance", 89013, role13);
        President president13 = new President("President 13", "CFO Chairman", 13, "2323134567", designation13);
        University university13 = new University("Finance University 13", "City 13", 1993, "Finance Lane", president13);
        Education education13 = new Education("CA", "Finance University 13", 2023, 8.7, university13);
        List<Experience> experience13 = Arrays.asList(
                new Experience("Deloitte", "Audit Analyst", 3, "City 13", education13),
                new Experience("EY", "Finance Manager", 7, "City 13", education13)
        );
        Inspector inspector13 = new Inspector("Inspector 13", "Income Tax Officer", 14, "9999313131", experience13);
        RTO rto13 = new RTO(56713, "City 13", "WB-13", "2323134567", inspector13);
        Registration registration13 = new Registration(89013, "Truck", "Sameer Verma", "Finance Street", rto13);
        Vehicle vehicle13 = new Vehicle("WB-13-TR-8913", "Truck", 2021, "Tata", registration13);
        Mayor mayor13 = new Mayor("Mayor 13", "Mayor of City 13", 8, "4567131313", vehicle13);
        Information information13 = new Information(7813, "980 sqr", "https://info/13", "5678913131", mayor13);
        City city13 = new City("City 13", "State 13", 56793, "Zone-13", information13);
        Address address13 = new Address("Road 13", "City 13", "State 13", "India", city13);
        Details detail13 = new Details("Sameer Verma", "Finance Lead", "9999313131", 33, address13);
        Owner[] owners13 = {
                new Owner("Owner A 13", "9333321313", "ownera13@mail.com", "City 13",
                        new House[]{
                                new House("13A", "Finance Area", "City 13", "State 13", detail13),
                                new House("13B", "Income Colony", "City 13", "State 13", detail13)
                        }),
                new Owner("Owner B 13", "9405821313", "ownerb13@mail.com", "City 13",
                        new House[]{
                                new House("13C", "Audit Town", "City 13", "State 13", detail13),
                                new House("13D", "Tax Block", "City 13", "State 13", detail13)
                        })
        };
        Company company13 = new Company("FinTrust Pvt Ltd", "Finance Road", "finance", 1013, owners13);
        Product product13 = new Product("LedgerPro", 8913, 159, "finance software", company13);
//--------------------------------------------------------------------------------------------------------------------------------
        Ward ward14 = new Ward(14, "Ward 14", 9014, "Councilor 14");
        Constituency constituency14 = new Constituency("City 14", "District 14", 890014, "Constituency 14", ward14);
        PrimeMinister primeMinister14 = new PrimeMinister("PM Name 14", "14/07/2025", "Party 14", 14, constituency14);
        Government government14 = new Government("Federal Government", "State 14", 2014, "Capital 14", primeMinister14);
        Tax tax14 = new Tax("Entertainment Tax", 0.18, 2019, "Authority 14", government14);
        VariablePay variablePay14 = new VariablePay(8914, "Employee 14", 54000, 84000, tax14);
        Bonus bonus14 = new Bonus("Festival Bonus", 6400, "10/11/2025", "Festival reward", variablePay14);
        SalaryExpectation salaryExpected14 = new SalaryExpectation("Candidate 14", "Marketing", 70314, 4, bonus14);
        List<Criteria> criteria14 = Arrays.asList(
                new Criteria("MBA in Marketing", "Required", 7, "Reviewer A", salaryExpected14),
                new Criteria("Digital marketing experience", "Preferred", 6, "Reviewer B", salaryExpected14)
        );
        Role role14 = new Role("Marketing Executive", "Handles campaigns", 85714, 5, criteria14);
        Designation designation14 = new Designation("Marketing Director", "Head of Marketing", "Marketing", 89014, role14);
        President president14 = new President("President 14", "CMO", 14, "2323145678", designation14);
        University university14 = new University("Marketing University 14", "City 14", 1994, "Promo Road", president14);
        Education education14 = new Education("MBA", "Marketing University 14", 2023, 8.3, university14);
        List<Experience> experience14 = Arrays.asList(
                new Experience("Google", "Marketing Analyst", 3, "City 14", education14),
                new Experience("Facebook", "Digital Marketer", 5, "City 14", education14)
        );
        Inspector inspector14 = new Inspector("Inspector 14", "Auditor", 13, "9999414141", experience14);
        RTO rto14 = new RTO(56714, "City 14", "WB-14", "2323145678", inspector14);
        Registration registration14 = new Registration(89014, "Bike", "Neha Verma", "Promo Street", rto14);
        Vehicle vehicle14 = new Vehicle("WB-14-BK-8914", "Bike", 2023, "Hero", registration14);
        Mayor mayor14 = new Mayor("Mayor 14", "Mayor of City 14", 6, "4567141414", vehicle14);
        Information information14 = new Information(7814, "850 sqr", "https://info/14", "5678914141", mayor14);
        City city14 = new City("City 14", "State 14", 56794, "Zone-14", information14);
        Address address14 = new Address("Road 14", "City 14", "State 14", "India", city14);
        Details detail14 = new Details("Neha Verma", "Marketing Head", "9999414141", 29, address14);
        Owner[] owners14 = {
                new Owner("Owner A 14", "9333341414", "ownera14@mail.com", "City 14",
                        new House[]{
                                new House("14A", "Media Street", "City 14", "State 14", detail14),
                                new House("14B", "Promo Heights", "City 14", "State 14", detail14)
                        }),
                new Owner("Owner B 14", "9405841414", "ownerb14@mail.com", "City 14",
                        new House[]{
                                new House("14C", "Ad Zone", "City 14", "State 14", detail14),
                                new House("14D", "Brand Colony", "City 14", "State 14", detail14)
                        })
        };
        Company company14 = new Company("AdPro Ltd", "Media Park", "ads", 1014, owners14);
        Product product14 = new Product("AdSuite", 8914, 119, "advertising", company14);
//-----------------------------------------------------------------------------------------------------------------------------------
        Ward ward15 = new Ward(15, "Ward 15", 9015, "Councilor 15");
        Constituency constituency15 = new Constituency("City 15", "District 15", 890015, "Constituency 15", ward15);
        PrimeMinister primeMinister15 = new PrimeMinister("PM Name 15", "15/08/2025", "Party 15", 15, constituency15);
        Government government15 = new Government("Union Government", "State 15", 2015, "Capital 15", primeMinister15);
        Tax tax15 = new Tax("Excise Duty", 0.22, 2022, "Authority 15", government15);
        VariablePay variablePay15 = new VariablePay(8915, "Employee 15", 55000, 85000, tax15);
        Bonus bonus15 = new Bonus("Quarterly Bonus", 6500, "31/03/2025", "Quarterly reward", variablePay15);
        SalaryExpectation salaryExpected15 = new SalaryExpectation("Candidate 15", "Operations", 70315, 3, bonus15);
        List<Criteria> criteria15 = Arrays.asList(
                new Criteria("Engineering Degree", "Required", 6, "Reviewer A", salaryExpected15),
                new Criteria("Experience in logistics", "Preferred", 5, "Reviewer B", salaryExpected15)
        );
        Role role15 = new Role("Operations Manager", "Manages operations", 85715, 4, criteria15);
        Designation designation15 = new Designation("Chief Operations Officer", "COO", "Operations", 89015, role15);
        President president15 = new President("President 15", "COO President", 15, "2323156789", designation15);
        University university15 = new University("Tech University 15", "City 15", 1995, "Tech Street", president15);
        Education education15 = new Education("B.Tech", "Tech University 15", 2020, 8.4, university15);
        List<Experience> experience15 = Arrays.asList(
                new Experience("Amazon", "Ops Associate", 2, "City 15", education15),
                new Experience("Flipkart", "Ops Lead", 4, "City 15", education15)
        );
        Inspector inspector15 = new Inspector("Inspector 15", "Supply Inspector", 12, "9999515151", experience15);
        RTO rto15 = new RTO(56715, "City 15", "WB-15", "2323156789", inspector15);
        Registration registration15 = new Registration(89015, "Van", "Priya Singh", "Warehouse Road", rto15);
        Vehicle vehicle15 = new Vehicle("WB-15-VN-8915", "Van", 2021, "Tata", registration15);
        Mayor mayor15 = new Mayor("Mayor 15", "Mayor of City 15", 8, "4567151515", vehicle15);
        Information information15 = new Information(7815, "870 sqr", "https://info/15", "5678915151", mayor15);
        City city15 = new City("City 15", "State 15", 56795, "Zone-15", information15);
        Address address15 = new Address("Road 15", "City 15", "State 15", "India", city15);
        Details detail15 = new Details("Priya Singh", "Operations Manager", "9999515151", 31, address15);
        Owner[] owners15 = {
                new Owner("Owner A 15", "9333351515", "ownera15@mail.com", "City 15",
                        new House[]{
                                new House("15A", "Ops Street", "City 15", "State 15", detail15),
                                new House("15B", "Logistics Lane", "City 15", "State 15", detail15)
                        }),
                new Owner("Owner B 15", "9405851515", "ownerb15@mail.com", "City 15",
                        new House[]{
                                new House("15C", "Supply Colony", "City 15", "State 15", detail15),
                                new House("15D", "Ops Block", "City 15", "State 15", detail15)
                        })
        };
        Company company15 = new Company("OpsFlow Pvt Ltd", "Logistics Hub", "ops", 1015, owners15);
        Product product15 = new Product("LogiTrack", 8915, 179, "logistics", company15);
//------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward16 = new Ward(16, "Ward 16", 9016, "Councilor 16");
        Constituency constituency16 = new Constituency("City 16", "District 16", 890016, "Constituency 16", ward16);
        PrimeMinister primeMinister16 = new PrimeMinister("PM Name 16", "16/07/2025", "Party 16", 16, constituency16);
        Government government16 = new Government("Central Government", "State 16", 2016, "Capital 16", primeMinister16);
        Tax tax16 = new Tax("Service Tax", 0.20, 2016, "Authority 16", government16);
        VariablePay variablePay16 = new VariablePay(8916, "Employee 16", 56000, 86000, tax16);
        Bonus bonus16 = new Bonus("Annual Bonus", 6600, "31/12/2025", "Annual reward", variablePay16);
        SalaryExpectation salaryExpected16 = new SalaryExpectation("Candidate 16", "Finance", 70316, 6, bonus16);
        List<Criteria> criteria16 = Arrays.asList(
                new Criteria("CA Certification", "Required", 7, "Reviewer X", salaryExpected16),
                new Criteria("5+ years of accounting experience", "Preferred", 5, "Reviewer Y", salaryExpected16)
        );
        Role role16 = new Role("Financial Analyst", "Handles budgeting", 85716, 4, criteria16);
        Designation designation16 = new Designation("Finance Director", "Leads finance team", "Finance", 89016, role16);
        President president16 = new President("President 16", "CFO", 16, "2323161616", designation16);
        University university16 = new University("Finance University 16", "City 16", 1996, "Money Road", president16);
        Education education16 = new Education("CA", "Finance University 16", 2018, 8.9, university16);
        List<Experience> experience16 = Arrays.asList(
                new Experience("KPMG", "Auditor", 4, "City 16", education16),
                new Experience("EY", "Finance Analyst", 3, "City 16", education16)
        );
        Inspector inspector16 = new Inspector("Inspector 16", "Audit Officer", 11, "9999616161", experience16);
        RTO rto16 = new RTO(56716, "City 16", "WB-16", "2323161616", inspector16);
        Registration registration16 = new Registration(89016, "Sedan", "Rohan Malhotra", "Finance Street", rto16);
        Vehicle vehicle16 = new Vehicle("WB-16-SD-8916", "Sedan", 2022, "Honda", registration16);
        Mayor mayor16 = new Mayor("Mayor 16", "Mayor of City 16", 6, "4567161616", vehicle16);
        Information information16 = new Information(7816, "860 sqr", "https://info/16", "5678916161", mayor16);
        City city16 = new City("City 16", "State 16", 56796, "Zone-16", information16);
        Address address16 = new Address("Finance Street", "City 16", "State 16", "India", city16);
        Details detail16 = new Details("Rohan Malhotra", "Finance Expert", "9999616161", 30, address16);
        Owner[] owners16 = {
                new Owner("Owner A 16", "9333361616", "ownera16@mail.com", "City 16",
                        new House[]{
                                new House("16A", "Tax Lane", "City 16", "State 16", detail16),
                                new House("16B", "Audit Heights", "City 16", "State 16", detail16)
                        }),
                new Owner("Owner B 16", "9405861616", "ownerb16@mail.com", "City 16",
                        new House[]{
                                new House("16C", "Budget Street", "City 16", "State 16", detail16),
                                new House("16D", "Finance Block", "City 16", "State 16", detail16)
                        })
        };
        Company company16 = new Company("FinSmart Ltd", "Budget Complex", "fin", 1016, owners16);
        Product product16 = new Product("FinTracker", 8916, 129, "finance", company16);
//---------------------------------------------------------------------------------------------------------------------------------------
        Ward ward17 = new Ward(17, "Ward 17", 9017, "Councilor 17");
        Constituency constituency17 = new Constituency("City 17", "District 17", 890017, "Constituency 17", ward17);
        PrimeMinister primeMinister17 = new PrimeMinister("PM Name 17", "17/07/2025", "Party 17", 17, constituency17);
        Government government17 = new Government("Union Government", "State 17", 2017, "Capital 17", primeMinister17);
        Tax tax17 = new Tax("Green Tax", 0.16, 2021, "Authority 17", government17);
        VariablePay variablePay17 = new VariablePay(8917, "Employee 17", 57000, 87000, tax17);
        Bonus bonus17 = new Bonus("Green Bonus", 6700, "01/06/2025", "Eco-friendly reward", variablePay17);
        SalaryExpectation salaryExpected17 = new SalaryExpectation("Candidate 17", "Environment", 70317, 5, bonus17);
        List<Criteria> criteria17 = Arrays.asList(
                new Criteria("Environmental Science degree", "Required", 8, "Reviewer A", salaryExpected17),
                new Criteria("Project management experience", "Preferred", 6, "Reviewer B", salaryExpected17)
        );
        Role role17 = new Role("Environmental Officer", "Monitors sustainability", 85717, 5, criteria17);
        Designation designation17 = new Designation("Chief Sustainability Officer", "Heads ESG initiatives", "Environment", 89017, role17);
        President president17 = new President("President 17", "CSO", 17, "2323171717", designation17);
        University university17 = new University("Green University 17", "City 17", 1997, "Nature Street", president17);
        Education education17 = new Education("M.Sc. Environmental Science", "Green University 17", 2021, 9.1, university17);
        List<Experience> experience17 = Arrays.asList(
                new Experience("UNDP", "Sustainability Intern", 2, "City 17", education17),
                new Experience("WWF", "Eco Officer", 3, "City 17", education17)
        );
        Inspector inspector17 = new Inspector("Inspector 17", "Eco Inspector", 10, "9999717171", experience17);
        RTO rto17 = new RTO(56717, "City 17", "WB-17", "2323171717", inspector17);
        Registration registration17 = new Registration(89017, "Electric Car", "Isha Sharma", "Greenway Road", rto17);
        Vehicle vehicle17 = new Vehicle("WB-17-EV-8917", "Electric Car", 2024, "Tesla", registration17);
        Mayor mayor17 = new Mayor("Mayor 17", "Mayor of City 17", 7, "4567171717", vehicle17);
        Information information17 = new Information(7817, "870 sqr", "https://info/17", "5678917171", mayor17);
        City city17 = new City("City 17", "State 17", 56797, "Zone-17", information17);
        Address address17 = new Address("Greenway Road", "City 17", "State 17", "India", city17);
        Details detail17 = new Details("Isha Sharma", "Environmentalist", "9999717171", 28, address17);
        Owner[] owners17 = {
                new Owner("Owner A 17", "9333371717", "ownera17@mail.com", "City 17",
                        new House[]{
                                new House("17A", "Nature Valley", "City 17", "State 17", detail17),
                                new House("17B", "Eco Zone", "City 17", "State 17", detail17)
                        }),
                new Owner("Owner B 17", "9405871717", "ownerb17@mail.com", "City 17",
                        new House[]{
                                new House("17C", "Sustain Street", "City 17", "State 17", detail17),
                                new House("17D", "Planet Plaza", "City 17", "State 17", detail17)
                        })
        };
        Company company17 = new Company("GreenTech India", "Eco Center", "eco", 1017, owners17);
        Product product17 = new Product("EcoTracker", 8917, 149, "environment", company17);
//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward18 = new Ward(18, "Ward 18", 9018, "Councilor 18");
        Constituency constituency18 = new Constituency("City 18", "District 18", 890018, "Constituency 18", ward18);
        PrimeMinister primeMinister18 = new PrimeMinister("PM Name 18", "18/07/2025", "Party 18", 18, constituency18);
        Government government18 = new Government("State Government", "State 18", 2018, "Capital 18", primeMinister18);
        Tax tax18 = new Tax("Luxury Tax", 0.22, 2022, "Authority 18", government18);
        VariablePay variablePay18 = new VariablePay(8918, "Employee 18", 58000, 88000, tax18);
        Bonus bonus18 = new Bonus("Festival Bonus", 6800, "01/10/2025", "For Diwali celebration", variablePay18);
        SalaryExpectation salaryExpected18 = new SalaryExpectation("Candidate 18", "Admin", 70318, 4, bonus18);
        List<Criteria> criteria18 = Arrays.asList(
                new Criteria("Administrative Diploma", "Required", 4, "Reviewer X", salaryExpected18),
                new Criteria("2+ years experience", "Preferred", 3, "Reviewer Y", salaryExpected18)
        );
        Role role18 = new Role("Office Admin", "Oversees administrative tasks", 85718, 2, criteria18);
        Designation designation18 = new Designation("Admin Manager", "Manages admin", "Admin", 89018, role18);
        President president18 = new President("President 18", "Manager", 18, "2323181818", designation18);
        University university18 = new University("Admin University 18", "City 18", 1998, "Admin Road", president18);
        Education education18 = new Education("BBA", "Admin University 18", 2019, 8.3, university18);
        List<Experience> experience18 = Arrays.asList(
                new Experience("TCS", "Admin", 2, "City 18", education18),
                new Experience("Wipro", "Coordinator", 1, "City 18", education18)
        );
        Inspector inspector18 = new Inspector("Inspector 18", "Admin Officer", 6, "9999818181", experience18);
        RTO rto18 = new RTO(56718, "City 18", "WB-18", "2323181818", inspector18);
        Registration registration18 = new Registration(89018, "SUV", "Meena Rao", "Admin Road", rto18);
        Vehicle vehicle18 = new Vehicle("WB-18-SUV-8918", "SUV", 2023, "Hyundai", registration18);
        Mayor mayor18 = new Mayor("Mayor 18", "Mayor of City 18", 3, "4567181818", vehicle18);
        Information information18 = new Information(7818, "880 sqr", "https://info/18", "5678918181", mayor18);
        City city18 = new City("City 18", "State 18", 56798, "Zone-18", information18);
        Address address18 = new Address("Admin Road", "City 18", "State 18", "India", city18);
        Details detail18 = new Details("Meena Rao", "Admin Expert", "9999818181", 29, address18);
        Owner[] owners18 = {
                new Owner("Owner A 18", "9333381818", "ownera18@mail.com", "City 18",
                        new House[]{
                                new House("18A", "Station Rd", "City 18", "State 18", detail18),
                                new House("18B", "Central St", "City 18", "State 18", detail18)
                        }),
                new Owner("Owner B 18", "9405881818", "ownerb18@mail.com", "City 18",
                        new House[]{
                                new House("18C", "North Avenue", "City 18", "State 18", detail18),
                                new House("18D", "Market Lane", "City 18", "State 18", detail18)
                        })
        };
        Company company18 = new Company("AdminTech", "Admin Park", "admin", 1018, owners18);
        Product product18 = new Product("AdminSuite", 8918, 119, "admin", company18);
//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward19 = new Ward(19, "Ward 19", 9019, "Councilor 19");
        Constituency constituency19 = new Constituency("City 19", "District 19", 890019, "Constituency 19", ward19);
        PrimeMinister primeMinister19 = new PrimeMinister("PM Name 19", "19/07/2025", "Party 19", 19, constituency19);
        Government government19 = new Government("Union Government", "State 19", 2019, "Capital 19", primeMinister19);
        Tax tax19 = new Tax("Income Tax", 0.18, 2023, "Authority 19", government19);
        VariablePay variablePay19 = new VariablePay(8919, "Employee 19", 59000, 89000, tax19);
        Bonus bonus19 = new Bonus("Quarterly Bonus", 6900, "01/09/2025", "Quarter performance", variablePay19);
        SalaryExpectation salaryExpected19 = new SalaryExpectation("Candidate 19", "Marketing", 70319, 5, bonus19);
        List<Criteria> criteria19 = Arrays.asList(
                new Criteria("MBA in Marketing", "Required", 5, "Reviewer A", salaryExpected19),
                new Criteria("Strong communication skills", "Preferred", 4, "Reviewer B", salaryExpected19)
        );
        Role role19 = new Role("Marketing Lead", "Handles marketing campaigns", 85719, 3, criteria19);
        Designation designation19 = new Designation("Marketing Manager", "Heads marketing", "Marketing", 89019, role19);
        President president19 = new President("President 19", "CMO", 19, "2323191919", designation19);
        University university19 = new University("Marketing University 19", "City 19", 1999, "Promo Street", president19);
        Education education19 = new Education("MBA", "Marketing University 19", 2020, 8.7, university19);
        List<Experience> experience19 = Arrays.asList(
                new Experience("Amazon", "Marketing Exec", 2, "City 19", education19),
                new Experience("Flipkart", "Brand Manager", 3, "City 19", education19)
        );
        Inspector inspector19 = new Inspector("Inspector 19", "Marketing Officer", 7, "9999919191", experience19);
        RTO rto19 = new RTO(56719, "City 19", "WB-19", "2323191919", inspector19);
        Registration registration19 = new Registration(89019, "Bike", "Aniket Rao", "Promo Street", rto19);
        Vehicle vehicle19 = new Vehicle("WB-19-BK-8919", "Bike", 2022, "Bajaj", registration19);
        Mayor mayor19 = new Mayor("Mayor 19", "Mayor of City 19", 4, "4567191919", vehicle19);
        Information information19 = new Information(7819, "890 sqr", "https://info/19", "5678919191", mayor19);
        City city19 = new City("City 19", "State 19", 56799, "Zone-19", information19);
        Address address19 = new Address("Promo Street", "City 19", "State 19", "India", city19);
        Details detail19 = new Details("Aniket Rao", "Marketing Head", "9999919191", 31, address19);
        Owner[] owners19 = {
                new Owner("Owner A 19", "9333391919", "ownera19@mail.com", "City 19",
                        new House[]{
                                new House("19A", "Media Road", "City 19", "State 19", detail19),
                                new House("19B", "Ad Avenue", "City 19", "State 19", detail19)
                        }),
                new Owner("Owner B 19", "9405891919", "ownerb19@mail.com", "City 19",
                        new House[]{
                                new House("19C", "Creative St", "City 19", "State 19", detail19),
                                new House("19D", "Strategy Lane", "City 19", "State 19", detail19)
                        })
        };
        Company company19 = new Company("MarketWiz", "Campaign HQ", "mkt", 1019, owners19);
        Product product19 = new Product("PromoMaster", 8919, 139, "marketing", company19);
//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward20 = new Ward(20, "Ward 20", 9020, "Councilor 20");
        Constituency constituency20 = new Constituency("City 20", "District 20", 890020, "Constituency 20", ward20);
        PrimeMinister primeMinister20 = new PrimeMinister("PM Name 20", "20/07/2025", "Party 20", 20, constituency20);
        Government government20 = new Government("State Government", "State 20", 2020, "Capital 20", primeMinister20);
        Tax tax20 = new Tax("Digital Tax", 0.17, 2024, "Authority 20", government20);
        VariablePay variablePay20 = new VariablePay(8920, "Employee 20", 60000, 90000, tax20);
        Bonus bonus20 = new Bonus("Technology Bonus", 7000, "01/12/2025", "Innovation reward", variablePay20);
        SalaryExpectation salaryExpected20 = new SalaryExpectation("Candidate 20", "IT", 70320, 6, bonus20);
        List<Criteria> criteria20 = Arrays.asList(
                new Criteria("Computer Science degree", "Required", 6, "Reviewer A", salaryExpected20),
                new Criteria("Cloud knowledge", "Preferred", 4, "Reviewer B", salaryExpected20)
        );
        Role role20 = new Role("Cloud Engineer", "Works on AWS", 85720, 4, criteria20);
        Designation designation20 = new Designation("DevOps Manager", "Manages DevOps", "IT", 89020, role20);
        President president20 = new President("President 20", "CTO", 20, "2323202020", designation20);
        University university20 = new University("Tech University 20", "City 20", 2000, "Innovation Blvd", president20);
        Education education20 = new Education("B.Tech", "Tech University 20", 2022, 9.2, university20);
        List<Experience> experience20 = Arrays.asList(
                new Experience("Google", "Cloud Intern", 1, "City 20", education20),
                new Experience("Azure", "Cloud Engineer", 2, "City 20", education20)
        );
        Inspector inspector20 = new Inspector("Inspector 20", "Cloud Officer", 5, "9999020202", experience20);
        RTO rto20 = new RTO(56720, "City 20", "WB-20", "2323202020", inspector20);
        Registration registration20 = new Registration(89020, "Electric Bike", "Arjun Iyer", "Tech Park", rto20);
        Vehicle vehicle20 = new Vehicle("WB-20-EB-8920", "Electric Bike", 2024, "Ather", registration20);
        Mayor mayor20 = new Mayor("Mayor 20", "Mayor of City 20", 5, "4567202020", vehicle20);
        Information information20 = new Information(7820, "900 sqr", "https://info/20", "5678920202", mayor20);
        City city20 = new City("City 20", "State 20", 56800, "Zone-20", information20);
        Address address20 = new Address("Tech Park", "City 20", "State 20", "India", city20);
        Details detail20 = new Details("Arjun Iyer", "Cloud Specialist", "9999020202", 27, address20);
        Owner[] owners20 = {
                new Owner("Owner A 20", "9333402020", "ownera20@mail.com", "City 20",
                        new House[]{
                                new House("20A", "Cloud Lane", "City 20", "State 20", detail20),
                                new House("20B", "Infra Zone", "City 20", "State 20", detail20)
                        }),
                new Owner("Owner B 20", "9405802020", "ownerb20@mail.com", "City 20",
                        new House[]{
                                new House("20C", "DevOps Rd", "City 20", "State 20", detail20),
                                new House("20D", "Backend Street", "City 20", "State 20", detail20)
                        })
        };
        Company company20 = new Company("Cloudify", "Tech Campus", "cloud", 1020, owners20);
        Product product20 = new Product("CloudCore", 8920, 159, "technology", company20);
//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward21 = new Ward(21, "Ward 21", 9021, "Councilor 21");
        Constituency constituency21 = new Constituency("City 21", "District 21", 890021, "Constituency 21", ward21);
        PrimeMinister primeMinister21 = new PrimeMinister("PM Name 21", "21/08/2025", "Party 21", 21, constituency21);
        Government government21 = new Government("Union Government", "State 21", 2021, "Capital 21", primeMinister21);
        Tax tax21 = new Tax("Eco Tax", 0.15, 2023, "Authority 21", government21);
        VariablePay variablePay21 = new VariablePay(8921, "Employee 21", 61000, 91000, tax21);
        Bonus bonus21 = new Bonus("Green Bonus", 7100, "05/06/2025", "Eco-friendly award", variablePay21);
        SalaryExpectation salaryExpected21 = new SalaryExpectation("Candidate 21", "Sustainability", 70321, 7, bonus21);
        List<Criteria> criteria21 = Arrays.asList(
                new Criteria("Environmental Science degree", "Required", 8, "Reviewer E", salaryExpected21),
                new Criteria("Project management", "Preferred", 6, "Reviewer F", salaryExpected21)
        );
        Role role21 = new Role("Eco Officer", "Monitors green projects", 85721, 5, criteria21);
        Designation designation21 = new Designation("Chief Sustainability Officer", "Leads ESG", "Environment", 89021, role21);
        President president21 = new President("President 21", "CSO", 21, "2323212121", designation21);
        University university21 = new University("Green University 21", "City 21", 2001, "Eco Blvd", president21);
        Education education21 = new Education("M.Sc Environmental Science", "Green University 21", 2021, 9.0, university21);
        List<Experience> experience21 = Arrays.asList(
                new Experience("WWF", "Eco Intern", 2, "City 21", education21),
                new Experience("UNDP", "Sustainability Officer", 3, "City 21", education21)
        );
        Inspector inspector21 = new Inspector("Inspector 21", "Eco Inspector", 11, "9999212121", experience21);
        RTO rto21 = new RTO(56721, "City 21", "WB-21", "2323212121", inspector21);
        Registration registration21 = new Registration(89021, "Electric Van", "Riya Kapoor", "Eco Street", rto21);
        Vehicle vehicle21 = new Vehicle("WB-21-EV-8921", "Electric Van", 2025, "Tata EV", registration21);
        Mayor mayor21 = new Mayor("Mayor 21", "Mayor of City 21", 5, "4567212121", vehicle21);
        Information information21 = new Information(7821, "910 sqr", "https://info/21", "5678921212", mayor21);
        City city21 = new City("City 21", "State 21", 56801, "Zone-21", information21);
        Address address21 = new Address("Eco Street", "City 21", "State 21", "India", city21);
        Details detail21 = new Details("Riya Kapoor", "Eco Lead", "9999212121", 29, address21);
        Owner[] owners21 = {
                new Owner("Owner A 21", "9333321212", "ownera21@mail.com", "City 21",
                        new House[]{
                                new House("21A", "Green Lane", "City 21", "State 21", detail21),
                                new House("21B", "Eco Park", "City 21", "State 21", detail21)
                        }),
                new Owner("Owner B 21", "9405821212", "ownerb21@mail.com", "City 21",
                        new House[]{
                                new House("21C", "Forest View", "City 21", "State 21", detail21),
                                new House("21D", "River Green", "City 21", "State 21", detail21)
                        })
        };
        Company company21 = new Company("GreenTech Solutions", "Eco Center", "eco", 1021, owners21);
        Product product21 = new Product("EcoAnalytics", 8921, 199, "environmental-tech", company21);
//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward22 = new Ward(22, "Ward 22", 9022, "Councilor 22");
        Constituency constituency22 = new Constituency("City 22", "District 22", 890022, "Constituency 22", ward22);
        PrimeMinister primeMinister22 = new PrimeMinister("PM Name 22", "22/08/2025", "Party 22", 22, constituency22);
        Government government22 = new Government("Central Government", "State 22", 2022, "Capital 22", primeMinister22);
        Tax tax22 = new Tax("Entertainment Tax", 0.18, 2022, "Authority 22", government22);
        VariablePay variablePay22 = new VariablePay(8922, "Employee 22", 62000, 92000, tax22);
        Bonus bonus22 = new Bonus("Festival Bonus", 7200, "25/12/2025", "Holiday reward", variablePay22);
        SalaryExpectation salaryExpected22 = new SalaryExpectation("Candidate 22", "Media", 70322, 8, bonus22);
        List<Criteria> criteria22 = Arrays.asList(
                new Criteria("Mass Communication degree", "Required", 5, "Reviewer A", salaryExpected22),
                new Criteria("Creative writing", "Preferred", 3, "Reviewer B", salaryExpected22)
        );
        Role role22 = new Role("Media Manager", "Handles public image", 85722, 3, criteria22);
        Designation designation22 = new Designation("Head of Media", "Leads media team", "Media", 89022, role22);
        President president22 = new President("President 22", "CMO", 22, "2323222222", designation22);
        University university22 = new University("Media University", "City 22", 2002, "Broadcast Lane", president22);
        Education education22 = new Education("BMM", "Media University", 2022, 8.8, university22);
        List<Experience> experience22 = Arrays.asList(
                new Experience("Times Group", "Reporter", 2, "City 22", education22),
                new Experience("Star TV", "Producer", 4, "City 22", education22)
        );
        Inspector inspector22 = new Inspector("Inspector 22", "Broadcast Inspector", 10, "9999222222", experience22);
        RTO rto22 = new RTO(56722, "City 22", "WB-22", "2323222222", inspector22);
        Registration registration22 = new Registration(89022, "News Van", "Tanya Singh", "Media Road", rto22);
        Vehicle vehicle22 = new Vehicle("WB-22-NV-8922", "News Van", 2023, "Mahindra", registration22);
        Mayor mayor22 = new Mayor("Mayor 22", "Mayor of City 22", 5, "4567222222", vehicle22);
        Information information22 = new Information(7822, "920 sqr", "https://info/22", "5678922222", mayor22);
        City city22 = new City("City 22", "State 22", 56802, "Zone-22", information22);
        Address address22 = new Address("Media Road", "City 22", "State 22", "India", city22);
        Details detail22 = new Details("Tanya Singh", "News Director", "9999222222", 30, address22);
        Owner[] owners22 = {
                new Owner("Owner A 22", "9333322222", "ownera22@mail.com", "City 22",
                        new House[]{
                                new House("22A", "Broadcast Lane", "City 22", "State 22", detail22),
                                new House("22B", "Studio Zone", "City 22", "State 22", detail22)
                        }),
                new Owner("Owner B 22", "9405822222", "ownerb22@mail.com", "City 22",
                        new House[]{
                                new House("22C", "Film Nagar", "City 22", "State 22", detail22),
                                new House("22D", "Camera Circle", "City 22", "State 22", detail22)
                        })
        };
        Company company22 = new Company("MediaWorks", "Broadcast Tower", "media", 1022, owners22);
        Product product22 = new Product("StreamVision", 8922, 149, "media-tech", company22);
//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward23 = new Ward(23, "Ward 23", 9023, "Councilor 23");
        Constituency constituency23 = new Constituency("City 23", "District 23", 890023, "Constituency 23", ward23);
        PrimeMinister primeMinister23 = new PrimeMinister("PM Name 23", "23/08/2025", "Party 23", 23, constituency23);
        Government government23 = new Government("State Government", "State 23", 2023, "Capital 23", primeMinister23);
        Tax tax23 = new Tax("Property Tax", 0.22, 2021, "Authority 23", government23);
        VariablePay variablePay23 = new VariablePay(8923, "Employee 23", 63000, 93000, tax23);
        Bonus bonus23 = new Bonus("Property Bonus", 7300, "01/01/2026", "Asset incentive", variablePay23);
        SalaryExpectation salaryExpected23 = new SalaryExpectation("Candidate 23", "Real Estate", 70323, 9, bonus23);
        List<Criteria> criteria23 = Arrays.asList(
                new Criteria("Civil Engineering", "Required", 6, "Reviewer C", salaryExpected23),
                new Criteria("CAD skills", "Preferred", 4, "Reviewer D", salaryExpected23)
        );
        Role role23 = new Role("Site Manager", "Handles site operations", 85723, 6, criteria23);
        Designation designation23 = new Designation("Construction Lead", "Oversees builds", "Construction", 89023, role23);
        President president23 = new President("President 23", "Construction Head", 23, "2323232323", designation23);
        University university23 = new University("Builder University", "City 23", 2003, "Plot Blvd", president23);
        Education education23 = new Education("B.E. Civil", "Builder University", 2020, 8.9, university23);
        List<Experience> experience23 = Arrays.asList(
                new Experience("L&T", "Trainee Engineer", 2, "City 23", education23),
                new Experience("DLF", "Site Supervisor", 5, "City 23", education23)
        );
        Inspector inspector23 = new Inspector("Inspector 23", "Site Inspector", 12, "9999232323", experience23);
        RTO rto23 = new RTO(56723, "City 23", "WB-23", "2323232323", inspector23);
        Registration registration23 = new Registration(89023, "Truck", "Rohit Mehta", "Construction Site", rto23);
        Vehicle vehicle23 = new Vehicle("WB-23-TK-8923", "Truck", 2024, "Ashok Leyland", registration23);
        Mayor mayor23 = new Mayor("Mayor 23", "Mayor of City 23", 5, "4567232323", vehicle23);
        Information information23 = new Information(7823, "930 sqr", "https://info/23", "5678923232", mayor23);
        City city23 = new City("City 23", "State 23", 56803, "Zone-23", information23);
        Address address23 = new Address("Construction Site", "City 23", "State 23", "India", city23);
        Details detail23 = new Details("Rohit Mehta", "Engineer", "9999232323", 33, address23);
        Owner[] owners23 = {
                new Owner("Owner A 23", "9333323232", "ownera23@mail.com", "City 23",
                        new House[]{
                                new House("23A", "Plot Street", "City 23", "State 23", detail23),
                                new House("23B", "Builder Zone", "City 23", "State 23", detail23)
                        }),
                new Owner("Owner B 23", "9405823232", "ownerb23@mail.com", "City 23",
                        new House[]{
                                new House("23C", "Mason Town", "City 23", "State 23", detail23),
                                new House("23D", "Bridge Corner", "City 23", "State 23", detail23)
                        })
        };
        Company company23 = new Company("BuildCorp", "Builder Hub", "infra", 1023, owners23);
        Product product23 = new Product("InfraBase", 8923, 179, "construction", company23);
//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward24 = new Ward(24, "Ward 24", 9024, "Councilor 24");
        Constituency constituency24 = new Constituency("City 24", "District 24", 890024, "Constituency 24", ward24);
        PrimeMinister primeMinister24 = new PrimeMinister("PM Name 24", "24/08/2025", "Party 24", 24, constituency24);
        Government government24 = new Government("Federal Government", "State 24", 2024, "Capital 24", primeMinister24);
        Tax tax24 = new Tax("Import Duty", 0.19, 2024, "Authority 24", government24);
        VariablePay variablePay24 = new VariablePay(8924, "Employee 24", 64000, 94000, tax24);
        Bonus bonus24 = new Bonus("Logistics Bonus", 7400, "15/08/2025", "Freight reward", variablePay24);
        SalaryExpectation salaryExpected24 = new SalaryExpectation("Candidate 24", "Logistics", 70324, 10, bonus24);
        List<Criteria> criteria24 = Arrays.asList(
                new Criteria("Supply Chain Certification", "Required", 7, "Reviewer A", salaryExpected24),
                new Criteria("Warehouse ops", "Preferred", 5, "Reviewer B", salaryExpected24)
        );
        Role role24 = new Role("Logistics Lead", "Handles shipping", 85724, 7, criteria24);
        Designation designation24 = new Designation("Shipping Coordinator", "Logistics Head", "Logistics", 89024, role24);
        President president24 = new President("President 24", "Logistics Chief", 24, "2323242424", designation24);
        University university24 = new University("Logistics University", "City 24", 2004, "Transport Ave", president24);
        Education education24 = new Education("MBA Logistics", "Logistics University", 2023, 9.1, university24);
        List<Experience> experience24 = Arrays.asList(
                new Experience("DHL", "Ops Intern", 1, "City 24", education24),
                new Experience("FedEx", "Logistics Analyst", 3, "City 24", education24)
        );
        Inspector inspector24 = new Inspector("Inspector 24", "Freight Inspector", 7, "9999242424", experience24);
        RTO rto24 = new RTO(56724, "City 24", "WB-24", "2323242424", inspector24);
        Registration registration24 = new Registration(89024, "Container Truck", "Farhan Qureshi", "Logistics Hub", rto24);
        Vehicle vehicle24 = new Vehicle("WB-24-CT-8924", "Container Truck", 2023, "Eicher", registration24);
        Mayor mayor24 = new Mayor("Mayor 24", "Mayor of City 24", 5, "4567242424", vehicle24);
        Information information24 = new Information(7824, "940 sqr", "https://info/24", "5678924242", mayor24);
        City city24 = new City("City 24", "State 24", 56804, "Zone-24", information24);
        Address address24 = new Address("Logistics Hub", "City 24", "State 24", "India", city24);
        Details detail24 = new Details("Farhan Qureshi", "Logistics Expert", "9999242424", 31, address24);
        Owner[] owners24 = {
                new Owner("Owner A 24", "9333324242", "ownera24@mail.com", "City 24",
                        new House[]{
                                new House("24A", "Transport Ave", "City 24", "State 24", detail24),
                                new House("24B", "Cargo Circle", "City 24", "State 24", detail24)
                        }),
                new Owner("Owner B 24", "9405824242", "ownerb24@mail.com", "City 24",
                        new House[]{
                                new House("24C", "Warehouse Block", "City 24", "State 24", detail24),
                                new House("24D", "Shipment Yard", "City 24", "State 24", detail24)
                        })
        };
        Company company24 = new Company("FreightX", "Shipping HQ", "logistics", 1024, owners24);
        Product product24 = new Product("ShipTrack", 8924, 189, "freight-tech", company24);
//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward25 = new Ward(25, "Ward 25", 9025, "Councilor 25");
        Constituency constituency25 = new Constituency("City 25", "District 25", 890025, "Constituency 25", ward25);
        PrimeMinister primeMinister25 = new PrimeMinister("PM Name 25", "25/08/2025", "Party 25", 25, constituency25);
        Government government25 = new Government("Central Government", "State 25", 2025, "Capital 25", primeMinister25);
        Tax tax25 = new Tax("Health Tax", 0.20, 2025, "Authority 25", government25);
        VariablePay variablePay25 = new VariablePay(8925, "Employee 25", 65000, 95000, tax25);
        Bonus bonus25 = new Bonus("Health Bonus", 7500, "27/08/2025", "Medical benefit", variablePay25);
        SalaryExpectation salaryExpected25 = new SalaryExpectation("Candidate 25", "Healthcare", 70325, 8, bonus25);
        List<Criteria> criteria25 = Arrays.asList(
                new Criteria("MBBS or BDS", "Required", 9, "Reviewer H", salaryExpected25),
                new Criteria("Experience in Health Admin", "Preferred", 7, "Reviewer I", salaryExpected25)
        );
        Role role25 = new Role("Health Coordinator", "Manages clinics", 85725, 6, criteria25);
        Designation designation25 = new Designation("Health Superintendent", "Oversees health", "Healthcare", 89025, role25);
        President president25 = new President("President 25", "Health Board Chair", 25, "2323252525", designation25);
        University university25 = new University("Medical University 25", "City 25", 2005, "Health Ave", president25);
        Education education25 = new Education("MBBS", "Medical University 25", 2025, 9.3, university25);
        List<Experience> experience25 = Arrays.asList(
                new Experience("Apollo Hospital", "Doctor", 3, "City 25", education25),
                new Experience("Fortis Health", "Health Admin", 4, "City 25", education25)
        );
        Inspector inspector25 = new Inspector("Inspector 25", "Health Inspector", 9, "9999252525", experience25);
        RTO rto25 = new RTO(56725, "City 25", "WB-25", "2323252525", inspector25);
        Registration registration25 = new Registration(89025, "Ambulance", "Dr. Mehta", "Health Road", rto25);
        Vehicle vehicle25 = new Vehicle("WB-25-AL-8925", "Ambulance", 2023, "Maruti", registration25);
        Mayor mayor25 = new Mayor("Mayor 25", "Mayor of City 25", 6, "4567252525", vehicle25);
        Information information25 = new Information(7825, "950 sqr", "https://info/25", "5678925252", mayor25);
        City city25 = new City("City 25", "State 25", 56805, "Zone-25", information25);
        Address address25 = new Address("Health Road", "City 25", "State 25", "India", city25);
        Details detail25 = new Details("Dr. Mehta", "Health Lead", "9999252525", 35, address25);
        Owner[] owners25 = {
                new Owner("Owner A 25", "9333325252", "ownera25@mail.com", "City 25",
                        new House[]{
                                new House("25A", "Clinic Street", "City 25", "State 25", detail25),
                                new House("25B", "Pharma Lane", "City 25", "State 25", detail25)
                        }),
                new Owner("Owner B 25", "9405825252", "ownerb25@mail.com", "City 25",
                        new House[]{
                                new House("25C", "Wellness Park", "City 25", "State 25", detail25),
                                new House("25D", "CureBlock", "City 25", "State 25", detail25)
                        })
        };
        Company company25 = new Company("HealthCare Inc", "Health Campus", "health", 1025, owners25);
        Product product25 = new Product("MediTrack", 8925, 199, "health-tech", company25);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward26 = new Ward(26, "Ward 26", 9026, "Councilor 26");
        Constituency constituency26 = new Constituency("City 26", "District 26", 890026, "Constituency 26", ward26);
        PrimeMinister primeMinister26 = new PrimeMinister("PM Name 26", "26/08/2025", "Party 26", 26, constituency26);
        Government government26 = new Government("State Government", "State 26", 2026, "Capital 26", primeMinister26);
        Tax tax26 = new Tax("Education Tax", 0.19, 2024, "Authority 26", government26);
        VariablePay variablePay26 = new VariablePay(8926, "Employee 26", 66000, 96000, tax26);
        Bonus bonus26 = new Bonus("Education Bonus", 7600, "05/09/2025", "Scholarship reward", variablePay26);
        SalaryExpectation salaryExpected26 = new SalaryExpectation("Candidate 26", "Education", 70326, 9, bonus26);
        List<Criteria> criteria26 = Arrays.asList(
                new Criteria("M.Ed or B.Ed", "Required", 9, "Reviewer J", salaryExpected26),
                new Criteria("5 years teaching exp.", "Preferred", 6, "Reviewer K", salaryExpected26)
        );
        Role role26 = new Role("Education Coordinator", "Manages schools", 85726, 7, criteria26);
        Designation designation26 = new Designation("Education Superintendent", "Oversees education", "Education", 89026, role26);
        President president26 = new President("President 26", "Education Board Chair", 26, "2323262626", designation26);
        University university26 = new University("Education University 26", "City 26", 2006, "Teach Blvd", president26);
        Education education26 = new Education("M.Ed", "Education University 26", 2026, 9.1, university26);
        List<Experience> experience26 = Arrays.asList(
                new Experience("CBSE", "Teacher", 4, "City 26", education26),
                new Experience("ICSE Board", "Coordinator", 5, "City 26", education26)
        );
        Inspector inspector26 = new Inspector("Inspector 26", "Education Inspector", 10, "9999262626", experience26);
        RTO rto26 = new RTO(56726, "City 26", "WB-26", "2323262626", inspector26);
        Registration registration26 = new Registration(89026, "School Bus", "Ms. Gupta", "School Road", rto26);
        Vehicle vehicle26 = new Vehicle("WB-26-SB-8926", "School Bus", 2023, "Ashok Leyland", registration26);
        Mayor mayor26 = new Mayor("Mayor 26", "Mayor of City 26", 4, "4567262626", vehicle26);
        Information information26 = new Information(7826, "960 sqr", "https://info/26", "5678926262", mayor26);
        City city26 = new City("City 26", "State 26", 56806, "Zone-26", information26);
        Address address26 = new Address("School Road", "City 26", "State 26", "India", city26);
        Details detail26 = new Details("Ms. Gupta", "Education Lead", "9999262626", 40, address26);
        Owner[] owners26 = {
                new Owner("Owner A 26", "9333326262", "ownera26@mail.com", "City 26",
                        new House[]{
                                new House("26A", "Edu Street", "City 26", "State 26", detail26),
                                new House("26B", "Library Lane", "City 26", "State 26", detail26)
                        }),
                new Owner("Owner B 26", "9405826262", "ownerb26@mail.com", "City 26",
                        new House[]{
                                new House("26C", "Campus Park", "City 26", "State 26", detail26),
                                new House("26D", "Study Block", "City 26", "State 26", detail26)
                        })
        };
        Company company26 = new Company("EduTech Pvt Ltd", "Education Park", "edu", 1026, owners26);
        Product product26 = new Product("LearnHub", 8926, 299, "edutech", company26);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward27 = new Ward(27, "Ward 27", 9027, "Councilor 27");
        Constituency constituency27 = new Constituency("City 27", "District 27", 890027, "Constituency 27", ward27);
        PrimeMinister primeMinister27 = new PrimeMinister("PM Name 27", "27/09/2025", "Party 27", 27, constituency27);
        Government government27 = new Government("Central Government", "State 27", 2027, "Capital 27", primeMinister27);
        Tax tax27 = new Tax("Transport Tax", 0.18, 2025, "Authority 27", government27);
        VariablePay variablePay27 = new VariablePay(8927, "Employee 27", 67000, 97000, tax27);
        Bonus bonus27 = new Bonus("Transport Bonus", 7700, "15/09/2025", "Travel reward", variablePay27);
        SalaryExpectation salaryExpected27 = new SalaryExpectation("Candidate 27", "Transport", 70327, 5, bonus27);
        List<Criteria> criteria27 = Arrays.asList(
                new Criteria("Logistics degree", "Required", 6, "Reviewer L", salaryExpected27),
                new Criteria("Fleet management exp.", "Preferred", 7, "Reviewer M", salaryExpected27)
        );
        Role role27 = new Role("Transport Coordinator", "Manages fleet", 85727, 5, criteria27);
        Designation designation27 = new Designation("Transport Superintendent", "Oversees transit", "Transport", 89027, role27);
        President president27 = new President("President 27", "Transport Board Chief", 27, "2323272727", designation27);
        University university27 = new University("Transit University", "City 27", 2007, "Transit Blvd", president27);
        Education education27 = new Education("B.Sc Logistics", "Transit University", 2023, 9.0, university27);
        List<Experience> experience27 = Arrays.asList(
                new Experience("BSNL", "Coordinator", 3, "City 27", education27),
                new Experience("Indian Railways", "Manager", 6, "City 27", education27)
        );
        Inspector inspector27 = new Inspector("Inspector 27", "Transport Inspector", 13, "9999272727", experience27);
        RTO rto27 = new RTO(56727, "City 27", "WB-27", "2323272727", inspector27);
        Registration registration27 = new Registration(89027, "Truck", "Sunil Reddy", "Transit Road", rto27);
        Vehicle vehicle27 = new Vehicle("WB-27-TK-8927", "Truck", 2022, "Tata", registration27);
        Mayor mayor27 = new Mayor("Mayor 27", "Mayor of City 27", 5, "4567272727", vehicle27);
        Information information27 = new Information(7827, "970 sqr", "https://info/27", "5678927272", mayor27);
        City city27 = new City("City 27", "State 27", 56807, "Zone-27", information27);
        Address address27 = new Address("Transit Road", "City 27", "State 27", "India", city27);
        Details detail27 = new Details("Sunil Reddy", "Transport Lead", "9999272727", 38, address27);
        Owner[] owners27 = {
                new Owner("Owner A 27", "9333327272", "ownera27@mail.com", "City 27",
                        new House[]{
                                new House("27A", "Fleet Street", "City 27", "State 27", detail27),
                                new House("27B", "Depot Lane", "City 27", "State 27", detail27)
                        }),
                new Owner("Owner B 27", "9405827272", "ownerb27@mail.com", "City 27",
                        new House[]{
                                new House("27C", "Transport Park", "City 27", "State 27", detail27),
                                new House("27D", "Garage Block", "City 27", "State 27", detail27)
                        })
        };
        Company company27 = new Company("TransitCorp", "Transport Hub", "transport", 1027, owners27);
        Product product27 = new Product("FleetManager", 8927, 229, "transport-tech", company27);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward28 = new Ward(28, "Ward 28", 9028, "Councilor 28");
        Constituency constituency28 = new Constituency("City 28", "District 28", 890028, "Constituency 28", ward28);
        PrimeMinister primeMinister28 = new PrimeMinister("PM Name 28", "28/09/2025", "Party 28", 28, constituency28);
        Government government28 = new Government("Federal Government", "State 28", 2028, "Capital 28", primeMinister28);
        Tax tax28 = new Tax("Green Tax", 0.14, 2025, "Authority 28", government28);
        VariablePay variablePay28 = new VariablePay(8928, "Employee 28", 68000, 98000, tax28);
        Bonus bonus28 = new Bonus("Eco Bonus", 7800, "20/10/2025", "Environment project bonus", variablePay28);
        SalaryExpectation salaryExpected28 = new SalaryExpectation("Candidate 28", "Environmental Science", 70328, 7, bonus28);
        List<Criteria> criteria28 = Arrays.asList(
                new Criteria("Env. Science Degree", "Required", 7, "Reviewer N", salaryExpected28),
                new Criteria("Sustainability exp.", "Preferred", 5, "Reviewer O", salaryExpected28)
        );
        Role role28 = new Role("Sustainability Officer", "Leads green initiatives", 85728, 5, criteria28);
        Designation designation28 = new Designation("Green Chief", "Leads Env Dept", "Environment", 89028, role28);
        President president28 = new President("President 28", "Environment Director", 28, "2323282828", designation28);
        University university28 = new University("Eco University", "City 28", 2008, "Eco Blvd", president28);
        Education education28 = new Education("B.Sc Env Science", "Eco University", 2023, 8.9, university28);
        List<Experience> experience28 = Arrays.asList(
                new Experience("UNDP", "Env. Intern", 2, "City 28", education28),
                new Experience("WWF", "Env Specialist", 4, "City 28", education28)
        );
        Inspector inspector28 = new Inspector("Inspector 28", "Eco Inspector", 8, "9999282828", experience28);
        RTO rto28 = new RTO(56728, "City 28", "WB-28", "2323282828", inspector28);
        Registration registration28 = new Registration(89028, "Electric Van", "Nisha Patel", "Green Valley", rto28);
        Vehicle vehicle28 = new Vehicle("WB-28-EV-8928", "Electric Van", 2024, "Tata", registration28);
        Mayor mayor28 = new Mayor("Mayor 28", "Mayor of City 28", 5, "4567282828", vehicle28);
        Information information28 = new Information(7828, "980 sqr", "https://info/28", "5678928282", mayor28);
        City city28 = new City("City 28", "State 28", 56808, "Zone-28", information28);
        Address address28 = new Address("Green Valley", "City 28", "State 28", "India", city28);
        Details detail28 = new Details("Nisha Patel", "Sustainability Lead", "9999282828", 32, address28);
        Owner[] owners28 = {
                new Owner("Owner A 28", "9333328282", "ownera28@mail.com", "City 28",
                        new House[]{
                                new House("28A", "Eco Street", "City 28", "State 28", detail28),
                                new House("28B", "Nature Lane", "City 28", "State 28", detail28)
                        }),
                new Owner("Owner B 28", "9405828282", "ownerb28@mail.com", "City 28",
                        new House[]{
                                new House("28C", "Solar Park", "City 28", "State 28", detail28),
                                new House("28D", "Wind Avenue", "City 28", "State 28", detail28)
                        })
        };
        Company company28 = new Company("GreenTech Ltd", "Eco Park", "green", 1028, owners28);
        Product product28 = new Product("EcoSuite", 8928, 259, "environmental-tech", company28);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward29 = new Ward(29, "Ward 29", 9029, "Councilor 29");
        Constituency constituency29 = new Constituency("City 29", "District 29", 890029, "Constituency 29", ward29);
        PrimeMinister primeMinister29 = new PrimeMinister("PM Name 29", "29/10/2025", "Party 29", 29, constituency29);
        Government government29 = new Government("National Government", "State 29", 2029, "Capital 29", primeMinister29);
        Tax tax29 = new Tax("Energy Tax", 0.21, 2025, "Authority 29", government29);
        VariablePay variablePay29 = new VariablePay(8929, "Employee 29", 69000, 99000, tax29);
        Bonus bonus29 = new Bonus("Energy Bonus", 7900, "25/10/2025", "Clean energy reward", variablePay29);
        SalaryExpectation salaryExpected29 = new SalaryExpectation("Candidate 29", "Energy Sector", 70329, 6, bonus29);
        List<Criteria> criteria29 = Arrays.asList(
                new Criteria("Electrical Eng.", "Required", 8, "Reviewer P", salaryExpected29),
                new Criteria("Power Grid exp.", "Preferred", 6, "Reviewer Q", salaryExpected29)
        );
        Role role29 = new Role("Energy Analyst", "Analyzes energy trends", 85729, 6, criteria29);
        Designation designation29 = new Designation("Power Director", "Manages power systems", "Energy", 89029, role29);
        President president29 = new President("President 29", "Energy Board Lead", 29, "2323292929", designation29);
        University university29 = new University("Energy University", "City 29", 2009, "Energy Blvd", president29);
        Education education29 = new Education("B.Tech EE", "Energy University", 2023, 8.8, university29);
        List<Experience> experience29 = Arrays.asList(
                new Experience("NTPC", "Engineer", 3, "City 29", education29),
                new Experience("Adani Power", "Analyst", 2, "City 29", education29)
        );
        Inspector inspector29 = new Inspector("Inspector 29", "Energy Inspector", 6, "9999292929", experience29);
        RTO rto29 = new RTO(56729, "City 29", "WB-29", "2323292929", inspector29);
        Registration registration29 = new Registration(89029, "EV Car", "Rohit Singh", "Energy Road", rto29);
        Vehicle vehicle29 = new Vehicle("WB-29-EV-8929", "EV Car", 2024, "Hyundai", registration29);
        Mayor mayor29 = new Mayor("Mayor 29", "Mayor of City 29", 4, "4567292929", vehicle29);
        Information information29 = new Information(7829, "990 sqr", "https://info/29", "5678929292", mayor29);
        City city29 = new City("City 29", "State 29", 56809, "Zone-29", information29);
        Address address29 = new Address("Energy Road", "City 29", "State 29", "India", city29);
        Details detail29 = new Details("Rohit Singh", "Energy Analyst", "9999292929", 30, address29);
        Owner[] owners29 = {
                new Owner("Owner A 29", "9333329292", "ownera29@mail.com", "City 29",
                        new House[]{
                                new House("29A", "Power Lane", "City 29", "State 29", detail29),
                                new House("29B", "Energy Tower", "City 29", "State 29", detail29)
                        }),
                new Owner("Owner B 29", "9405829292", "ownerb29@mail.com", "City 29",
                        new House[]{
                                new House("29C", "Fuel Street", "City 29", "State 29", detail29),
                                new House("29D", "Solar Colony", "City 29", "State 29", detail29)
                        })
        };
        Company company29 = new Company("PowerGrid Pvt Ltd", "Energy Hub", "power", 1029, owners29);
        Product product29 = new Product("WattPro", 8929, 279, "energy-tech", company29);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward30 = new Ward(30, "Ward 30", 9030, "Councilor 30");
        Constituency constituency30 = new Constituency("City 30", "District 30", 890030, "Constituency 30", ward30);
        PrimeMinister primeMinister30 = new PrimeMinister("PM Name 30", "30/10/2025", "Party 30", 30, constituency30);
        Government government30 = new Government("Unified Government", "State 30", 2030, "Capital 30", primeMinister30);
        Tax tax30 = new Tax("Luxury Tax", 0.25, 2025, "Authority 30", government30);
        VariablePay variablePay30 = new VariablePay(8930, "Employee 30", 70000, 100000, tax30);
        Bonus bonus30 = new Bonus("Luxury Bonus", 8000, "01/11/2025", "High-end project bonus", variablePay30);
        SalaryExpectation salaryExpected30 = new SalaryExpectation("Candidate 30", "Luxury Sector", 70330, 10, bonus30);
        List<Criteria> criteria30 = Arrays.asList(
                new Criteria("MBA in Marketing", "Required", 10, "Reviewer R", salaryExpected30),
                new Criteria("Luxury branding", "Preferred", 8, "Reviewer S", salaryExpected30)
        );
        Role role30 = new Role("Luxury Brand Manager", "Leads high-end products", 85730, 7, criteria30);
        Designation designation30 = new Designation("Marketing Director", "Heads luxury marketing", "Luxury", 89030, role30);
        President president30 = new President("President 30", "Luxury Board Chair", 30, "2323303030", designation30);
        University university30 = new University("Luxury Academy", "City 30", 2010, "Elite Blvd", president30);
        Education education30 = new Education("MBA", "Luxury Academy", 2024, 9.4, university30);
        List<Experience> experience30 = Arrays.asList(
                new Experience("Gucci", "Brand Specialist", 4, "City 30", education30),
                new Experience("Rolex", "Marketing Exec", 5, "City 30", education30)
        );
        Inspector inspector30 = new Inspector("Inspector 30", "Luxury Inspector", 10, "9999303030", experience30);
        RTO rto30 = new RTO(56730, "City 30", "WB-30", "2323303030", inspector30);
        Registration registration30 = new Registration(89030, "Luxury Sedan", "Ritika Mehra", "Elite Street", rto30);
        Vehicle vehicle30 = new Vehicle("WB-30-LX-8930", "Luxury Sedan", 2024, "Mercedes", registration30);
        Mayor mayor30 = new Mayor("Mayor 30", "Mayor of City 30", 3, "4567303030", vehicle30);
        Information information30 = new Information(7830, "1000 sqr", "https://info/30", "5678930303", mayor30);
        City city30 = new City("City 30", "State 30", 56810, "Zone-30", information30);
        Address address30 = new Address("Elite Street", "City 30", "State 30", "India", city30);
        Details detail30 = new Details("Ritika Mehra", "Luxury Head", "9999303030", 34, address30);
        Owner[] owners30 = {
                new Owner("Owner A 30", "9333330303", "ownera30@mail.com", "City 30",
                        new House[]{
                                new House("30A", "Luxury Heights", "City 30", "State 30", detail30),
                                new House("30B", "Elite Block", "City 30", "State 30", detail30)
                        }),
                new Owner("Owner B 30", "9405830303", "ownerb30@mail.com", "City 30",
                        new House[]{
                                new House("30C", "Royal Park", "City 30", "State 30", detail30),
                                new House("30D", "Opulence Lane", "City 30", "State 30", detail30)
                        })
        };
        Company company30 = new Company("EliteLux Ltd", "Luxury Campus", "luxury", 1030, owners30);
        Product product30 = new Product("LuxMark", 8930, 349, "luxury-tech", company30);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward31 = new Ward(31, "Ward 31", 9031, "Councilor 31");
        Constituency constituency31 = new Constituency("City 31", "District 31", 890031, "Constituency 31", ward31);
        PrimeMinister primeMinister31 = new PrimeMinister("PM Name 31", "31/10/2025", "Party 31", 31, constituency31);
        Government government31 = new Government("Unified Government", "State 31", 2031, "Capital 31", primeMinister31);
        Tax tax31 = new Tax("Healthcare Tax", 0.23, 2026, "Authority 31", government31);
        VariablePay variablePay31 = new VariablePay(8931, "Employee 31", 71000, 101000, tax31);
        Bonus bonus31 = new Bonus("Medical Bonus", 8100, "01/12/2025", "Wellness reward", variablePay31);
        SalaryExpectation salaryExpected31 = new SalaryExpectation("Candidate 31", "Healthcare", 70331, 9, bonus31);
        List<Criteria> criteria31 = Arrays.asList(
                new Criteria("MBBS", "Required", 9, "Reviewer X", salaryExpected31),
                new Criteria("Clinic management exp.", "Preferred", 7, "Reviewer Y", salaryExpected31)
        );
        Role role31 = new Role("Clinic Manager", "Oversees clinic", 85731, 6, criteria31);
        Designation designation31 = new Designation("Health Director", "Leads healthcare ops", "Healthcare", 89031, role31);
        President president31 = new President("President 31", "Health Board Chair", 31, "2323313131", designation31);
        University university31 = new University("Medical University 31", "City 31", 2011, "Clinic Rd", president31);
        Education education31 = new Education("MBBS", "Medical University 31", 2025, 9.2, university31);
        List<Experience> experience31 = Arrays.asList(
                new Experience("Apollo", "Doctor", 3, "City 31", education31),
                new Experience("AIIMS", "Resident", 2, "City 31", education31)
        );
        Inspector inspector31 = new Inspector("Inspector 31", "Health Inspector", 12, "9999313131", experience31);
        RTO rto31 = new RTO(56731, "City 31", "WB-31", "2323313131", inspector31);
        Registration registration31 = new Registration(89031, "Ambulance", "Dr. Sharma", "Clinic Rd", rto31);
        Vehicle vehicle31 = new Vehicle("WB-31-AL-8931", "Ambulance", 2023, "Toyota", registration31);
        Mayor mayor31 = new Mayor("Mayor 31", "Mayor of City 31", 6, "4567313131", vehicle31);
        Information information31 = new Information(7831, "1010 sqr", "https://info/31", "5678931313", mayor31);
        City city31 = new City("City 31", "State 31", 56811, "Zone-31", information31);
        Address address31 = new Address("Clinic Rd", "City 31", "State 31", "India", city31);
        Details detail31 = new Details("Dr. Sharma", "Clinic Head", "9999313131", 40, address31);
        Owner[] owners31 = {
                new Owner("Owner A 31", "9333331313", "ownera31@mail.com", "City 31",
                        new House[]{ new House("31A", "Health Park", "City 31", "State 31", detail31),
                                new House("31B", "Wellness Ave", "City 31", "State 31", detail31) }),
                new Owner("Owner B 31", "9405831313", "ownerb31@mail.com", "City 31",
                        new House[]{ new House("31C", "Treatment Plaza", "City 31", "State 31", detail31),
                                new House("31D", "Care Block", "City 31", "State 31", detail31) })
        };
        Company company31 = new Company("HealthPlus Inc", "Health Campus", "health", 1031, owners31);
        Product product31 = new Product("ClinicPro", 8931, 219, "health-tech", company31);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward32 = new Ward(32, "Ward 32", 9032, "Councilor 32");
        Constituency constituency32 = new Constituency("City 32", "District 32", 890032, "Constituency 32", ward32);
        PrimeMinister primeMinister32 = new PrimeMinister("PM Name 32", "01/11/2025", "Party 32", 32, constituency32);
        Government government32 = new Government("Central Government", "State 32", 2032, "Capital 32", primeMinister32);
        Tax tax32 = new Tax("Education Tax", 0.20, 2027, "Authority 32", government32);
        VariablePay variablePay32 = new VariablePay(8932, "Employee 32", 72000, 102000, tax32);
        Bonus bonus32 = new Bonus("Scholarship Bonus", 8200, "10/09/2025", "Academic reward", variablePay32);
        SalaryExpectation salaryExpected32 = new SalaryExpectation("Candidate 32", "Education", 70332, 10, bonus32);
        List<Criteria> criteria32 = Arrays.asList(
                new Criteria("PhD or M.Ed", "Required", 10, "Reviewer A", salaryExpected32),
                new Criteria("Research experience", "Preferred", 8, "Reviewer B", salaryExpected32)
        );
        Role role32 = new Role("Research Coordinator", "Leads academic research", 85732, 7, criteria32);
        Designation designation32 = new Designation("Academic Director", "Oversees academics", "Education", 89032, role32);
        President president32 = new President("President 32", "University Board Chair", 32, "2323323232", designation32);
        University university32 = new University("Research University 32", "City 32", 2012, "Res Rd", president32);
        Education education32 = new Education("PhD", "Research University 32", 2025, 9.5, university32);
        List<Experience> experience32 = Arrays.asList(
                new Experience("IIT", "Research Scholar", 4, "City 32", education32),
                new Experience("IISc", "PostDoc", 3, "City 32", education32)
        );
        Inspector inspector32 = new Inspector("Inspector 32", "Education Inspector", 14, "9999323232", experience32);
        RTO rto32 = new RTO(56732, "City 32", "WB-32", "2323323232", inspector32);
        Registration registration32 = new Registration(89032, "University Bus", "Prof. Rao", "University Rd", rto32);
        Vehicle vehicle32 = new Vehicle("WB-32-UB-8932", "University Bus", 2023, "Ashok Leyland", registration32);
        Mayor mayor32 = new Mayor("Mayor 32", "Mayor of City 32", 5, "4567323232", vehicle32);
        Information information32 = new Information(7832, "1020 sqr", "https://info/32", "5678932323", mayor32);
        City city32 = new City("City 32", "State 32", 56812, "Zone-32", information32);
        Address address32 = new Address("University Rd", "City 32", "State 32", "India", city32);
        Details detail32 = new Details("Prof. Rao", "Dean", "9999323232", 50, address32);
        Owner[] owners32 = {
                new Owner("Owner A 32", "9333332323", "ownera32@mail.com", "City 32",
                        new House[]{ new House("32A", "Academic Ave", "City 32", "State 32", detail32),
                                new House("32B", "Research Lane", "City 32", "State 32", detail32) }),
                new Owner("Owner B 32", "9405832323", "ownerb32@mail.com", "City 32",
                        new House[]{ new House("32C", "Science Park", "City 32", "State 32", detail32),
                                new House("32D", "Innovation Block", "City 32", "State 32", detail32) })
        };
        Company company32 = new Company("EduResearch Corp", "Academic Campus", "edu", 1032, owners32);
        Product product32 = new Product("ResearchSuite", 8932, 299, "edutech", company32);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward33 = new Ward(33, "Ward 33", 9033, "Councilor 33");
        Constituency constituency33 = new Constituency("City 33", "District 33", 890033, "Constituency 33", ward33);
        PrimeMinister primeMinister33 = new PrimeMinister("PM Name 33", "02/12/2025", "Party 33", 33, constituency33);
        Government government33 = new Government("Union Government", "State 33", 2033, "Capital 33", primeMinister33);
        Tax tax33 = new Tax("Transport Tax", 0.19, 2028, "Authority 33", government33);
        VariablePay variablePay33 = new VariablePay(8933, "Employee 33", 73000, 103000, tax33);
        Bonus bonus33 = new Bonus("Travel Bonus", 8300, "20/12/2025", "Commute reward", variablePay33);
        SalaryExpectation salaryExpected33 = new SalaryExpectation("Candidate 33", "Transport", 70333, 8, bonus33);
        List<Criteria> criteria33 = Arrays.asList(
                new Criteria("MBA Supply Chain", "Required", 8, "Reviewer C", salaryExpected33),
                new Criteria("Logistics exp.", "Preferred", 6, "Reviewer D", salaryExpected33)
        );
        Role role33 = new Role("Supply Chain Manager", "Oversees logistics", 85733, 6, criteria33);
        Designation designation33 = new Designation("Logistics Director", "Leads logistics", "Transport", 89033, role33);
        President president33 = new President("President 33", "Transport Board Chair", 33, "2323333232", designation33);
        University university33 = new University("Logistics Univ 33", "City 33", 2013, "Logi Rd", president33);
        Education education33 = new Education("MBA Logistics", "Logistics Univ 33", 2025, 9.0, university33);
        List<Experience> experience33 = Arrays.asList(
                new Experience("DHL", "Coordinator", 3, "City 33", education33),
                new Experience("Blue Dart", "Manager", 4, "City 33", education33)
        );
        Inspector inspector33 = new Inspector("Inspector 33", "Logistics Inspector", 12, "9999333232", experience33);
        RTO rto33 = new RTO(56733, "City 33", "WB-33", "2323333232", inspector33);
        Registration registration33 = new Registration(89033, "Delivery Van", "Amit Singh", "Logi Rd", rto33);
        Vehicle vehicle33 = new Vehicle("WB-33-DV-8933", "Delivery Van", 2023, "Tata", registration33);
        Mayor mayor33 = new Mayor("Mayor 33", "Mayor of City 33", 5, "4567333232", vehicle33);
        Information information33 = new Information(7833, "1030 sqr", "https://info/33", "5678933232", mayor33);
        City city33 = new City("City 33", "State 33", 56813, "Zone-33", information33);
        Address address33 = new Address("Logi Rd", "City 33", "State 33", "India", city33);
        Details detail33 = new Details("Amit Singh", "Logistics Lead", "9999333232", 36, address33);
        Owner[] owners33 = {
                new Owner("Owner A 33", "9333333232", "ownera33@mail.com", "City 33",
                        new House[]{ new House("33A", "Depot Ln", "City 33", "State 33", detail33),
                                new House("33B", "Warehouse Rd", "City 33", "State 33", detail33) }),
                new Owner("Owner B 33", "9405833232", "ownerb33@mail.com", "City 33",
                        new House[]{ new House("33C", "Freight St", "City 33", "State 33", detail33),
                                new House("33D", "Logistics Circle", "City 33", "State 33", detail33) })
        };
        Company company33 = new Company("SupplyChain Corp", "Transport Hub", "transport", 1033, owners33);
        Product product33 = new Product("ChainMaster", 8933, 319, "logistics-tech", company33);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward34 = new Ward(34, "Ward 34", 9034, "Councilor 34");
        Constituency constituency34 = new Constituency("City 34", "District 34", 890034, "Constituency 34", ward34);
        PrimeMinister primeMinister34 = new PrimeMinister("PM Name 34", "04/01/2026", "Party 34", 34, constituency34);
        Government government34 = new Government("State Government", "State 34", 2034, "Capital 34", primeMinister34);
        Tax tax34 = new Tax("Media Tax", 0.16, 2024, "Authority 34", government34);
        VariablePay variablePay34 = new VariablePay(8934, "Employee 34", 74000, 104000, tax34);
        Bonus bonus34 = new Bonus("Media Bonus", 8400, "15/01/2026", "Broadcast reward", variablePay34);
        SalaryExpectation salaryExpected34 = new SalaryExpectation("Candidate 34", "Media", 70334, 7, bonus34);
        List<Criteria> criteria34 = Arrays.asList(
                new Criteria("Journalism degree", "Required", 7, "Reviewer A", salaryExpected34),
                new Criteria("5 years exp.", "Preferred", 6, "Reviewer B", salaryExpected34)
        );
        Role role34 = new Role("Media Coordinator", "Oversees media relations", 85734, 5, criteria34);
        Designation designation34 = new Designation("Media Director", "Leads media", "Media", 89034, role34);
        President president34 = new President("President 34", "Media Head", 34, "2323343434", designation34);
        University university34 = new University("Media University 34", "City 34", 2014, "Broadcast Rd", president34);
        Education education34 = new Education("BMM", "Media University 34", 2025, 9.0, university34);
        List<Experience> experience34 = Arrays.asList(
                new Experience("NDTV", "Reporter", 4, "City 34", education34),
                new Experience("Zee News", "Producer", 3, "City 34", education34)
        );
        Inspector inspector34 = new Inspector("Inspector 34", "Broadcast Inspector", 11, "9999343434", experience34);
        RTO rto34 = new RTO(56734, "City 34", "WB-34", "2323343434", inspector34);
        Registration registration34 = new Registration(89034, "Broadcast Van", "Alisha Khan", "Broadcast Lane", rto34);
        Vehicle vehicle34 = new Vehicle("WB-34-NV-8934", "Broadcast Van", 2024, "Mahindra", registration34);
        Mayor mayor34 = new Mayor("Mayor 34", "Mayor of City 34", 6, "4567343434", vehicle34);
        Information information34 = new Information(7834, "1040 sqr", "https://info/34", "5678934343", mayor34);
        City city34 = new City("City 34", "State 34", 56814, "Zone-34", information34);
        Address address34 = new Address("Broadcast Lane", "City 34", "State 34", "India", city34);
        Details detail34 = new Details("Alisha Khan", "Media Lead", "9999343434", 34, address34);
        Owner[] owners34 = {
                new Owner("Owner A 34", "9333343434", "ownera34@mail.com", "City 34",
                        new House[]{ new House("34A", "Studio Road", "City 34", "State 34", detail34),
                                new House("34B", "Media Plaza", "City 34", "State 34", detail34) }),
                new Owner("Owner B 34", "9405833434", "ownerb34@mail.com", "City 34",
                        new House[]{ new House("34C", "Camera Blvd", "City 34", "State 34", detail34),
                                new House("34D", "Press Block", "City 34", "State 34", detail34) })
        };
        Company company34 = new Company("MediaWorks 34", "Media Campus", "media", 1034, owners34);
        Product product34 = new Product("MediaSuite", 8934, 279, "media-tech", company34);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward35 = new Ward(35, "Ward 35", 9035, "Councilor 35");
        Constituency constituency35 = new Constituency("City 35", "District 35", 890035, "Constituency 35", ward35);
        PrimeMinister primeMinister35 = new PrimeMinister("PM Name 35", "05/02/2026", "Party 35", 35, constituency35);
        Government government35 = new Government("Central Government", "State 35", 2035, "Capital 35", primeMinister35);
        Tax tax35 = new Tax("Transport Tax", 0.17, 2025, "Authority 35", government35);
        VariablePay variablePay35 = new VariablePay(8935, "Employee 35", 75000, 105000, tax35);
        Bonus bonus35 = new Bonus("Transport Bonus", 8500, "25/02/2026", "Travel support", variablePay35);
        SalaryExpectation salaryExpected35 = new SalaryExpectation("Candidate 35", "Transport", 70335, 8, bonus35);
        List<Criteria> criteria35 = Arrays.asList(
                new Criteria("Logistics degree", "Required", 8, "Reviewer C", salaryExpected35),
                new Criteria("Fleet management exp.", "Preferred", 7, "Reviewer D", salaryExpected35)
        );
        Role role35 = new Role("Transport Coordinator", "Manages city fleet", 85735, 6, criteria35);
        Designation designation35 = new Designation("Transport Director", "Leads fleet ops", "Transport", 89035, role35);
        President president35 = new President("President 35", "Transport Head", 35, "2323353535", designation35);
        University university35 = new University("Transit University 35", "City 35", 2015, "Transit Rd", president35);
        Education education35 = new Education("MBA Logistics", "Transit University 35", 2025, 9.1, university35);
        List<Experience> experience35 = Arrays.asList(
                new Experience("MSRTC", "Coordinator", 3, "City 35", education35),
                new Experience("IndiGo", "Pilot ops", 4, "City 35", education35)
        );
        Inspector inspector35 = new Inspector("Inspector 35", "Transport Inspector", 12, "9999353535", experience35);
        RTO rto35 = new RTO(56735, "City 35", "WB-35", "2323353535", inspector35);
        Registration registration35 = new Registration(89035, "City Bus", "Rohan Gupta", "Transit Lane", rto35);
        Vehicle vehicle35 = new Vehicle("WB-35-CB-8935", "City Bus", 2024, "Tata", registration35);
        Mayor mayor35 = new Mayor("Mayor 35", "Mayor of City 35", 6, "4567353535", vehicle35);
        Information information35 = new Information(7835, "1050 sqr", "https://info/35", "5678935353", mayor35);
        City city35 = new City("City 35", "State 35", 56815, "Zone-35", information35);
        Address address35 = new Address("Transit Lane", "City 35", "State 35", "India", city35);
        Details detail35 = new Details("Rohan Gupta", "Transport Lead", "9999353535", 37, address35);
        Owner[] owners35 = {
                new Owner("Owner A 35", "9333353535", "ownera35@mail.com", "City 35",
                        new House[]{ new House("35A", "Fleet St", "City 35", "State 35", detail35),
                                new House("35B", "Depot Rd", "City 35", "State 35", detail35) }),
                new Owner("Owner B 35", "9405833535", "ownerb35@mail.com", "City 35",
                        new House[]{ new House("35C", "Bus Park", "City 35", "State 35", detail35),
                                new House("35D", "Garage Ln", "City 35", "State 35", detail35) })
        };
        Company company35 = new Company("TransitCorp 35", "Transport Hub", "transport", 1035, owners35);
        Product product35 = new Product("CityFleet", 8935, 259, "transport-tech", company35);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward36 = new Ward(36, "Ward 36", 9036, "Councilor 36");
        Constituency constituency36 = new Constituency("City 36", "District 36", 890036, "Constituency 36", ward36);
        PrimeMinister primeMinister36 = new PrimeMinister("PM Name 36", "06/03/2026", "Party 36", 36, constituency36);
        Government government36 = new Government("State Government", "State 36", 2036, "Capital 36", primeMinister36);
        Tax tax36 = new Tax("Environment Tax", 0.18, 2026, "Authority 36", government36);
        VariablePay variablePay36 = new VariablePay(8936, "Employee 36", 76000, 106000, tax36);
        Bonus bonus36 = new Bonus("Green Bonus", 8600, "15/03/2026", "Sustainability reward", variablePay36);
        SalaryExpectation salaryExpected36 = new SalaryExpectation("Candidate 36", "Environment", 70336, 9, bonus36);
        List<Criteria> criteria36 = Arrays.asList(
                new Criteria("Env. Science degree", "Required", 9, "Reviewer E", salaryExpected36),
                new Criteria("Project management exp.", "Preferred", 7, "Reviewer F", salaryExpected36)
        );
        Role role36 = new Role("Environment Coordinator", "Manages environmental programs", 85736, 6, criteria36);
        Designation designation36 = new Designation("Chief Env Officer", "Leads sustainability", "Environment", 89036, role36);
        President president36 = new President("President 36", "CSO", 36, "2323363636", designation36);
        University university36 = new University("Eco University 36", "City 36", 2016, "Eco Rd", president36);
        Education education36 = new Education("M.Sc Env Science", "Eco University 36", 2026, 9.2, university36);
        List<Experience> experience36 = Arrays.asList(
                new Experience("TERI", "Env Intern", 2, "City 36", education36),
                new Experience("Greenpeace", "Env Specialist", 4, "City 36", education36)
        );
        Inspector inspector36 = new Inspector("Inspector 36", "Eco Inspector", 13, "9999363636", experience36);
        RTO rto36 = new RTO(56736, "City 36", "WB-36", "2323363636", inspector36);
        Registration registration36 = new Registration(89036, "Electric Van", "Sunita Rao", "Eco Blvd", rto36);
        Vehicle vehicle36 = new Vehicle("WB-36-EV-8936", "Electric Van", 2025, "Mahindra EV", registration36);
        Mayor mayor36 = new Mayor("Mayor 36", "Mayor of City 36", 5, "4567363636", vehicle36);
        Information information36 = new Information(7836, "1060 sqr", "https://info/36", "5678936363", mayor36);
        City city36 = new City("City 36", "State 36", 56816, "Zone-36", information36);
        Address address36 = new Address("Eco Blvd", "City 36", "State 36", "India", city36);
        Details detail36 = new Details("Sunita Rao", "Env Lead", "9999363636", 33, address36);
        Owner[] owners36 = {
                new Owner("Owner A 36", "9333363636", "ownera36@mail.com", "City 36",
                        new House[]{ new House("36A", "Green Lane", "City 36", "State 36", detail36),
                                new House("36B", "Eco Park", "City 36", "State 36", detail36) }),
                new Owner("Owner B 36", "9405833636", "ownerb36@mail.com", "City 36",
                        new House[]{ new House("36C", "Solar Street", "City 36", "State 36", detail36),
                                new House("36D", "Wind Block", "City 36", "State 36", detail36) })
        };
        Company company36 = new Company("GreenTech 36", "Eco Hub", "environment", 1036, owners36);
        Product product36 = new Product("EcoManager", 8936, 299, "environmental-tech", company36);
//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward37 = new Ward(37, "Ward 37", 9037, "Councilor 37");
        Constituency constituency37 = new Constituency("City 37", "District 37", 890037, "Constituency 37", ward37);
        PrimeMinister primeMinister37 = new PrimeMinister("PM Name 37", "07/04/2026", "Party 37", 37, constituency37);
        Government government37 = new Government("Council Government", "State 37", 2037, "Capital 37", primeMinister37);
        Tax tax37 = new Tax("Culture Tax", 0.15, 2026, "Authority 37", government37);
        VariablePay variablePay37 = new VariablePay(8937, "Employee 37", 77000, 107000, tax37);
        Bonus bonus37 = new Bonus("Cultural Bonus", 8700, "05/04/2026", "Heritage reward", variablePay37);
        SalaryExpectation salaryExpected37 = new SalaryExpectation("Candidate 37", "Arts & Culture", 70337, 8, bonus37);
        List<Criteria> criteria37 = Arrays.asList(
                new Criteria("Arts degree", "Required", 8, "Reviewer G", salaryExpected37),
                new Criteria("5+ yrs cultural project", "Preferred", 6, "Reviewer H", salaryExpected37)
        );
        Role role37 = new Role("Culture Coordinator", "Manages cultural events", 85737, 6, criteria37);
        Designation designation37 = new Designation("Culture Director", "Leads culture dept", "Culture", 89037, role37);
        President president37 = new President("President 37", "Culture Board Chair", 37, "2323373737", designation37);
        University university37 = new University("Arts University 37", "City 37", 2017, "Culture Rd", president37);
        Education education37 = new Education("MFA", "Arts University 37", 2026, 9.0, university37);
        List<Experience> experience37 = Arrays.asList(
                new Experience("National Arts Council", "Curator", 3, "City 37", education37),
                new Experience("Museum Authority", "Coordinator", 4, "City 37", education37)
        );
        Inspector inspector37 = new Inspector("Inspector 37", "Culture Inspector", 12, "9999373737", experience37);
        RTO rto37 = new RTO(56737, "City 37", "WB-37", "2323373737", inspector37);
        Registration registration37 = new Registration(89037, "Decor Van", "Priya Mehta", "Culture Lane", rto37);
        Vehicle vehicle37 = new Vehicle("WB-37-DV-8937", "Decor Van", 2025, "Maruti", registration37);
        Mayor mayor37 = new Mayor("Mayor 37", "Mayor of City 37", 6, "4567373737", vehicle37);
        Information information37 = new Information(7837, "1070 sqr", "https://info/37", "5678937373", mayor37);
        City city37 = new City("City 37", "State 37", 56817, "Zone-37", information37);
        Address address37 = new Address("Culture Lane", "City 37", "State 37", "India", city37);
        Details detail37 = new Details("Priya Mehta", "Culture Lead", "9999373737", 39, address37);
        Owner[] owners37 = {
                new Owner("Owner A 37", "9333363737", "ownera37@mail.com", "City 37",
                        new House[]{ new House("37A", "Art Street", "City 37", "State 37", detail37),
                                new House("37B", "Heritage Lane", "City 37", "State 37", detail37) }),
                new Owner("Owner B 37", "9405833737", "ownerb37@mail.com", "City 37",
                        new House[]{ new House("37C", "Museum Road", "City 37", "State 37", detail37),
                                new House("37D", "Craft Block", "City 37", "State 37", detail37) })
        };
        Company company37 = new Company("CultureCorp", "Heritage Campus", "culture", 1037, owners37);
        Product product37 = new Product("CultureManager", 8937, 309, "culture-tech", company37);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward38 = new Ward(38, "Ward 38", 9038, "Councilor 38");
        Constituency constituency38 = new Constituency("City 38", "District 38", 890038, "Constituency 38", ward38);
        PrimeMinister primeMinister38 = new PrimeMinister("PM Name 38", "08/05/2026", "Party 38", 38, constituency38);
        Government government38 = new Government("Town Government", "State 38", 2038, "Capital 38", primeMinister38);
        Tax tax38 = new Tax("Tourism Tax", 0.18, 2026, "Authority 38", government38);
        VariablePay variablePay38 = new VariablePay(8938, "Employee 38", 78000, 108000, tax38);
        Bonus bonus38 = new Bonus("Tourism Bonus", 8800, "10/05/2026", "Tourism initiative", variablePay38);
        SalaryExpectation salaryExpected38 = new SalaryExpectation("Candidate 38", "Tourism", 70338, 7, bonus38);
        List<Criteria> criteria38 = Arrays.asList(
                new Criteria("Tourism diploma", "Required", 7, "Reviewer T", salaryExpected38),
                new Criteria("Tour ops exp.", "Preferred", 5, "Reviewer U", salaryExpected38)
        );
        Role role38 = new Role("Tour Coordinator", "Manages tours", 85738, 5, criteria38);
        Designation designation38 = new Designation("Tour Director", "Leads tourism", "Tourism", 89038, role38);
        President president38 = new President("President 38", "Tourism Board Chair", 38, "2323383838", designation38);
        University university38 = new University("Tourism University 38", "City 38", 2018, "Tour Rd", president38);
        Education education38 = new Education("BHM", "Tourism University 38", 2025, 8.7, university38);
        List<Experience> experience38 = Arrays.asList(
                new Experience("IRCTC", "Tour Manager", 3, "City 38", education38),
                new Experience("TDC", "Guide", 4, "City 38", education38)
        );
        Inspector inspector38 = new Inspector("Inspector 38", "Tourism Inspector", 11, "9999383838", experience38);
        RTO rto38 = new RTO(56738, "City 38", "WB-38", "2323383838", inspector38);
        Registration registration38 = new Registration(89038, "Tour Bus", "Neha Kapoor", "Tour Rd", rto38);
        Vehicle vehicle38 = new Vehicle("WB-38-TB-8938", "Tour Bus", 2024, "Volvo", registration38);
        Mayor mayor38 = new Mayor("Mayor 38", "Mayor of City 38", 6, "4567383838", vehicle38);
        Information information38 = new Information(7838, "1080 sqr", "https://info/38", "5678938383", mayor38);
        City city38 = new City("City 38", "State 38", 56818, "Zone-38", information38);
        Address address38 = new Address("Tour Rd", "City 38", "State 38", "India", city38);
        Details detail38 = new Details("Neha Kapoor", "Tour Lead", "9999383838", 36, address38);
        Owner[] owners38 = {
                new Owner("Owner A 38", "9333363838", "ownera38@mail.com", "City 38",
                        new House[]{ new House("38A", "Guide Lane", "City 38", "State 38", detail38),
                                new House("38B", "Heritage Ave", "City 38", "State 38", detail38) }),
                new Owner("Owner B 38", "9405833838", "ownerb38@mail.com", "City 38",
                        new House[]{ new House("38C", "Tour Park", "City 38", "State 38", detail38),
                                new House("38D", "Sightseeing Rd", "City 38", "State 38", detail38) })
        };
        Company company38 = new Company("TourConnect", "Travel Hub", "tourism", 1038, owners38);
        Product product38 = new Product("TourManager", 8938, 279, "tourism-tech", company38);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward39 = new Ward(39, "Ward 39", 9039, "Councilor 39");
        Constituency constituency39 = new Constituency("City 39", "District 39", 890039, "Constituency 39", ward39);
        PrimeMinister primeMinister39 = new PrimeMinister("PM Name 39", "09/06/2026", "Party 39", 39, constituency39);
        Government government39 = new Government("Municipal Government", "State 39", 2039, "Capital 39", primeMinister39);
        Tax tax39 = new Tax("Sports Tax", 0.16, 2026, "Authority 39", government39);
        VariablePay variablePay39 = new VariablePay(8939, "Employee 39", 79000, 109000, tax39);
        Bonus bonus39 = new Bonus("Sports Bonus", 8900, "15/06/2026", "Athletic reward", variablePay39);
        SalaryExpectation salaryExpected39 = new SalaryExpectation("Candidate 39", "Sports", 70339, 7, bonus39);
        List<Criteria> criteria39 = Arrays.asList(
                new Criteria("Sports Management degree", "Required", 7, "Reviewer S", salaryExpected39),
                new Criteria("Event experience", "Preferred", 5, "Reviewer T", salaryExpected39)
        );
        Role role39 = new Role("Sports Coordinator", "Manages sports events", 85739, 5, criteria39);
        Designation designation39 = new Designation("Sports Director", "Leads sports dept", "Sports", 89039, role39);
        President president39 = new President("President 39", "Sports Board Chair", 39, "2323393939", designation39);
        University university39 = new University("Sports University 39", "City 39", 2019, "Sports Rd", president39);
        Education education39 = new Education("M.Sports", "Sports University 39", 2025, 8.8, university39);
        List<Experience> experience39 = Arrays.asList(
                new Experience("Khelo India", "Coordinator", 3, "City 39", education39),
                new Experience("National Sports Fed", "Manager", 4, "City 39", education39)
        );
        Inspector inspector39 = new Inspector("Inspector 39", "Sports Inspector", 12, "9999393939", experience39);
        RTO rto39 = new RTO(56739, "City 39", "WB-39", "2323393939", inspector39);
        Registration registration39 = new Registration(89039, "Team Bus", "Coach Singh", "Sports Rd", rto39);
        Vehicle vehicle39 = new Vehicle("WB-39-TB-8939", "Team Bus", 2025, "Volvo", registration39);
        Mayor mayor39 = new Mayor("Mayor 39", "Mayor of City 39", 6, "4567393939", vehicle39);
        Information information39 = new Information(7839, "1090 sqr", "https://info/39", "5678939393", mayor39);
        City city39 = new City("City 39", "State 39", 56819, "Zone-39", information39);
        Address address39 = new Address("Sports Rd", "City 39", "State 39", "India", city39);
        Details detail39 = new Details("Coach Singh", "Sports Lead", "9999393939", 38, address39);
        Owner[] owners39 = {
                new Owner("Owner A 39", "9333363939", "ownera39@mail.com", "City 39",
                        new House[]{ new House("39A", "Arena St", "City 39", "State 39", detail39),
                                new House("39B", "Stadium Lane", "City 39", "State 39", detail39) }),
                new Owner("Owner B 39", "9405833939", "ownerb39@mail.com", "City 39",
                        new House[]{ new House("39C", "Playground Rd", "City 39", "State 39", detail39),
                                new House("39D", "Athlete Block", "City 39", "State 39", detail39) })
        };
        Company company39 = new Company("Sportify Ltd", "Athletics Campus", "sports", 1039, owners39);
        Product product39 = new Product("GameManager", 8939, 329, "sports-tech", company39);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward40 = new Ward(40, "Ward 40", 9040, "Councilor 40");
        Constituency constituency40 = new Constituency("City 40", "District 40", 890040, "Constituency 40", ward40);
        PrimeMinister primeMinister40 = new PrimeMinister("PM Name 40", "10/07/2026", "Party 40", 40, constituency40);
        Government government40 = new Government("District Government", "State 40", 2040, "Capital 40", primeMinister40);
        Tax tax40 = new Tax("Public Works Tax", 0.17, 2026, "Authority 40", government40);
        VariablePay variablePay40 = new VariablePay(8940, "Employee 40", 80000, 110000, tax40);
        Bonus bonus40 = new Bonus("Infrastructure Bonus", 9000, "01/07/2026", "Infrastructure reward", variablePay40);
        SalaryExpectation salaryExpected40 = new SalaryExpectation("Candidate 40", "Infrastructure", 70340, 9, bonus40);
        List<Criteria> criteria40 = Arrays.asList(
                new Criteria("Civil Engineering", "Required", 9, "Reviewer V", salaryExpected40),
                new Criteria("Project mgmt exp.", "Preferred", 7, "Reviewer W", salaryExpected40)
        );
        Role role40 = new Role("Infra Coordinator", "Manages city projects", 85740, 6, criteria40);
        Designation designation40 = new Designation("Infra Director", "Leads public works", "Infrastructure", 89040, role40);
        President president40 = new President("President 40", "Infra Board Chair", 40, "2323404040", designation40);
        University university40 = new University("Infrastructure University", "City 40", 2020, "Infra Rd", president40);
        Education education40 = new Education("M.Tech Civil", "Infrastructure University", 2026, 9.3, university40);
        List<Experience> experience40 = Arrays.asList(
                new Experience("NHAI", "Engineer", 4, "City 40", education40),
                new Experience("PWD", "Project Manager", 5, "City 40", education40)
        );
        Inspector inspector40 = new Inspector("Inspector 40", "Infra Inspector", 13, "9999404040", experience40);
        RTO rto40 = new RTO(56740, "City 40", "WB-40", "2323404040", inspector40);
        Registration registration40 = new Registration(89040, "Construction Truck", "Ayesha Khan", "Infrastructure Rd", rto40);
        Vehicle vehicle40 = new Vehicle("WB-40-CT-8940", "Construction Truck", 2025, "Eicher", registration40);
        Mayor mayor40 = new Mayor("Mayor 40", "Mayor of City 40", 6, "4567404040", vehicle40);
        Information information40 = new Information(7840, "1100 sqr", "https://info/40", "5678940404", mayor40);
        City city40 = new City("City 40", "State 40", 56820, "Zone-40", information40);
        Address address40 = new Address("Infrastructure Rd", "City 40", "State 40", "India", city40);
        Details detail40 = new Details("Ayesha Khan", "Infra Lead", "9999404040", 42, address40);
        Owner[] owners40 = {
                new Owner("Owner A 40", "9333364040", "ownera40@mail.com", "City 40",
                        new House[]{ new House("40A", "Bridge Street", "City 40", "State 40", detail40),
                                new House("40B", "Road Avenue", "City 40", "State 40", detail40) }),
                new Owner("Owner B 40", "9405834040", "ownerb40@mail.com", "City 40",
                        new House[]{ new House("40C", "Tunnel Road", "City 40", "State 40", detail40),
                                new House("40D", "Flyover Way", "City 40", "State 40", detail40) })
        };
        Company company40 = new Company("InfraWorks Ltd", "Construction Hub", "infrastructure", 1040, owners40);
        Product product40 = new Product("InfraManager", 8940, 349, "infra-tech", company40);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward41 = new Ward(41, "Ward 41", 9041, "Councilor 41");
        Constituency constituency41 = new Constituency("City 41", "District 41", 890041, "Constituency 41", ward41);
        PrimeMinister primeMinister41 = new PrimeMinister("PM Name 41", "11/07/2026", "Party 41", 41, constituency41);
        Government government41 = new Government("District Government", "State 41", 2041, "Capital 41", primeMinister41);
        Tax tax41 = new Tax("Education Tax", 0.18, 2027, "Authority 41", government41);
        VariablePay variablePay41 = new VariablePay(8941, "Employee 41", 81000, 111000, tax41);
        Bonus bonus41 = new Bonus("Scholarship Bonus", 9100, "15/07/2026", "Academic reward", variablePay41);
        SalaryExpectation salaryExpected41 = new SalaryExpectation("Candidate 41", "Education", 70341, 10, bonus41);
        List<Criteria> criteria41 = Arrays.asList(
                new Criteria("PhD in Education", "Required", 10, "Reviewer E", salaryExpected41),
                new Criteria("10 years teaching exp.", "Preferred", 8, "Reviewer F", salaryExpected41)
        );
        Role role41 = new Role("Academic Coordinator", "Oversees educational standards", 85741, 7, criteria41);
        Designation designation41 = new Designation("Academic Director", "Leads education programs", "Education", 89041, role41);
        President president41 = new President("President 41", "Education Board Chair", 41, "2323414141", designation41);
        University university41 = new University("Education University 41", "City 41", 2021, "Edu Blvd", president41);
        Education education41 = new Education("PhD", "Education University 41", 2026, 9.4, university41);
        List<Experience> experience41 = Arrays.asList(
                new Experience("Harvard", "Researcher", 5, "City 41", education41),
                new Experience("MIT", "Lecturer", 4, "City 41", education41)
        );
        Inspector inspector41 = new Inspector("Inspector 41", "Education Inspector", 15, "9999414141", experience41);
        RTO rto41 = new RTO(56741, "City 41", "WB-41", "2323414141", inspector41);
        Registration registration41 = new Registration(89041, "University Van", "Dr. Patel", "Edu Rd", rto41);
        Vehicle vehicle41 = new Vehicle("WB-41-UV-8941", "University Van", 2024, "Ashok Leyland", registration41);
        Mayor mayor41 = new Mayor("Mayor 41", "Mayor of City 41", 6, "4567414141", vehicle41);
        Information information41 = new Information(7841, "1110 sqr", "https://info/41", "5678941414", mayor41);
        City city41 = new City("City 41", "State 41", 56821, "Zone-41", information41);
        Address address41 = new Address("Edu Rd", "City 41", "State 41", "India", city41);
        Details detail41 = new Details("Dr. Patel", "Dean", "9999414141", 55, address41);
        Owner[] owners41 = {
                new Owner("Owner A 41", "9333364141", "ownera41@mail.com", "City 41",
                        new House[]{ new House("41A", "Lecture Lane", "City 41", "State 41", detail41),
                                new House("41B", "Research Park", "City 41", "State 41", detail41) }),
                new Owner("Owner B 41", "9405834141", "ownerb41@mail.com", "City 41",
                        new House[]{ new House("41C", "Library Road", "City 41", "State 41", detail41),
                                new House("41D", "Campus Plaza", "City 41", "State 41", detail41) })
        };
        Company company41 = new Company("EduWorks Inc", "Academic Campus", "edu", 1041, owners41);
        Product product41 = new Product("EduManager", 8941, 319, "edutech", company41);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward42 = new Ward(42, "Ward 42", 9042, "Councilor 42");
        Constituency constituency42 = new Constituency("City 42", "District 42", 890042, "Constituency 42", ward42);
        PrimeMinister primeMinister42 = new PrimeMinister("PM Name 42", "12/08/2026", "Party 42", 42, constituency42);
        Government government42 = new Government("Municipal Government", "State 42", 2042, "Capital 42", primeMinister42);
        Tax tax42 = new Tax("Culture Tax", 0.16, 2026, "Authority 42", government42);
        VariablePay variablePay42 = new VariablePay(8942, "Employee 42", 82000, 112000, tax42);
        Bonus bonus42 = new Bonus("Art Bonus", 9200, "20/08/2026", "Cultural reward", variablePay42);
        SalaryExpectation salaryExpected42 = new SalaryExpectation("Candidate 42", "Arts & Culture", 70342, 8, bonus42);
        List<Criteria> criteria42 = Arrays.asList(
                new Criteria("MFA", "Required", 8, "Reviewer G", salaryExpected42),
                new Criteria("5 years experience", "Preferred", 6, "Reviewer H", salaryExpected42)
        );
        Role role42 = new Role("Arts Coordinator", "Leads cultural programs", 85742, 6, criteria42);
        Designation designation42 = new Designation("Culture Director", "Heads cultural dept", "Culture", 89042, role42);
        President president42 = new President("President 42", "Culture Board Chair", 42, "2323424242", designation42);
        University university42 = new University("Arts University 42", "City 42", 2022, "Arts Rd", president42);
        Education education42 = new Education("MFA", "Arts University 42", 2026, 9.2, university42);
        List<Experience> experience42 = Arrays.asList(
                new Experience("Natl Arts Council", "Curator", 3, "City 42", education42),
                new Experience("Museum Trust", "Coordinator", 4, "City 42", education42)
        );
        Inspector inspector42 = new Inspector("Inspector 42", "Culture Inspector", 13, "9999424242", experience42);
        RTO rto42 = new RTO(56742, "City 42", "WB-42", "2323424242", inspector42);
        Registration registration42 = new Registration(89042, "Decor Van", "Anjali Singh", "Arts Lane", rto42);
        Vehicle vehicle42 = new Vehicle("WB-42-DV-8942", "Decor Van", 2025, "Maruti", registration42);
        Mayor mayor42 = new Mayor("Mayor 42", "Mayor of City 42", 6, "4567424242", vehicle42);
        Information information42 = new Information(7842, "1120 sqr", "https://info/42", "5678942424", mayor42);
        City city42 = new City("City 42", "State 42", 56822, "Zone-42", information42);
        Address address42 = new Address("Arts Lane", "City 42", "State 42", "India", city42);
        Details detail42 = new Details("Anjali Singh", "Culture Curator", "9999424242", 37, address42);
        Owner[] owners42 = {
                new Owner("Owner A 42", "9333364242", "ownera42@mail.com", "City 42",
                        new House[]{ new House("42A", "Gallery Rd", "City 42", "State 42", detail42),
                                new House("42B", "Studio Park", "City 42", "State 42", detail42) }),
                new Owner("Owner B 42", "9405834242", "ownerb42@mail.com", "City 42",
                        new House[]{ new House("42C", "Craft Lane", "City 42", "State 42", detail42),
                                new House("42D", "Heritage Block", "City 42", "State 42", detail42) })
        };
        Company company42 = new Company("ArtWorks Ltd", "Culture Campus", "culture", 1042, owners42);
        Product product42 = new Product("ArtManager", 8942, 289, "culture-tech", company42);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward43 = new Ward(43, "Ward 43", 9043, "Councilor 43");
        Constituency constituency43 = new Constituency("City 43", "District 43", 890043, "Constituency 43", ward43);
        PrimeMinister primeMinister43 = new PrimeMinister("PM Name 43", "13/09/2026", "Party 43", 43, constituency43);
        Government government43 = new Government("Town Government", "State 43", 2043, "Capital 43", primeMinister43);
        Tax tax43 = new Tax("Tourism Tax", 0.18, 2026, "Authority 43", government43);
        VariablePay variablePay43 = new VariablePay(8943, "Employee 43", 83000, 113000, tax43);
        Bonus bonus43 = new Bonus("Tourism Bonus", 9300, "25/09/2026", "Tour experience reward", variablePay43);
        SalaryExpectation salaryExpected43 = new SalaryExpectation("Candidate 43", "Tourism", 70343, 8, bonus43);
        List<Criteria> criteria43 = Arrays.asList(
                new Criteria("Tourism diploma", "Required", 7, "Reviewer T", salaryExpected43),
                new Criteria("5 years exp", "Preferred", 5, "Reviewer U", salaryExpected43)
        );
        Role role43 = new Role("Tour Coordinator", "Manages cultural tours", 85743, 5, criteria43);
        Designation designation43 = new Designation("Tour Director", "Leads tourism dept", "Tourism", 89043, role43);
        President president43 = new President("President 43", "Tourism Board Chair", 43, "2323434343", designation43);
        University university43 = new University("Tourism University 43", "City 43", 2023, "Tour Rd", president43);
        Education education43 = new Education("BHM", "Tourism University 43", 2026, 8.8, university43);
        List<Experience> experience43 = Arrays.asList(
                new Experience("IRCTC", "Tour Guide", 3, "City 43", education43),
                new Experience("State Tourism", "Coordinator", 4, "City 43", education43)
        );
        Inspector inspector43 = new Inspector("Inspector 43", "Tourism Inspector", 14, "9999434343", experience43);
        RTO rto43 = new RTO(56743, "City 43", "WB-43", "2323434343", inspector43);
        Registration registration43 = new Registration(89043, "Tour Bus", "Deepak Kumar", "Tour Road", rto43);
        Vehicle vehicle43 = new Vehicle("WB-43-TB-8943", "Tour Bus", 2025, "Volvo", registration43);
        Mayor mayor43 = new Mayor("Mayor 43", "Mayor of City 43", 6, "4567434343", vehicle43);
        Information information43 = new Information(7843, "1130 sqr", "https://info/43", "5678943434", mayor43);
        City city43 = new City("City 43", "State 43", 56823, "Zone-43", information43);
        Address address43 = new Address("Tour Road", "City 43", "State 43", "India", city43);
        Details detail43 = new Details("Deepak Kumar", "Tour Lead", "9999434343", 36, address43);
        Owner[] owners43 = {
                new Owner("Owner A 43", "9333364343", "ownera43@mail.com", "City 43",
                        new House[]{ new House("43A", "Heritage St", "City 43", "State 43", detail43),
                                new House("43B", "Culture Park", "City 43", "State 43", detail43) }),
                new Owner("Owner B 43", "9405834343", "ownerb43@mail.com", "City 43",
                        new House[]{ new House("43C", "Tour Hub", "City 43", "State 43", detail43),
                                new House("43D", "Sightseeing Block", "City 43", "State 43", detail43) })
        };
        Company company43 = new Company("TourWorks Ltd", "Travel Campus", "tourism", 1043, owners43);
        Product product43 = new Product("TourSuite", 8943, 299, "tourism-tech", company43);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward44 = new Ward(44, "Ward 44", 9044, "Councilor 44");
        Constituency constituency44 = new Constituency("City 44", "District 44", 890044, "Constituency 44", ward44);
        PrimeMinister primeMinister44 = new PrimeMinister("PM Name 44", "14/10/2026", "Party 44", 44, constituency44);
        Government government44 = new Government("Municipal Government", "State 44", 2044, "Capital 44", primeMinister44);
        Tax tax44 = new Tax("Sports Tax", 0.17, 2026, "Authority 44", government44);
        VariablePay variablePay44 = new VariablePay(8944, "Employee 44", 84000, 114000, tax44);
        Bonus bonus44 = new Bonus("Sports Bonus", 9400, "20/10/2026", "Athletic reward", variablePay44);
        SalaryExpectation salaryExpected44 = new SalaryExpectation("Candidate 44", "Sports", 70344, 9, bonus44);
        List<Criteria> criteria44 = Arrays.asList(
                new Criteria("Sports Management", "Required", 9, "Reviewer S", salaryExpected44),
                new Criteria("Event management exp.", "Preferred", 7, "Reviewer T", salaryExpected44)
        );
        Role role44 = new Role("Sports Coordinator", "Manages sports programs", 85744, 6, criteria44);
        Designation designation44 = new Designation("Sports Director", "Leads sports dept", "Sports", 89044, role44);
        President president44 = new President("President 44", "Sports Board Chair", 44, "2323444444", designation44);
        University university44 = new University("Sports University 44", "City 44", 2024, "Sports Rd", president44);
        Education education44 = new Education("M.Sports", "Sports University 44", 2026, 8.9, university44);
        List<Experience> experience44 = Arrays.asList(
                new Experience("Khelo India", "Coordinator", 3, "City 44", education44),
                new Experience("National Fed", "Manager", 4, "City 44", education44)
        );
        Inspector inspector44 = new Inspector("Inspector 44", "Sports Inspector", 15, "9999444444", experience44);
        RTO rto44 = new RTO(56744, "City 44", "WB-44", "2323444444", inspector44);
        Registration registration44 = new Registration(89044, "Team Bus", "Coach Verma", "Sports Road", rto44);
        Vehicle vehicle44 = new Vehicle("WB-44-TB-8944", "Team Bus", 2025, "Volvo", registration44);
        Mayor mayor44 = new Mayor("Mayor 44", "Mayor of City 44", 6, "4567444444", vehicle44);
        Information information44 = new Information(7844, "1140 sqr", "https://info/44", "5678944444", mayor44);
        City city44 = new City("City 44", "State 44", 56824, "Zone-44", information44);
        Address address44 = new Address("Sports Road", "City 44", "State 44", "India", city44);
        Details detail44 = new Details("Coach Verma", "Sports Lead", "9999444444", 40, address44);
        Owner[] owners44 = {
                new Owner("Owner A 44", "9333364444", "ownera44@mail.com", "City 44",
                        new House[]{ new House("44A", "Arena St", "City 44", "State 44", detail44),
                                new House("44B", "Stadium Lane", "City 44", "State 44", detail44) }),
                new Owner("Owner B 44", "9405834444", "ownerb44@mail.com", "City 44",
                        new House[]{ new House("44C", "Playground Rd", "City 44", "State 44", detail44),
                                new House("44D", "Athlete Cir", "City 44", "State 44", detail44) })
        };
        Company company44 = new Company("SportsWorks Ltd", "Athletic Campus", "sports", 1044, owners44);
        Product product44 = new Product("GameSuite", 8944, 339, "sports-tech", company44);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward45 = new Ward(45, "Ward 45", 9045, "Councilor 45");
        Constituency constituency45 = new Constituency("City 45", "District 45", 890045, "Constituency 45", ward45);
        PrimeMinister primeMinister45 = new PrimeMinister("PM Name 45", "15/11/2026", "Party 45", 45, constituency45);
        Government government45 = new Government("District Government", "State 45", 2045, "Capital 45", primeMinister45);
        Tax tax45 = new Tax("Infrastructure Tax", 0.17, 2026, "Authority 45", government45);
        VariablePay variablePay45 = new VariablePay(8945, "Employee 45", 85000, 115000, tax45);
        Bonus bonus45 = new Bonus("Infra Bonus", 9500, "30/11/2026", "Infrastructure reward", variablePay45);
        SalaryExpectation salaryExpected45 = new SalaryExpectation("Candidate 45", "Infrastructure", 70345, 10, bonus45);
        List<Criteria> criteria45 = Arrays.asList(
                new Criteria("Civil Engineering", "Required", 10, "Reviewer V", salaryExpected45),
                new Criteria("Project mgmt exp.", "Preferred", 8, "Reviewer W", salaryExpected45)
        );
        Role role45 = new Role("Infra Coordinator", "Oversees city projects", 85745, 6, criteria45);
        Designation designation45 = new Designation("Infra Director", "Leads infrastructure dept", "Infrastructure", 89045, role45);
        President president45 = new President("President 45", "Infra Board Chair", 45, "2323454545", designation45);
        University university45 = new University("Infra University 45", "City 45", 2025, "Infra Rd", president45);
        Education education45 = new Education("M.Tech Civil", "Infra University 45", 2026, 9.3, university45);
        List<Experience> experience45 = Arrays.asList(
                new Experience("NHAI", "Engineer", 5, "City 45", education45),
                new Experience("PWD", "Project Manager", 6, "City 45", education45)
        );
        Inspector inspector45 = new Inspector("Inspector 45", "Infra Inspector", 16, "9999454545", experience45);
        RTO rto45 = new RTO(56745, "City 45", "WB-45", "2323454545", inspector45);
        Registration registration45 = new Registration(89045, "Construction Truck", "Vikram Singh", "Infra Rd", rto45);
        Vehicle vehicle45 = new Vehicle("WB-45-CT-8945", "Construction Truck", 2025, "Eicher", registration45);
        Mayor mayor45 = new Mayor("Mayor 45", "Mayor of City 45", 6, "4567454545", vehicle45);
        Information information45 = new Information(7845, "1150 sqr", "https://info/45", "5678944545", mayor45);
        City city45 = new City("City 45", "State 45", 56825, "Zone-45", information45);
        Address address45 = new Address("Infra Rd", "City 45", "State 45", "India", city45);
        Details detail45 = new Details("Vikram Singh", "Infra Lead", "9999454545", 44, address45);
        Owner[] owners45 = {
                new Owner("Owner A 45", "9333364545", "ownera45@mail.com", "City 45",
                        new House[]{ new House("45A", "Bridge Street", "City 45", "State 45", detail45),
                                new House("45B", "Tunnel Lane", "City 45", "State 45", detail45) }),
                new Owner("Owner B 45", "9405834545", "ownerb45@mail.com", "City 45",
                        new House[]{ new House("45C", "Road Avenue", "City 45", "State 45", detail45),
                                new House("45D", "Flyover Way", "City 45", "State 45", detail45) })
        };
        Company company45 = new Company("InfraWorks 45", "Construction Hub", "infra", 1045, owners45);
        Product product45 = new Product("InfraSuite", 8945, 359, "infra-tech", company45);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward46 = new Ward(46, "Ward 46", 9046, "Councilor 46");
        Constituency constituency46 = new Constituency("City 46", "District 46", 890046, "Constituency 46", ward46);
        PrimeMinister primeMinister46 = new PrimeMinister("PM Name 46", "16/12/2026", "Party 46", 46, constituency46);
        Government government46 = new Government("Municipal Government", "State 46", 2046, "Capital 46", primeMinister46);
        Tax tax46 = new Tax("Tech Tax", 0.18, 2027, "Authority 46", government46);
        VariablePay variablePay46 = new VariablePay(8946, "Employee 46", 86000, 116000, tax46);
        Bonus bonus46 = new Bonus("Innovation Bonus", 9600, "20/12/2026", "Tech reward", variablePay46);
        SalaryExpectation salaryExpected46 = new SalaryExpectation("Candidate 46", "Technology", 70346, 9, bonus46);
        List<Criteria> criteria46 = Arrays.asList(
                new Criteria("B.Tech/BE", "Required", 9, "Reviewer X", salaryExpected46),
                new Criteria("5 yrs dev exp.", "Preferred", 7, "Reviewer Y", salaryExpected46)
        );
        Role role46 = new Role("Tech Coordinator", "Manages tech projects", 85746, 7, criteria46);
        Designation designation46 = new Designation("Tech Director", "Leads IT Dept", "Technology", 89046, role46);
        President president46 = new President("President 46", "CTO", 46, "2323464646", designation46);
        University university46 = new University("Tech University 46", "City 46", 2026, "Tech Ave", president46);
        Education education46 = new Education("M.Tech", "Tech University 46", 2026, 9.2, university46);
        List<Experience> experience46 = Arrays.asList(
                new Experience("Infosys", "Developer", 3, "City 46", education46),
                new Experience("TCS", "Lead Developer", 4, "City 46", education46)
        );
        Inspector inspector46 = new Inspector("Inspector 46", "Tech Inspector", 12, "9999464646", experience46);
        RTO rto46 = new RTO(56746, "City 46", "WB-46", "2323464646", inspector46);
        Registration registration46 = new Registration(89046, "IT Vehicle", "Rohan Jain", "Tech Lane", rto46);
        Vehicle vehicle46 = new Vehicle("WB-46-TV-8946", "IT Vehicle", 2026, "Mahindra EV", registration46);
        Mayor mayor46 = new Mayor("Mayor 46", "Mayor of City 46", 6, "4567464646", vehicle46);
        Information information46 = new Information(7846, "1160 sqr", "https://info/46", "5678946464", mayor46);
        City city46 = new City("City 46", "State 46", 56826, "Zone-46", information46);
        Address address46 = new Address("Tech Lane", "City 46", "State 46", "India", city46);
        Details detail46 = new Details("Rohan Jain", "Tech Lead", "9999464646", 29, address46);
        Owner[] owners46 = {
                new Owner("Owner A 46", "9333364646", "ownera46@mail.com", "City 46",
                        new House[]{ new House("46A", "Tech Street", "City 46", "State 46", detail46),
                                new House("46B", "Innovation Park", "City 46", "State 46", detail46) }),
                new Owner("Owner B 46", "9405834646", "ownerb46@mail.com", "City 46",
                        new House[]{ new House("46C", "Code Blvd", "City 46", "State 46", detail46),
                                new House("46D", "Cyber Lane", "City 46", "State 46", detail46) })
        };
        Company company46 = new Company("TechWorks 46", "IT Campus", "tech", 1046, owners46);
        Product product46 = new Product("DevSuite", 8946, 389, "tech‑solution", company46);
//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward47 = new Ward(47, "Ward 47", 9047, "Councilor 47");
        Constituency constituency47 = new Constituency("City 47", "District 47", 890047, "Constituency 47", ward47);
        PrimeMinister primeMinister47 = new PrimeMinister("PM Name 47", "17/01/2027", "Party 47", 47, constituency47);
        Government government47 = new Government("Council Government", "State 47", 2047, "Capital 47", primeMinister47);
        Tax tax47 = new Tax("HealthTech Tax", 0.19, 2027, "Authority 47", government47);
        VariablePay variablePay47 = new VariablePay(8947, "Employee 47", 87000, 117000, tax47);
        Bonus bonus47 = new Bonus("HealthTech Bonus", 9700, "25/01/2027", "HealthTech innovation", variablePay47);
        SalaryExpectation salaryExpected47 = new SalaryExpectation("Candidate 47", "HealthTech", 70347, 8, bonus47);
        List<Criteria> criteria47 = Arrays.asList(
                new Criteria("B.Tech/IT", "Required", 8, "Reviewer Z", salaryExpected47),
                new Criteria("AI/ML exp.", "Preferred", 6, "Reviewer A", salaryExpected47)
        );
        Role role47 = new Role("HealthTech Coordinator", "Manages health‑tech projects", 85747, 7, criteria47);
        Designation designation47 = new Designation("HealthTech Director", "Leads HealthTech Dept", "HealthTech", 89047, role47);
        President president47 = new President("President 47", "CTO HealthTech", 47, "2323474747", designation47);
        University university47 = new University("HealthTech University 47", "City 47", 2027, "HealthTech Ave", president47);
        Education education47 = new Education("M.Tech AI", "HealthTech University 47", 2027, 9.4, university47);
        List<Experience> experience47 = Arrays.asList(
                new Experience("IBM", "AI Engineer", 3, "City 47", education47),
                new Experience("Google Health", "ML Engineer", 4, "City 47", education47)
        );
        Inspector inspector47 = new Inspector("Inspector 47", "HealthTech Inspector", 13, "9999474747", experience47);
        RTO rto47 = new RTO(56747, "City 47", "WB-47", "2323474747", inspector47);
        Registration registration47 = new Registration(89047, "HealthTech Van", "Dr. Sharma", "HealthTech Lane", rto47);
        Vehicle vehicle47 = new Vehicle("WB-47-HV-8947", "HealthTech Van", 2027, "Tata EV", registration47);
        Mayor mayor47 = new Mayor("Mayor 47", "Mayor of City 47", 6, "4567474747", vehicle47);
        Information information47 = new Information(7847, "1170 sqr", "https://info/47", "5678947474", mayor47);
        City city47 = new City("City 47", "State 47", 56827, "Zone‑47", information47);
        Address address47 = new Address("HealthTech Lane", "City 47", "State 47", "India", city47);
        Details detail47 = new Details("Dr. Sharma", "HealthTech Lead", "9999474747", 30, address47);
        Owner[] owners47 = {
                new Owner("Owner A 47", "9333364747", "ownera47@mail.com", "City 47",
                        new House[]{ new House("47A", "Health Park", "City 47", "State 47", detail47),
                                new House("47B", "Innovation Blvd", "City 47", "State 47", detail47) }),
                new Owner("Owner B 47", "9405834747", "ownerb47@mail.com", "City 47",
                        new House[]{ new House("47C", "Care Road", "City 47", "State 47", detail47),
                                new House("47D", "Tech Circle", "City 47", "State 47", detail47) })
        };
        Company company47 = new Company("HealthTechWorks 47", "Health Campus", "healthtech", 1047, owners47);
        Product product47 = new Product("MediAI", 8947, 409, "healthtech‑solution", company47);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward48 = new Ward(48, "Ward 48", 9048, "Councilor 48");
        Constituency constituency48 = new Constituency("City 48", "District 48", 890048, "Constituency 48", ward48);
        PrimeMinister primeMinister48 = new PrimeMinister("PM Name 48", "18/02/2027", "Party 48", 48, constituency48);
        Government government48 = new Government("Town Government", "State 48", 2048, "Capital 48", primeMinister48);
        Tax tax48 = new Tax("AgriTech Tax", 0.20, 2027, "Authority 48", government48);
        VariablePay variablePay48 = new VariablePay(8948, "Employee 48", 88000, 118000, tax48);
        Bonus bonus48 = new Bonus("AgriTech Bonus", 9800, "20/02/2027", "Agriculture innovation", variablePay48);
        SalaryExpectation salaryExpected48 = new SalaryExpectation("Candidate 48", "AgriTech", 70348, 7, bonus48);
        List<Criteria> criteria48 = Arrays.asList(
                new Criteria("B.Tech Agri", "Required", 7, "Reviewer B", salaryExpected48),
                new Criteria("Field exp.", "Preferred", 5, "Reviewer C", salaryExpected48)
        );
        Role role48 = new Role("AgriTech Coordinator", "Manages agri‑tech projects", 85748, 7, criteria48);
        Designation designation48 = new Designation("AgriTech Director", "Leads AgriTech Dept", "AgriTech", 89048, role48);
        President president48 = new President("President 48", "CTO AgriTech", 48, "2323484848", designation48);
        University university48 = new University("AgriTech University 48", "City 48", 2028, "Farm Ave", president48);
        Education education48 = new Education("M.Tech Agri", "AgriTech University 48", 2028, 9.3, university48);
        List<Experience> experience48 = Arrays.asList(
                new Experience("IARI", "Agri Engineer", 2, "City 48", education48),
                new Experience("ICAR", "Agri Scientist", 3, "City 48", education48)
        );
        Inspector inspector48 = new Inspector("Inspector 48", "AgriTech Inspector", 11, "9999484848", experience48);
        RTO rto48 = new RTO(56748, "City 48", "WB-48", "2323484848", inspector48);
        Registration registration48 = new Registration(89048, "AgriVan", "Rajesh Singh", "Farm Road", rto48);
        Vehicle vehicle48 = new Vehicle("WB-48-AV-8948", "AgriVan", 2027, "Mahindra", registration48);
        Mayor mayor48 = new Mayor("Mayor 48", "Mayor of City 48", 5, "4567484848", vehicle48);
        Information information48 = new Information(7848, "1180 sqr", "https://info/48", "5678948484", mayor48);
        City city48 = new City("City 48", "State 48", 56828, "Zone‑48", information48);
        Address address48 = new Address("Farm Road", "City 48", "State 48", "India", city48);
        Details detail48 = new Details("Rajesh Singh", "AgriTech Lead", "9999484848", 32, address48);
        Owner[] owners48 = {
                new Owner("Owner A 48", "9333364848", "ownera48@mail.com", "City 48",
                        new House[]{ new House("48A", "Farm Lane", "City 48", "State 48", detail48),
                                new House("48B", "Agro Park", "City 48", "State 48", detail48) }),
                new Owner("Owner B 48", "9405834848", "ownerb48@mail.com", "City 48",
                        new House[]{ new House("48C", "Crop Blvd", "City 48", "State 48", detail48),
                                new House("48D", "Tech Circle", "City 48", "State 48", detail48) })
        };
        Company company48 = new Company("AgriTechWorks 48", "Agri Campus", "agritech", 1048, owners48);
        Product product48 = new Product("FarmSuite", 8948, 329, "agritech‑solution", company48);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward49 = new Ward(49, "Ward 49", 9049, "Councilor 49");
        Constituency constituency49 = new Constituency("City 49", "District 49", 890049, "Constituency 49", ward49);
        PrimeMinister primeMinister49 = new PrimeMinister("PM Name 49", "19/03/2027", "Party 49", 49, constituency49);
        Government government49 = new Government("Metro Government", "State 49", 2049, "Capital 49", primeMinister49);
        Tax tax49 = new Tax("Metro Tax", 0.19, 2027, "Authority 49", government49);
        VariablePay variablePay49 = new VariablePay(8949, "Employee 49", 88000, 119000, tax49);
        Bonus bonus49 = new Bonus("Urban Bonus", 9800, "19/03/2027", "City planning reward", variablePay49);
        SalaryExpectation salaryExpected49 = new SalaryExpectation("Candidate 49", "UrbanTech", 70349, 8, bonus49);
        List<Criteria> criteria49 = Arrays.asList(
                new Criteria("Urban Planning Degree", "Required", 8, "Reviewer A", salaryExpected49),
                new Criteria("3D Modeling Skill", "Preferred", 6, "Reviewer B", salaryExpected49)
        );
        Role role49 = new Role("Urban Planner", "Designs urban layouts", 85749, 7, criteria49);
        Designation designation49 = new Designation("City Planning Head", "Leads Planning", "UrbanTech", 89049, role49);
        President president49 = new President("President 49", "Urban CTO", 49, "2323494949", designation49);
        University university49 = new University("Urban University 49", "City 49", 2029, "Planner Ave", president49);
        Education education49 = new Education("M.Plan", "Urban University 49", 2029, 9.1, university49);
        List<Experience> experience49 = Arrays.asList(
                new Experience("SmartCity Corp", "Junior Planner", 2, "City 49", education49),
                new Experience("UrbanVision Ltd", "Lead Designer", 3, "City 49", education49)
        );
        Inspector inspector49 = new Inspector("Inspector 49", "Urban Inspector", 10, "9999494949", experience49);
        RTO rto49 = new RTO(56749, "City 49", "WB-49", "2323494949", inspector49);
        Registration registration49 = new Registration(89049, "Urban Rover", "Priya Mehta", "Design Street", rto49);
        Vehicle vehicle49 = new Vehicle("WB-49-UR-8949", "Urban Rover", 2027, "Tesla", registration49);
        Mayor mayor49 = new Mayor("Mayor 49", "Mayor of City 49", 5, "4567494949", vehicle49);
        Information information49 = new Information(7849, "1190 sqr", "https://info/49", "5678949494", mayor49);
        City city49 = new City("City 49", "State 49", 56829, "Zone-49", information49);
        Address address49 = new Address("Design Street", "City 49", "State 49", "India", city49);
        Details detail49 = new Details("Priya Mehta", "Urban Planner", "9999494949", 31, address49);
        Owner[] owners49 = {
                new Owner("Owner A 49", "9333364949", "ownera49@mail.com", "City 49",
                        new House[] {
                                new House("49A", "Urban Blvd", "City 49", "State 49", detail49),
                                new House("49B", "Planner Lane", "City 49", "State 49", detail49)
                        }),
                new Owner("Owner B 49", "9405834949", "ownerb49@mail.com", "City 49",
                        new House[] {
                                new House("49C", "Metro Circle", "City 49", "State 49", detail49),
                                new House("49D", "Skyline Rd", "City 49", "State 49", detail49)
                        })
        };
        Company company49 = new Company("UrbanRise Ltd", "Metro Campus", "urban", 1049, owners49);
        Product product49 = new Product("CitySketch", 8949, 369, "urban-planning", company49);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward50 = new Ward(50, "Ward 50", 9050, "Councilor 50");
        Constituency constituency50 = new Constituency("City 50", "District 50", 890050, "Constituency 50", ward50);
        PrimeMinister primeMinister50 = new PrimeMinister("PM Name 50", "20/04/2027", "Party 50", 50, constituency50);
        Government government50 = new Government("National Government", "State 50", 2050, "Capital 50", primeMinister50);
        Tax tax50 = new Tax("Green Tax", 0.20, 2027, "Authority 50", government50);
        VariablePay variablePay50 = new VariablePay(8950, "Employee 50", 89000, 120000, tax50);
        Bonus bonus50 = new Bonus("Eco Bonus", 9900, "20/04/2027", "Green initiative reward", variablePay50);
        SalaryExpectation salaryExpected50 = new SalaryExpectation("Candidate 50", "EcoTech", 70350, 8, bonus50);
        List<Criteria> criteria50 = Arrays.asList(
                new Criteria("Environmental Engg Degree", "Required", 8, "Reviewer X", salaryExpected50),
                new Criteria("Sustainability Cert.", "Preferred", 6, "Reviewer Y", salaryExpected50)
        );
        Role role50 = new Role("Eco Engineer", "Designs green solutions", 85750, 7, criteria50);
        Designation designation50 = new Designation("Chief Green Officer", "Heads Eco Initiatives", "EcoTech", 89050, role50);
        President president50 = new President("President 50", "CGO", 50, "2323505050", designation50);
        University university50 = new University("Green University 50", "City 50", 2030, "Eco Blvd", president50);
        Education education50 = new Education("M.Tech Enviro", "Green University 50", 2030, 9.5, university50);
        List<Experience> experience50 = Arrays.asList(
                new Experience("EcoLife", "Enviro Intern", 2, "City 50", education50),
                new Experience("GreenTech", "Sustainability Lead", 4, "City 50", education50)
        );
        Inspector inspector50 = new Inspector("Inspector 50", "Eco Inspector", 9, "9999505050", experience50);
        RTO rto50 = new RTO(56750, "City 50", "WB-50", "2323505050", inspector50);
        Registration registration50 = new Registration(89050, "EcoVan", "Anita Desai", "Green Lane", rto50);
        Vehicle vehicle50 = new Vehicle("WB-50-EV-8950", "EcoVan", 2027, "BYD", registration50);
        Mayor mayor50 = new Mayor("Mayor 50", "Mayor of City 50", 6, "4567505050", vehicle50);
        Information information50 = new Information(7850, "1200 sqr", "https://info/50", "5678950505", mayor50);
        City city50 = new City("City 50", "State 50", 56830, "Zone-50", information50);
        Address address50 = new Address("Green Lane", "City 50", "State 50", "India", city50);
        Details detail50 = new Details("Anita Desai", "Eco Consultant", "9999505050", 33, address50);
        Owner[] owners50 = {
                new Owner("Owner A 50", "9333365050", "ownera50@mail.com", "City 50",
                        new House[] {
                                new House("50A", "Eco Valley", "City 50", "State 50", detail50),
                                new House("50B", "Green Hills", "City 50", "State 50", detail50)
                        }),
                new Owner("Owner B 50", "9405835050", "ownerb50@mail.com", "City 50",
                        new House[] {
                                new House("50C", "Sustain St", "City 50", "State 50", detail50),
                                new House("50D", "Solar Crescent", "City 50", "State 50", detail50)
                        })
        };
        Company company50 = new Company("GreenSpark", "Eco Campus", "ecotech", 1050, owners50);
        Product product50 = new Product("EcoSuite", 8950, 399, "eco-solutions", company50);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward51 = new Ward(51, "Ward 51", 9051, "Councilor 51");
        Constituency constituency51 = new Constituency("City 51", "District 51", 890051, "Constituency 51", ward51);
        PrimeMinister primeMinister51 = new PrimeMinister("PM Name 51", "21/05/2027", "Party 51", 51, constituency51);
        Government government51 = new Government("County Government", "State 51", 2051, "Capital 51", primeMinister51);
        Tax tax51 = new Tax("Water Tax", 0.15, 2027, "Authority 51", government51);
        VariablePay variablePay51 = new VariablePay(8951, "Employee 51", 90000, 121000, tax51);
        Bonus bonus51 = new Bonus("Water Conservation Bonus", 10000, "01/06/2027", "Water saving incentive", variablePay51);
        SalaryExpectation salaryExpected51 = new SalaryExpectation("Candidate 51", "Water Systems", 70351, 9, bonus51);
        List<Criteria> criteria51 = Arrays.asList(
                new Criteria("Civil Eng.", "Required", 9, "Reviewer A", salaryExpected51),
                new Criteria("Hydrology exp.", "Preferred", 6, "Reviewer B", salaryExpected51)
        );
        Role role51 = new Role("Water Systems Coordinator", "Manages water resources", 85751, 6, criteria51);
        Designation designation51 = new Designation("Water Director", "Leads water dept", "Water", 89051, role51);
        President president51 = new President("President 51", "Water Board Chair", 51, "2323515151", designation51);
        University university51 = new University("Water University 51", "City 51", 2031, "Water Blvd", president51);
        Education education51 = new Education("M.Tech Water", "Water University 51", 2031, 9.3, university51);
        List<Experience> experience51 = Arrays.asList(
                new Experience("Irrigation Dept", "Engineer", 3, "City 51", education51),
                new Experience("Water Board", "Coordinator", 4, "City 51", education51)
        );
        Inspector inspector51 = new Inspector("Inspector 51", "Water Inspector", 11, "9999515151", experience51);
        RTO rto51 = new RTO(56751, "City 51", "WB-51", "2323515151", inspector51);
        Registration registration51 = new Registration(89051, "Water Truck", "Anand Kumar", "Water Road", rto51);
        Vehicle vehicle51 = new Vehicle("WB-51-WT-8951", "Water Truck", 2026, "Tata", registration51);
        Mayor mayor51 = new Mayor("Mayor 51", "Mayor of City 51", 5, "4567515151", vehicle51);
        Information information51 = new Information(7851, "1210 sqr", "https://info/51", "5678951515", mayor51);
        City city51 = new City("City 51", "State 51", 56831, "Zone-51", information51);
        Address address51 = new Address("Water Road", "City 51", "State 51", "India", city51);
        Details detail51 = new Details("Anand Kumar", "Water Lead", "9999515151", 36, address51);
        Owner[] owners51 = {
                new Owner("Owner A 51", "9333365151", "ownera51@mail.com", "City 51",
                        new House[]{ new House("51A", "River St", "City 51", "State 51", detail51),
                                new House("51B", "Reservoir Lane", "City 51", "State 51", detail51) }),
                new Owner("Owner B 51", "9405835151", "ownerb51@mail.com", "City 51",
                        new House[]{ new House("51C", "Dam Road", "City 51", "State 51", detail51),
                                new House("51D", "Canal Blvd", "City 51", "State 51", detail51) })
        };
        Company company51 = new Company("WaterWorks Ltd", "Water Campus", "water", 1051, owners51);
        Product product51 = new Product("AquaManager", 8951, 359, "water-tech", company51);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward52 = new Ward(52, "Ward 52", 9052, "Councilor 52");
        Constituency constituency52 = new Constituency("City 52", "District 52", 890052, "Constituency 52", ward52);
        PrimeMinister primeMinister52 = new PrimeMinister("PM Name 52", "22/06/2027", "Party 52", 52, constituency52);
        Government government52 = new Government("Regional Government", "State 52", 2052, "Capital 52", primeMinister52);
        Tax tax52 = new Tax("Energy Tax", 0.17, 2027, "Authority 52", government52);
        VariablePay variablePay52 = new VariablePay(8952, "Employee 52", 91000, 122000, tax52);
        Bonus bonus52 = new Bonus("Energy Efficiency Bonus", 10100, "01/07/2027", "Energy savings reward", variablePay52);
        SalaryExpectation salaryExpected52 = new SalaryExpectation("Candidate 52", "Energy Management", 70352, 8, bonus52);
        List<Criteria> criteria52 = Arrays.asList(
                new Criteria("B.Tech Energy", "Required", 8, "Reviewer C", salaryExpected52),
                new Criteria("Renewables exp.", "Preferred", 6, "Reviewer D", salaryExpected52)
        );
        Role role52 = new Role("Energy Coordinator", "Manages energy usage", 85752, 6, criteria52);
        Designation designation52 = new Designation("Energy Director", "Leads energy dept", "Energy", 89052, role52);
        President president52 = new President("President 52", "Energy Board Chair", 52, "2323525252", designation52);
        University university52 = new University("Energy University 52", "City 52", 2032, "Energy Blvd", president52);
        Education education52 = new Education("M.Tech Energy", "Energy University 52", 2032, 9.4, university52);
        List<Experience> experience52 = Arrays.asList(
                new Experience("Solar Corp", "Engineer", 3, "City 52", education52),
                new Experience("Wind Farms", "Coordinator", 4, "City 52", education52)
        );
        Inspector inspector52 = new Inspector("Inspector 52", "Energy Inspector", 12, "9999525252", experience52);
        RTO rto52 = new RTO(56752, "City 52", "WB-52", "2323525252", inspector52);
        Registration registration52 = new Registration(89052, "Energy Truck", "Sunil Kumar", "Energy Road", rto52);
        Vehicle vehicle52 = new Vehicle("WB-52-ET-8952", "Energy Truck", 2026, "Tata", registration52);
        Mayor mayor52 = new Mayor("Mayor 52", "Mayor of City 52", 5, "4567525252", vehicle52);
        Information information52 = new Information(7852, "1220 sqr", "https://info/52", "5678952525", mayor52);
        City city52 = new City("City 52", "State 52", 56832, "Zone-52", information52);
        Address address52 = new Address("Energy Road", "City 52", "State 52", "India", city52);
        Details detail52 = new Details("Sunil Kumar", "Energy Lead", "9999525252", 38, address52);
        Owner[] owners52 = {
                new Owner("Owner A 52", "9333365252", "ownera52@mail.com", "City 52",
                        new House[]{ new House("52A", "Solar Blvd", "City 52", "State 52", detail52),
                                new House("52B", "Wind Lane", "City 52", "State 52", detail52) }),
                new Owner("Owner B 52", "9405835252", "ownerb52@mail.com", "City 52",
                        new House[]{ new House("52C", "Grid Park", "City 52", "State 52", detail52),
                                new House("52D", "Renewable Rd", "City 52", "State 52", detail52) })
        };
        Company company52 = new Company("EnergyWorks Ltd", "Energy Campus", "energy", 1052, owners52);
        Product product52 = new Product("EcoEnergy", 8952, 379, "energy-tech", company52);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward53 = new Ward(53, "Ward 53", 9053, "Councilor 53");
        Constituency constituency53 = new Constituency("City 53", "District 53", 890053, "Constituency 53", ward53);
        PrimeMinister primeMinister53 = new PrimeMinister("PM Name 53", "23/07/2027", "Party 53", 53, constituency53);
        Government government53 = new Government("Regional Government", "State 53", 2053, "Capital 53", primeMinister53);
        Tax tax53 = new Tax("Health Tax", 0.16, 2027, "Authority 53", government53);
        VariablePay variablePay53 = new VariablePay(8953, "Employee 53", 92000, 123000, tax53);
        Bonus bonus53 = new Bonus("Health Bonus", 10200, "01/08/2027", "Healthcare reward", variablePay53);
        SalaryExpectation salaryExpected53 = new SalaryExpectation("Candidate 53", "Healthcare", 70353, 9, bonus53);
        List<Criteria> criteria53 = Arrays.asList(
                new Criteria("MBBS", "Required", 9, "Reviewer E", salaryExpected53),
                new Criteria("Clinic exp.", "Preferred", 7, "Reviewer F", salaryExpected53)
        );
        Role role53 = new Role("Clinic Coordinator", "Manages healthcare clinics", 85753, 6, criteria53);
        Designation designation53 = new Designation("Clinic Director", "Leads healthcare", "Healthcare", 89053, role53);
        President president53 = new President("President 53", "Health Board Chair", 53, "2323535353", designation53);
        University university53 = new University("Health University 53", "City 53", 2033, "Health Blvd", president53);
        Education education53 = new Education("MBBS", "Health University 53", 2033, 9.2, university53);
        List<Experience> experience53 = Arrays.asList(
                new Experience("Fortis", "Doctor", 3, "City 53", education53),
                new Experience("Max Healthcare", "Coordinator", 4, "City 53", education53)
        );
        Inspector inspector53 = new Inspector("Inspector 53", "Health Inspector", 13, "9999535353", experience53);
        RTO rto53 = new RTO(56753, "City 53", "WB-53", "2323535353", inspector53);
        Registration registration53 = new Registration(89053, "Clinic Van", "Dr. Kapoor", "Health Rd", rto53);
        Vehicle vehicle53 = new Vehicle("WB-53-CV-8953", "Clinic Van", 2026, "Maruti", registration53);
        Mayor mayor53 = new Mayor("Mayor 53", "Mayor of City 53", 5, "4567535353", vehicle53);
        Information information53 = new Information(7853, "1230 sqr", "https://info/53", "5678953535", mayor53);
        City city53 = new City("City 53", "State 53", 56833, "Zone-53", information53);
        Address address53 = new Address("Health Rd", "City 53", "State 53", "India", city53);
        Details detail53 = new Details("Dr. Kapoor", "Clinic Head", "9999535353", 42, address53);
        Owner[] owners53 = {
                new Owner("Owner A 53", "9333365353", "ownera53@mail.com", "City 53",
                        new House[]{ new House("53A", "Clinic Lane", "City 53", "State 53", detail53),
                                new House("53B", "Medical Ave", "City 53", "State 53", detail53) }),
                new Owner("Owner B 53", "9405835353", "ownerb53@mail.com", "City 53",
                        new House[]{ new House("53C", "Health Park", "City 53", "State 53", detail53),
                                new House("53D", "Wellness Blvd", "City 53", "State 53", detail53) })
        };
        Company company53 = new Company("HealthWorks Ltd", "Health Campus", "health", 1053, owners53);
        Product product53 = new Product("ClinicSuite", 8953, 389, "health-tech", company53);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward54 = new Ward(54, "Ward 54", 9054, "Councilor 54");
        Constituency constituency54 = new Constituency("City 54", "District 54", 890054, "Constituency 54", ward54);
        PrimeMinister primeMinister54 = new PrimeMinister("PM Name 54", "24/08/2027", "Party 54", 54, constituency54);
        Government government54 = new Government("Regional Government", "State 54", 2054, "Capital 54", primeMinister54);
        Tax tax54 = new Tax("Infrastructure Tax", 0.18, 2027, "Authority 54", government54);
        VariablePay variablePay54 = new VariablePay(8954, "Employee 54", 93000, 124000, tax54);
        Bonus bonus54 = new Bonus("Infrastructure Bonus", 10300, "01/09/2027", "Infrastructure upgrade reward", variablePay54);
        SalaryExpectation salaryExpected54 = new SalaryExpectation("Candidate 54", "Civil Engineering", 70354, 9, bonus54);
        List<Criteria> criteria54 = Arrays.asList(
                new Criteria("BE Civil", "Required", 9, "Reviewer A", salaryExpected54),
                new Criteria("Bridge design", "Preferred", 7, "Reviewer B", salaryExpected54)
        );
        Role role54 = new Role("Infrastructure Manager", "Handles public infrastructure", 85754, 6, criteria54);
        Designation designation54 = new Designation("Infra Director", "Leads infra dept", "Infrastructure", 89054, role54);
        President president54 = new President("President 54", "Infra Board Head", 54, "2323545454", designation54);
        University university54 = new University("Infra University 54", "City 54", 2034, "Infra Blvd", president54);
        Education education54 = new Education("M.Tech Civil", "Infra University 54", 2034, 9.3, university54);
        List<Experience> experience54 = Arrays.asList(
                new Experience("L&T", "Civil Engineer", 4, "City 54", education54),
                new Experience("NHAI", "Project Manager", 5, "City 54", education54)
        );
        Inspector inspector54 = new Inspector("Inspector 54", "Infra Inspector", 14, "9999545454", experience54);
        RTO rto54 = new RTO(56754, "City 54", "WB-54", "2323545454", inspector54);
        Registration registration54 = new Registration(89054, "Crane Truck", "Neeraj Patel", "Infra Park", rto54);
        Vehicle vehicle54 = new Vehicle("WB-54-CT-8954", "Crane Truck", 2026, "Ashok Leyland", registration54);
        Mayor mayor54 = new Mayor("Mayor 54", "Mayor of City 54", 5, "4567545454", vehicle54);
        Information information54 = new Information(7854, "1240 sqr", "https://info/54", "5678954545", mayor54);
        City city54 = new City("City 54", "State 54", 56834, "Zone-54", information54);
        Address address54 = new Address("Infra Park", "City 54", "State 54", "India", city54);
        Details detail54 = new Details("Neeraj Patel", "Infra Lead", "9999545454", 39, address54);
        Owner[] owners54 = {
                new Owner("Owner A 54", "9333365454", "ownera54@mail.com", "City 54",
                        new House[]{ new House("54A", "Bridge Street", "City 54", "State 54", detail54),
                                new House("54B", "Construction Ave", "City 54", "State 54", detail54) }),
                new Owner("Owner B 54", "9405835454", "ownerb54@mail.com", "City 54",
                        new House[]{ new House("54C", "Structural Blvd", "City 54", "State 54", detail54),
                                new House("54D", "Infra Zone", "City 54", "State 54", detail54) })
        };
        Company company54 = new Company("InfraBuild Ltd", "Infra Campus", "infrastructure", 1054, owners54);
        Product product54 = new Product("InfraX", 8954, 399, "infra-tech", company54);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward55 = new Ward(55, "Ward 55", 9055, "Councilor 55");
        Constituency constituency55 = new Constituency("City 55", "District 55", 890055, "Constituency 55", ward55);
        PrimeMinister primeMinister55 = new PrimeMinister("PM Name 55", "25/09/2027", "Party 55", 55, constituency55);
        Government government55 = new Government("Metropolitan Government", "State 55", 2055, "Capital 55", primeMinister55);
        Tax tax55 = new Tax("Service Tax", 0.19, 2027, "Authority 55", government55);
        VariablePay variablePay55 = new VariablePay(8955, "Employee 55", 94000, 125000, tax55);
        Bonus bonus55 = new Bonus("Customer Service Bonus", 10400, "01/10/2027", "Excellent service award", variablePay55);
        SalaryExpectation salaryExpected55 = new SalaryExpectation("Candidate 55", "Business Administration", 70355, 8, bonus55);
        List<Criteria> criteria55 = Arrays.asList(
                new Criteria("MBA", "Required", 8, "Reviewer A", salaryExpected55),
                new Criteria("CRM knowledge", "Preferred", 7, "Reviewer B", salaryExpected55)
        );
        Role role55 = new Role("Customer Relations Manager", "Manages client interactions", 85755, 6, criteria55);
        Designation designation55 = new Designation("Service Director", "Heads service dept", "Service", 89055, role55);
        President president55 = new President("President 55", "Service Board Head", 55, "2323555555", designation55);
        University university55 = new University("Service University 55", "City 55", 2035, "Service Blvd", president55);
        Education education55 = new Education("MBA", "Service University 55", 2035, 9.0, university55);
        List<Experience> experience55 = Arrays.asList(
                new Experience("Infosys", "Analyst", 3, "City 55", education55),
                new Experience("Amazon", "Account Manager", 4, "City 55", education55)
        );
        Inspector inspector55 = new Inspector("Inspector 55", "Service Inspector", 15, "9999555555", experience55);
        RTO rto55 = new RTO(56755, "City 55", "WB-55", "2323555555", inspector55);
        Registration registration55 = new Registration(89055, "Support Van", "Raj Mehta", "Service Lane", rto55);
        Vehicle vehicle55 = new Vehicle("WB-55-SV-8955", "Support Van", 2026, "Hyundai", registration55);
        Mayor mayor55 = new Mayor("Mayor 55", "Mayor of City 55", 5, "4567555555", vehicle55);
        Information information55 = new Information(7855, "1250 sqr", "https://info/55", "5678955555", mayor55);
        City city55 = new City("City 55", "State 55", 56835, "Zone-55", information55);
        Address address55 = new Address("Service Lane", "City 55", "State 55", "India", city55);
        Details detail55 = new Details("Raj Mehta", "Support Lead", "9999555555", 34, address55);
        Owner[] owners55 = {
                new Owner("Owner A 55", "9333365555", "ownera55@mail.com", "City 55",
                        new House[]{ new House("55A", "Help Road", "City 55", "State 55", detail55),
                                new House("55B", "Service St", "City 55", "State 55", detail55) }),
                new Owner("Owner B 55", "9405835555", "ownerb55@mail.com", "City 55",
                        new House[]{ new House("55C", "Client Blvd", "City 55", "State 55", detail55),
                                new House("55D", "Support Ave", "City 55", "State 55", detail55) })
        };
        Company company55 = new Company("ServeWell Ltd", "Service Campus", "services", 1055, owners55);
        Product product55 = new Product("ClientConnect", 8955, 409, "service-tech", company55);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward56 = new Ward(56, "Ward 56", 9056, "Councilor 56");
        Constituency constituency56 = new Constituency("City 56", "District 56", 890056, "Constituency 56", ward56);
        PrimeMinister primeMinister56 = new PrimeMinister("PM Name 56", "26/10/2027", "Party 56", 56, constituency56);
        Government government56 = new Government("Urban Government", "State 56", 2056, "Capital 56", primeMinister56);
        Tax tax56 = new Tax("Transport Tax", 0.20, 2027, "Authority 56", government56);
        VariablePay variablePay56 = new VariablePay(8956, "Employee 56", 95000, 126000, tax56);
        Bonus bonus56 = new Bonus("Urban Transport Bonus", 10500, "01/11/2027", "Urban mobility innovation", variablePay56);
        SalaryExpectation salaryExpected56 = new SalaryExpectation("Candidate 56", "Urban Planning", 70356, 9, bonus56);
        List<Criteria> criteria56 = Arrays.asList(
                new Criteria("MUP", "Required", 9, "Reviewer A", salaryExpected56),
                new Criteria("Transit systems", "Preferred", 7, "Reviewer B", salaryExpected56)
        );
        Role role56 = new Role("Urban Transit Planner", "Designs city transport", 85756, 6, criteria56);
        Designation designation56 = new Designation("Transit Director", "Leads transport dept", "Transport", 89056, role56);
        President president56 = new President("President 56", "Transit Board Chair", 56, "2323565656", designation56);
        University university56 = new University("Urban University 56", "City 56", 2036, "Transit Blvd", president56);
        Education education56 = new Education("MUP", "Urban University 56", 2036, 9.4, university56);
        List<Experience> experience56 = Arrays.asList(
                new Experience("Metro Rail", "Planner", 4, "City 56", education56),
                new Experience("Transport Corp", "Engineer", 4, "City 56", education56)
        );
        Inspector inspector56 = new Inspector("Inspector 56", "Transit Inspector", 16, "9999565656", experience56);
        RTO rto56 = new RTO(56756, "City 56", "WB-56", "2323565656", inspector56);
        Registration registration56 = new Registration(89056, "Metro Van", "Sanya Gupta", "Transit Center", rto56);
        Vehicle vehicle56 = new Vehicle("WB-56-MV-8956", "Metro Van", 2026, "Mahindra", registration56);
        Mayor mayor56 = new Mayor("Mayor 56", "Mayor of City 56", 5, "4567565656", vehicle56);
        Information information56 = new Information(7856, "1260 sqr", "https://info/56", "5678956565", mayor56);
        City city56 = new City("City 56", "State 56", 56836, "Zone-56", information56);
        Address address56 = new Address("Transit Center", "City 56", "State 56", "India", city56);
        Details detail56 = new Details("Sanya Gupta", "Transit Head", "9999565656", 37, address56);
        Owner[] owners56 = {
                new Owner("Owner A 56", "9333365656", "ownera56@mail.com", "City 56",
                        new House[]{ new House("56A", "Metro Street", "City 56", "State 56", detail56),
                                new House("56B", "Bus Depot Rd", "City 56", "State 56", detail56) }),
                new Owner("Owner B 56", "9405835656", "ownerb56@mail.com", "City 56",
                        new House[]{ new House("56C", "Transport Blvd", "City 56", "State 56", detail56),
                                new House("56D", "Mobility Lane", "City 56", "State 56", detail56) })
        };
        Company company56 = new Company("UrbanTransit Ltd", "Mobility Campus", "transport", 1056, owners56);
        Product product56 = new Product("TransitFlow", 8956, 419, "transport-tech", company56);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward57 = new Ward(57, "Ward 57", 9057, "Councilor 57");
        Constituency constituency57 = new Constituency("City 57", "District 57", 890057, "Constituency 57", ward57);
        PrimeMinister primeMinister57 = new PrimeMinister("PM Name 57", "27/11/2027", "Party 57", 57, constituency57);
        Government government57 = new Government("Digital Government", "State 57", 2057, "Capital 57", primeMinister57);
        Tax tax57 = new Tax("Software Tax", 0.21, 2027, "Authority 57", government57);
        VariablePay variablePay57 = new VariablePay(8957, "Employee 57", 97000, 128000, tax57);
        Bonus bonus57 = new Bonus("Software Innovation Bonus", 10600, "01/12/2027", "Innovation milestone", variablePay57);
        SalaryExpectation salaryExpected57 = new SalaryExpectation("Candidate 57", "Software Engineering", 70357, 10, bonus57);
        List<Criteria> criteria57 = Arrays.asList(
                new Criteria("B.Tech in CS", "Required", 10, "Reviewer A", salaryExpected57),
                new Criteria("AI/ML experience", "Preferred", 8, "Reviewer B", salaryExpected57)
        );
        Role role57 = new Role("AI Developer", "Works on AI solutions", 85757, 7, criteria57);
        Designation designation57 = new Designation("Tech Lead", "Leads AI team", "Software", 89057, role57);
        President president57 = new President("President 57", "CTO", 57, "2323575757", designation57);
        University university57 = new University("AI University 57", "City 57", 2037, "Innovation Park", president57);
        Education education57 = new Education("M.Tech AI", "AI University 57", 2037, 9.5, university57);
        List<Experience> experience57 = Arrays.asList(
                new Experience("NVIDIA", "ML Intern", 1, "City 57", education57),
                new Experience("OpenAI", "AI Engineer", 3, "City 57", education57)
        );
        Inspector inspector57 = new Inspector("Inspector 57", "Tech Inspector", 17, "9999575757", experience57);
        RTO rto57 = new RTO(56757, "City 57", "WB-57", "2323575757", inspector57);
        Registration registration57 = new Registration(89057, "AI Van", "Arya Mehta", "Tech Bay", rto57);
        Vehicle vehicle57 = new Vehicle("WB-57-AI-8957", "AI Van", 2027, "Tesla", registration57);
        Mayor mayor57 = new Mayor("Mayor 57", "Mayor of City 57", 5, "4567575757", vehicle57);
        Information information57 = new Information(7857, "1270 sqr", "https://info/57", "5678957575", mayor57);
        City city57 = new City("City 57", "State 57", 56837, "Zone-57", information57);
        Address address57 = new Address("Tech Bay", "City 57", "State 57", "India", city57);
        Details detail57 = new Details("Arya Mehta", "AI Lead", "9999575757", 32, address57);
        Owner[] owners57 = {
                new Owner("Owner A 57", "9333365757", "ownera57@mail.com", "City 57",
                        new House[]{ new House("57A", "AI Street", "City 57", "State 57", detail57),
                                new House("57B", "ML Lane", "City 57", "State 57", detail57) }),
                new Owner("Owner B 57", "9405835757", "ownerb57@mail.com", "City 57",
                        new House[]{ new House("57C", "Data Blvd", "City 57", "State 57", detail57),
                                new House("57D", "Compute Rd", "City 57", "State 57", detail57) })
        };
        Company company57 = new Company("NeuroSoft", "AI Campus", "software", 1057, owners57);
        Product product57 = new Product("NeuroLink", 8957, 429, "ai-tech", company57);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward58 = new Ward(58, "Ward 58", 9058, "Councilor 58");
        Constituency constituency58 = new Constituency("City 58", "District 58", 890058, "Constituency 58", ward58);
        PrimeMinister primeMinister58 = new PrimeMinister("PM Name 58", "28/12/2027", "Party 58", 58, constituency58);
        Government government58 = new Government("Environmental Government", "State 58", 2058, "Capital 58", primeMinister58);
        Tax tax58 = new Tax("Green Tax", 0.22, 2027, "Authority 58", government58);
        VariablePay variablePay58 = new VariablePay(8958, "Employee 58", 98000, 129000, tax58);
        Bonus bonus58 = new Bonus("Sustainability Bonus", 10700, "01/01/2028", "Eco initiative reward", variablePay58);
        SalaryExpectation salaryExpected58 = new SalaryExpectation("Candidate 58", "Environmental Science", 70358, 8, bonus58);
        List<Criteria> criteria58 = Arrays.asList(
                new Criteria("B.Sc Env Science", "Required", 8, "Reviewer A", salaryExpected58),
                new Criteria("Recycling management", "Preferred", 6, "Reviewer B", salaryExpected58)
        );
        Role role58 = new Role("Eco Analyst", "Works on green projects", 85758, 6, criteria58);
        Designation designation58 = new Designation("Eco Director", "Heads sustainability", "Environment", 89058, role58);
        President president58 = new President("President 58", "Eco Board", 58, "2323585858", designation58);
        University university58 = new University("Eco University 58", "City 58", 2038, "Eco Campus", president58);
        Education education58 = new Education("M.Sc Env", "Eco University 58", 2038, 9.2, university58);
        List<Experience> experience58 = Arrays.asList(
                new Experience("GreenPeace", "Analyst", 2, "City 58", education58),
                new Experience("UNEP", "Consultant", 4, "City 58", education58)
        );
        Inspector inspector58 = new Inspector("Inspector 58", "Eco Inspector", 18, "9999585858", experience58);
        RTO rto58 = new RTO(56758, "City 58", "WB-58", "2323585858", inspector58);
        Registration registration58 = new Registration(89058, "Eco Scooter", "Rehan Khan", "Green Bay", rto58);
        Vehicle vehicle58 = new Vehicle("WB-58-ES-8958", "Eco Scooter", 2027, "Hero Electric", registration58);
        Mayor mayor58 = new Mayor("Mayor 58", "Mayor of City 58", 5, "4567585858", vehicle58);
        Information information58 = new Information(7858, "1280 sqr", "https://info/58", "5678958585", mayor58);
        City city58 = new City("City 58", "State 58", 56838, "Zone-58", information58);
        Address address58 = new Address("Green Bay", "City 58", "State 58", "India", city58);
        Details detail58 = new Details("Rehan Khan", "Environmentalist", "9999585858", 31, address58);
        Owner[] owners58 = {
                new Owner("Owner A 58", "9333365858", "ownera58@mail.com", "City 58",
                        new House[]{ new House("58A", "Green Street", "City 58", "State 58", detail58),
                                new House("58B", "Solar Lane", "City 58", "State 58", detail58) }),
                new Owner("Owner B 58", "9405835858", "ownerb58@mail.com", "City 58",
                        new House[]{ new House("58C", "Eco Zone", "City 58", "State 58", detail58),
                                new House("58D", "Recycle Rd", "City 58", "State 58", detail58) })
        };
        Company company58 = new Company("EcoNext", "Green Campus", "environment", 1058, owners58);
        Product product58 = new Product("EcoCycle", 8958, 439, "green-tech", company58);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward59 = new Ward(59, "Ward 59", 9059, "Councilor 59");
        Constituency constituency59 = new Constituency("City 59", "District 59", 890059, "Constituency 59", ward59);
        PrimeMinister primeMinister59 = new PrimeMinister("PM Name 59", "29/01/2028", "Party 59", 59, constituency59);
        Government government59 = new Government("Education Government", "State 59", 2059, "Capital 59", primeMinister59);
        Tax tax59 = new Tax("Edu Tax", 0.16, 2028, "Authority 59", government59);
        VariablePay variablePay59 = new VariablePay(8959, "Employee 59", 96000, 124000, tax59);
        Bonus bonus59 = new Bonus("Education Bonus", 10500, "01/06/2028", "Curriculum design reward", variablePay59);
        SalaryExpectation salaryExpected59 = new SalaryExpectation("Candidate 59", "Education", 70359, 7, bonus59);
        List<Criteria> criteria59 = Arrays.asList(
                new Criteria("PhD in Education", "Required", 7, "Reviewer A", salaryExpected59),
                new Criteria("Curriculum Design", "Preferred", 5, "Reviewer B", salaryExpected59)
        );
        Role role59 = new Role("Academic Advisor", "Oversees learning programs", 85759, 6, criteria59);
        Designation designation59 = new Designation("Dean", "Leads academic department", "Education", 89059, role59);
        President president59 = new President("President 59", "Education Board", 59, "2323595959", designation59);
        University university59 = new University("Pedagogy University 59", "City 59", 2039, "Scholar Blvd", president59);
        Education education59 = new Education("PhD Education", "Pedagogy University 59", 2039, 9.6, university59);
        List<Experience> experience59 = Arrays.asList(
                new Experience("UNESCO", "Advisor", 3, "City 59", education59),
                new Experience("Harvard", "Professor", 4, "City 59", education59)
        );
        Inspector inspector59 = new Inspector("Inspector 59", "Ed Inspector", 19, "9999595959", experience59);
        RTO rto59 = new RTO(56759, "City 59", "WB-59", "2323595959", inspector59);
        Registration registration59 = new Registration(89059, "Academic Bus", "Dr. Neha Roy", "Scholar Block", rto59);
        Vehicle vehicle59 = new Vehicle("WB-59-AB-8959", "Academic Bus", 2028, "Tata", registration59);
        Mayor mayor59 = new Mayor("Mayor 59", "Mayor of City 59", 5, "4567595959", vehicle59);
        Information information59 = new Information(7859, "1300 sqr", "https://info/59", "5678959595", mayor59);
        City city59 = new City("City 59", "State 59", 56839, "Zone-59", information59);
        Address address59 = new Address("Scholar Block", "City 59", "State 59", "India", city59);
        Details detail59 = new Details("Dr. Neha Roy", "Curriculum Expert", "9999595959", 45, address59);
        Owner[] owners59 = {
                new Owner("Owner A 59", "9333365959", "ownera59@mail.com", "City 59",
                        new House[]{
                                new House("59A", "Lecture Lane", "City 59", "State 59", detail59),
                                new House("59B", "Edu Drive", "City 59", "State 59", detail59)
                        }),
                new Owner("Owner B 59", "9405835959", "ownerb59@mail.com", "City 59",
                        new House[]{
                                new House("59C", "Library Road", "City 59", "State 59", detail59),
                                new House("59D", "Knowledge Ave", "City 59", "State 59", detail59)
                        })
        };
        Company company59 = new Company("LearnWare", "EduTech Campus", "education", 1059, owners59);
        Product product59 = new Product("SmartEduBoard", 8959, 449, "edtech", company59);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward60 = new Ward(60, "Ward 60", 9060, "Councilor 60");
        Constituency constituency60 = new Constituency("City 60", "District 60", 890060, "Constituency 60", ward60);
        PrimeMinister primeMinister60 = new PrimeMinister("PM Name 60", "30/01/2028", "Party 60", 60, constituency60);
        Government government60 = new Government("Transport Government", "State 60", 2060, "Capital 60", primeMinister60);
        Tax tax60 = new Tax("Transport Tax", 0.19, 2028, "Authority 60", government60);
        VariablePay variablePay60 = new VariablePay(8960, "Employee 60", 95000, 123000, tax60);
        Bonus bonus60 = new Bonus("Logistics Bonus", 10400, "15/06/2028", "Fleet optimization", variablePay60);
        SalaryExpectation salaryExpected60 = new SalaryExpectation("Candidate 60", "Transport Logistics", 70360, 8, bonus60);
        List<Criteria> criteria60 = Arrays.asList(
                new Criteria("MBA Logistics", "Required", 8, "Reviewer A", salaryExpected60),
                new Criteria("Fleet Management", "Preferred", 5, "Reviewer B", salaryExpected60)
        );
        Role role60 = new Role("Logistics Manager", "Manages transport operations", 85760, 5, criteria60);
        Designation designation60 = new Designation("Transport Director", "Heads logistics", "Logistics", 89060, role60);
        President president60 = new President("President 60", "Logistics Union", 60, "2323606060", designation60);
        University university60 = new University("Logistics University 60", "City 60", 2040, "Fleet St", president60);
        Education education60 = new Education("MBA Logistics", "Logistics University 60", 2040, 9.4, university60);
        List<Experience> experience60 = Arrays.asList(
                new Experience("DHL", "Logistics Analyst", 2, "City 60", education60),
                new Experience("FedEx", "Ops Manager", 3, "City 60", education60)
        );
        Inspector inspector60 = new Inspector("Inspector 60", "Logistics Inspector", 20, "9999606060", experience60);
        RTO rto60 = new RTO(56760, "City 60", "WB-60", "2323606060", inspector60);
        Registration registration60 = new Registration(89060, "Transport Truck", "Amit Sinha", "Fleet Yard", rto60);
        Vehicle vehicle60 = new Vehicle("WB-60-TT-8960", "Transport Truck", 2028, "Ashok Leyland", registration60);
        Mayor mayor60 = new Mayor("Mayor 60", "Mayor of City 60", 5, "4567606060", vehicle60);
        Information information60 = new Information(7860, "1350 sqr", "https://info/60", "5678960606", mayor60);
        City city60 = new City("City 60", "State 60", 56840, "Zone-60", information60);
        Address address60 = new Address("Fleet Yard", "City 60", "State 60", "India", city60);
        Details detail60 = new Details("Amit Sinha", "Fleet Operator", "9999606060", 38, address60);
        Owner[] owners60 = {
                new Owner("Owner A 60", "9333366060", "ownera60@mail.com", "City 60",
                        new House[]{
                                new House("60A", "Truck Lane", "City 60", "State 60", detail60),
                                new House("60B", "LogiZone", "City 60", "State 60", detail60)
                        }),
                new Owner("Owner B 60", "9405836060", "ownerb60@mail.com", "City 60",
                        new House[]{
                                new House("60C", "Cargo Rd", "City 60", "State 60", detail60),
                                new House("60D", "Depot Street", "City 60", "State 60", detail60)
                        })
        };
        Company company60 = new Company("FleetLogic", "Transport Hub", "logistics", 1060, owners60);
        Product product60 = new Product("FleetManager", 8960, 459, "logistics", company60);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward61 = new Ward(61, "Ward 61", 9061, "Councilor 61");
        Constituency constituency61 = new Constituency("City 61", "District 61", 890061, "Constituency 61", ward61);
        PrimeMinister primeMinister61 = new PrimeMinister("PM Name 61", "01/02/2028", "Party 61", 61, constituency61);
        Government government61 = new Government("Health Government", "State 61", 2061, "Capital 61", primeMinister61);
        Tax tax61 = new Tax("Health Tax", 0.15, 2028, "Authority 61", government61);
        VariablePay variablePay61 = new VariablePay(8961, "Employee 61", 97000, 125000, tax61);
        Bonus bonus61 = new Bonus("Wellness Bonus", 10600, "01/07/2028", "Public health contribution", variablePay61);
        SalaryExpectation salaryExpected61 = new SalaryExpectation("Candidate 61", "Healthcare", 70361, 9, bonus61);
        List<Criteria> criteria61 = Arrays.asList(
                new Criteria("MBBS degree", "Required", 9, "Reviewer A", salaryExpected61),
                new Criteria("Public health experience", "Preferred", 6, "Reviewer B", salaryExpected61)
        );
        Role role61 = new Role("Medical Officer", "Oversees clinic operations", 85761, 5, criteria61);
        Designation designation61 = new Designation("Chief Medical Officer", "Leads health team", "Health", 89061, role61);
        President president61 = new President("President 61", "Medical Council", 61, "2323616161", designation61);
        University university61 = new University("Health University 61", "City 61", 2041, "Wellness Road", president61);
        Education education61 = new Education("MBBS", "Health University 61", 2041, 9.3, university61);
        List<Experience> experience61 = Arrays.asList(
                new Experience("WHO", "Health Officer", 3, "City 61", education61),
                new Experience("Apollo", "Medical Officer", 4, "City 61", education61)
        );
        Inspector inspector61 = new Inspector("Inspector 61", "Health Inspector", 21, "9999616161", experience61);
        RTO rto61 = new RTO(56761, "City 61", "WB-61", "2323616161", inspector61);
        Registration registration61 = new Registration(89061, "Ambulance", "Dr. Kavita Singh", "Clinic Campus", rto61);
        Vehicle vehicle61 = new Vehicle("WB-61-AMB-8961", "Ambulance", 2028, "Force Motors", registration61);
        Mayor mayor61 = new Mayor("Mayor 61", "Mayor of City 61", 5, "4567616161", vehicle61);
        Information information61 = new Information(7861, "1400 sqr", "https://info/61", "5678961616", mayor61);
        City city61 = new City("City 61", "State 61", 56841, "Zone-61", information61);
        Address address61 = new Address("Clinic Campus", "City 61", "State 61", "India", city61);
        Details detail61 = new Details("Dr. Kavita Singh", "Public Health Expert", "9999616161", 42, address61);
        Owner[] owners61 = {
                new Owner("Owner A 61", "9333366161", "ownera61@mail.com", "City 61",
                        new House[]{
                                new House("61A", "Care Lane", "City 61", "State 61", detail61),
                                new House("61B", "Clinic Road", "City 61", "State 61", detail61)
                        }),
                new Owner("Owner B 61", "9405836161", "ownerb61@mail.com", "City 61",
                        new House[]{
                                new House("61C", "Medic Street", "City 61", "State 61", detail61),
                                new House("61D", "Hospital Blvd", "City 61", "State 61", detail61)
                        })
        };
        Company company61 = new Company("HealthPlus", "Medical Park", "healthcare", 1061, owners61);
        Product product61 = new Product("MediTracker", 8961, 469, "healthtech", company61);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward62 = new Ward(62, "Ward 62", 9062, "Councilor 62");
        Constituency constituency62 = new Constituency("City 62", "District 62", 890062, "Constituency 62", ward62);
        PrimeMinister primeMinister62 = new PrimeMinister("PM Name 62", "02/02/2028", "Party 62", 62, constituency62);
        Government government62 = new Government("Agriculture Government", "State 62", 2062, "Capital 62", primeMinister62);
        Tax tax62 = new Tax("Agri Tax", 0.13, 2028, "Authority 62", government62);
        VariablePay variablePay62 = new VariablePay(8962, "Employee 62", 88000, 110000, tax62);
        Bonus bonus62 = new Bonus("Crop Bonus", 9700, "15/07/2028", "Sustainable farming reward", variablePay62);
        SalaryExpectation salaryExpected62 = new SalaryExpectation("Candidate 62", "Agronomy", 70362, 8, bonus62);
        List<Criteria> criteria62 = Arrays.asList(
                new Criteria("Agriculture degree", "Required", 8, "Reviewer A", salaryExpected62),
                new Criteria("Soil Science", "Preferred", 6, "Reviewer B", salaryExpected62)
        );
        Role role62 = new Role("Agriculture Officer", "Oversees farming practices", 85762, 5, criteria62);
        Designation designation62 = new Designation("Agri Director", "Heads farm dept", "Agriculture", 89062, role62);
        President president62 = new President("President 62", "Agri Board", 62, "2323626262", designation62);
        University university62 = new University("Agri University 62", "City 62", 2042, "Farming Road", president62);
        Education education62 = new Education("MSc Agriculture", "Agri University 62", 2042, 9.0, university62);
        List<Experience> experience62 = Arrays.asList(
                new Experience("ICAR", "Field Officer", 4, "City 62", education62),
                new Experience("Krishi Vigyan Kendra", "Advisor", 3, "City 62", education62)
        );
        Inspector inspector62 = new Inspector("Inspector 62", "Agri Inspector", 19, "9999626262", experience62);
        RTO rto62 = new RTO(56762, "City 62", "WB-62", "2323626262", inspector62);
        Registration registration62 = new Registration(89062, "Tractor", "Ravi Yadav", "Farm Zone", rto62);
        Vehicle vehicle62 = new Vehicle("WB-62-TR-8962", "Tractor", 2028, "Mahindra", registration62);
        Mayor mayor62 = new Mayor("Mayor 62", "Mayor of City 62", 5, "4567626262", vehicle62);
        Information information62 = new Information(7862, "1500 sqr", "https://info/62", "5678962626", mayor62);
        City city62 = new City("City 62", "State 62", 56842, "Zone-62", information62);
        Address address62 = new Address("Farm Zone", "City 62", "State 62", "India", city62);
        Details detail62 = new Details("Ravi Yadav", "Agri Engineer", "9999626262", 37, address62);
        Owner[] owners62 = {
                new Owner("Owner A 62", "9333366262", "ownera62@mail.com", "City 62",
                        new House[]{
                                new House("62A", "Harvest Road", "City 62", "State 62", detail62),
                                new House("62B", "Green Field", "City 62", "State 62", detail62)
                        }),
                new Owner("Owner B 62", "9405836262", "ownerb62@mail.com", "City 62",
                        new House[]{
                                new House("62C", "Irrigation St", "City 62", "State 62", detail62),
                                new House("62D", "Crop Blvd", "City 62", "State 62", detail62)
                        })
        };
        Company company62 = new Company("AgriGrow", "Farming Estate", "agriculture", 1062, owners62);
        Product product62 = new Product("AgriDrone", 8962, 479, "agritech", company62);

//----------------------------------------------------------------------------------------------------------------------------------------------
        Ward ward63 = new Ward(63, "Ward 63", 9063, "Councilor 63");
        Constituency constituency63 = new Constituency("City 63", "District 63", 890063, "Constituency 63", ward63);
        PrimeMinister primeMinister63 = new PrimeMinister("PM Name 63", "03/02/2028", "Party 63", 63, constituency63);
        Government government63 = new Government("Finance Government", "State 63", 2063, "Capital 63", primeMinister63);
        Tax tax63 = new Tax("Wealth Tax", 0.20, 2028, "Authority 63", government63);
        VariablePay variablePay63 = new VariablePay(8963, "Employee 63", 105000, 140000, tax63);
        Bonus bonus63 = new Bonus("Fiscal Bonus", 11500, "28/07/2028", "Tax reform reward", variablePay63);
        SalaryExpectation salaryExpected63 = new SalaryExpectation("Candidate 63", "Finance", 70363, 9, bonus63);
        List<Criteria> criteria63 = Arrays.asList(
                new Criteria("CA degree", "Required", 9, "Reviewer A", salaryExpected63),
                new Criteria("Wealth Management", "Preferred", 7, "Reviewer B", salaryExpected63)
        );
        Role role63 = new Role("Finance Analyst", "Manages budgeting", 85763, 6, criteria63);
        Designation designation63 = new Designation("CFO", "Finance head", "Finance", 89063, role63);
        President president63 = new President("President 63", "Finance Board", 63, "2323636363", designation63);
        University university63 = new University("Finance University 63", "City 63", 2043, "Money Road", president63);
        Education education63 = new Education("Chartered Accountancy", "Finance University 63", 2043, 9.7, university63);
        List<Experience> experience63 = Arrays.asList(
                new Experience("PwC", "Auditor", 4, "City 63", education63),
                new Experience("KPMG", "Finance Advisor", 5, "City 63", education63)
        );
        Inspector inspector63 = new Inspector("Inspector 63", "Finance Inspector", 20, "9999636363", experience63);
        RTO rto63 = new RTO(56763, "City 63", "WB-63", "2323636363", inspector63);
        Registration registration63 = new Registration(89063, "Sedan", "Priya Sharma", "Finance District", rto63);
        Vehicle vehicle63 = new Vehicle("WB-63-SE-8963", "Sedan", 2028, "BMW", registration63);
        Mayor mayor63 = new Mayor("Mayor 63", "Mayor of City 63", 5, "4567636363", vehicle63);
        Information information63 = new Information(7863, "1600 sqr", "https://info/63", "5678963636", mayor63);
        City city63 = new City("City 63", "State 63", 56843, "Zone-63", information63);
        Address address63 = new Address("Finance District", "City 63", "State 63", "India", city63);
        Details detail63 = new Details("Priya Sharma", "Finance Analyst", "9999636363", 39, address63);
        Owner[] owners63 = {
                new Owner("Owner A 63", "9333366363", "ownera63@mail.com", "City 63",
                        new House[]{
                                new House("63A", "Capital Road", "City 63", "State 63", detail63),
                                new House("63B", "Investment Blvd", "City 63", "State 63", detail63)
                        }),
                new Owner("Owner B 63", "9405836363", "ownerb63@mail.com", "City 63",
                        new House[]{
                                new House("63C", "Budget Lane", "City 63", "State 63", detail63),
                                new House("63D", "Profit Street", "City 63", "State 63", detail63)
                        })
        };
        Company company63 = new Company("FinEdge", "Finance Park", "finance", 1063, owners63);
        Product product63 = new Product("WealthTracker", 8963, 489, "fintech", company63);


        Collection<Product> products = Arrays.asList(product1,product2,product3,product4,product5,product6,product7,
                product8,product9,product10,product11,product12,product13,product14,product15,
                product16,product17,product18,product19,product20,product21,product22,product23,
                product24,product25,product26,product27,product28,product29,product30,product31,
                product32,product33,product34,product35,product36,product37,product38,product39,
                product40,product41,product42,product43,product44,product45,product46,product47,
                product48,product49,product50, product51 , product52 , product53 , product54 ,
                product55 , product56 , product57 , product58 , product59 , product60 ,
                product61 , product62 , product63);
//--------------------------------------------------------------------------------------------------------------------------------------------------------



    }



}