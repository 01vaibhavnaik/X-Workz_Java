package com.xworkz.Internal;

public interface ChildrenRule {


    void toLoveChildren();

    void toPlayWithChildren();

    void toTeachChildren();

    default void noFakeChildren() {
        System.out.println("No Fake Children");
    }
}
