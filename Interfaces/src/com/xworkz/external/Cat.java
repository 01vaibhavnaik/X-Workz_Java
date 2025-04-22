package com.xworkz.external;

import com.xworkz.internal.Animal;

public class Cat {
    private Animal animal;

    public Cat(Animal animal) {
        this.animal = animal;
    }

    public void sound() {
        if (animal != null) {
            animal.makeSound();
        } else {
            System.err.println("Null");
        }
    }
}
