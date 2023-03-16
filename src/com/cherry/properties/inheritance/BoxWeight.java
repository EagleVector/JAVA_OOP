package com.cherry.properties.inheritance;

// Single Inheritance --> One class inherits another class.

public class BoxWeight extends Box{

// We are inheriting the Box class into this child class BoxWeight.
// Where all the properties of Box are inherited and child class BoxWeight has its own property weight.
    double weight;

    BoxWeight() {
        this.weight = -1.0;
    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);

// Super class has no idea what child class contains.
// It only cares about parent class.
// If super class is not called, default one is called.
// Super class points to the class just above it.
// This will call the parent class constructor.
// It is used to initialise values present in parent class.
// Important: Child can access the properties of a parent class but parent can never access the properties of a child class.
//        System.out.println(super.h);                      Accessing the parent class 'h' variable
        this.weight = weight;
    }
// This is possible to do.
    BoxWeight(BoxWeight boxwobj) {
        super(boxwobj);
        boxwobj.weight = weight;

    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
