package com.xworkz.Internal;

public interface BoxingRule {
    void useGuard();
    void useGloves();
    void useShoe();

    default void noFakeBoxing() {
        System.out.println("No Fake Boxing");
    }

}
