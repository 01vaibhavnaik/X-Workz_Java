package com.xworkz.external;

import com.xworkz.internal.Shape;

public class Rectangle {
    private Shape shape;

    public Rectangle(Shape shape) {
        this.shape = shape;
    }
    public void draw() {
        System.out.println("Drawing a rectangle");
        if (shape != null) {
            this.shape.draw();
        } else {
            System.err.println("Null");
        }
    }
}
