package com.xworkz.Internal;

public interface PeopleRule {



    void toBeKind();

    void toBeFriendly();

    void toBeTrustworthy();
    default void noFakePeople() {
        System.out.println("No Fake People");
    }
}
