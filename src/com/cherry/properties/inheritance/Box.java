package com.cherry.properties.inheritance;

// Every class that we create has an object class as its parent class.
public class Box {

// We have the box which has length, width and height.

    double l;
    double h;
    double w;

// We define the constructor in this way.
    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    // cube
    Box (double side) {

//        super(); Object class

        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

// The object of new box over here will copy all the properties from the prev object old.
    Box (Box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void information() {
        System.out.println("Running the box");
    }
}