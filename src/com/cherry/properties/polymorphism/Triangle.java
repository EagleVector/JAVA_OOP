package com.cherry.properties.polymorphism;

public class Triangle extends Shapes{
    void area() {
        System.out.println("Area of triangle is 0.5 * base * height");
    }
    static void peri(int a, int b, int c) {
        double perimeter = a + b + c;
        System.out.println(perimeter);
    }
}
