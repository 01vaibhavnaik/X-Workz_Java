package com.xworkz.Internal;

public interface OfficeRule {


        void toWorkWithTeam();

        void toBePunctual();

        void toBeHonest();





        default void noFakeOffice() {
            System.out.println("No Fake Office");
        }
}
