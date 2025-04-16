package com.xworkz.classchaining;

public class PrimeMinister {
    Personal pe1;


    Personal pe2 = new Personal("Bittu",
            new Skills("Counting",
                    new Experience[]{new Experience(new ExperienceDetails(
                            new Company("L&T", "USA"),
                            "Accountant", 2,
                            new Education[]{new Education("MBA", "IIT")},
                            new House(new Portfolio[]{new Portfolio(new Detail(29, "Febraury", 2002), "Male", 9846792963L)}, "Mannat",
                                    new HouseKeeping[]{new HouseKeeping("Ashu",
                                            new Transport("Bus"))}, new Room[]{new Room("AC", 4001),
                                    new Room("Ward room", 141)})
                    ))}), new State(
            "Karnataka", new District[]{new District("Dakshnina Kannada", new City[]{
            new City("Mangalore", new Ward[]{new Ward(10), new Ward(11)}),
            new City("Bangalore", new Ward[]{new Ward(101), new Ward(102)})})
    }));


    PersonalAssistent[] p1 = new PersonalAssistent[]{
            new PersonalAssistent("John", 23, 50000, 5, new Security(4001, pe1))
    };
    PersonalAssistent[] p2 = new PersonalAssistent[]{
            new PersonalAssistent("Rahul", 25, 50000, 5, new Security(5001, pe2))
    };


    Minister min1 = new Minister("Niramala", "Tamilnadu",
            "FinanceMInister", 500000, p1);

    Minister min2 = new Minister("Siddaramaih", "Karnataka", "Cheif Minister", 100000, p2);

    Minister[] min = {min1, min2};


    String pmNAme = "Narendra Modi";
    String party = "BJP";
    int age = 75;
    float salary = 1.2f;

    public PrimeMinister() {
        pe1 = new Personal("Kittu",
                new Skills("Java",
                        new Experience[]{new Experience(new ExperienceDetails(
                                new Company("Winsoft", "Banglore"),
                                "Coder", 4,
                                new Education[]{new Education("Engineering", "Vtu")},
                                new House(new Portfolio[]{new Portfolio(new Detail(04, "March", 2003), "Male", 7902837148L)}, "Antellia",
                                        new HouseKeeping[]{new HouseKeeping("Das",
                                                new Transport("Van"))}, new Room[]{new Room("AC", 4001),
                                        new Room("NON AC", 1001)})
                        ))}), new State(
                "Tamilnaadu", new District[]{new District("Thanjavur", new City[]{
                new City("Kandiyor", new Ward[]{new Ward(9), new Ward(1)}),
                new City("Ambapetti", new Ward[]{new Ward(11), new Ward(2)})})
        }));
    }


    void pmDisplay() {
        System.out.println("PM name " + pmNAme);
        System.out.println("PM party " + party);
        System.out.println("PM age " + age);
        System.out.println("PM salary " + salary);
        System.out.println("================================================");
        for (Minister ref : min) {
            if (ref != null) {
                ref.ministerDisplay();
            } else System.err.println("Pointing to null");
        }
    }
}

