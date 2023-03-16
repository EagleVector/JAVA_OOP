package com.cherry.properties.polymorphism;

public class Square extends Shapes{
    void area () {
        System.out.println("Area of the square is side * side");
    }
    static void peri(int side) {
        double perimeter = 4 * side;
        System.out.println(perimeter);
    }
}
