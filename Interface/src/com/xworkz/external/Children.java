package com.xworkz.external;

import com.xworkz.Internal.ChildrenRule;

public class Children implements ChildrenRule {

    @Override
    public void toLoveChildren() {
        System.out.println("Loving the children...");
    }

    @Override
    public void toPlayWithChildren() {
        System.out.println("Playing with the children...");
    }

    @Override
    public void toTeachChildren() {
        System.out.println("Teaching the children...");
    }
}
