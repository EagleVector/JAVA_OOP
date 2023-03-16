package com.cherry.properties.inheritance;

// Hierarchical Level interference --> One parent class is inherited by multiple child classes.
// In Java, multiple and hybrid interferences are not possible.
// Achieved by interfaces.
// A class can never inherit itself. A class can never be its own superclass.

public class BoxColor extends BoxWeight{
    String colour;

    BoxColor() {
        super();
        this.colour = "Red";
    }
    BoxColor(double side, double weight, String colour) {
        super(side, weight);
        this.colour = colour;
    }
}
