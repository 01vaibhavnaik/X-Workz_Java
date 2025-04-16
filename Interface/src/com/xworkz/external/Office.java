package com.xworkz.external;

import com.xworkz.Internal.OfficeRule;

public class Office implements OfficeRule {

    @Override
    public void toWorkWithTeam() {
        System.out.println("Working with team is important in office");
    }

    @Override
    public void toBePunctual() {
        System.out.println("Being punctual is important in office");
    }

    @Override
    public void toBeHonest() {
        System.out.println("Being honest is important in office");
    }
}
