package com.xworkz.external;

import com.xworkz.Internal.PeopleRule;

public class Person implements PeopleRule {
    @Override
    public void toBeKind() {
        System.out.println("toBeKind");
    }

    @Override
    public void toBeFriendly() {
        System.out.println("toBeFriendly");
    }

    @Override
    public void toBeTrustworthy() {
        System.out.println("toBeTrustworthy");
    }
}
