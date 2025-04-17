package com.xworkz.Internal;

public interface RestaurantRule {
    void noUnrulyBehavior();
    void noUnauthorizedAccess();
    void noDamageToProperty();

    default void noFakeFood() {
        System.out.println("No Fake Food");}

}
