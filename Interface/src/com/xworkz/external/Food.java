package com.xworkz.external;

import com.xworkz.Internal.FoodRule;

public class Food implements FoodRule {

    @Override
    public void noEating() {
        System.out.println("No eating in the food");
    }

    @Override
    public void noWasting() {
        System.out.println("No wasting food in the food");
    }

    @Override
    public void eatComplete() {
        System.out.println("Eat complete in the food");
    }

    @Override
    public void noFakeFood() {
        System.out.println("No fake food in the food");
    }
}
