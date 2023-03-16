package com.cherry.properties.polymorphism;

// Run-time polymorphism or Dynamic polymorphism --> Achieved via method overriding.
// Method overriding --> When the method name, return type, arguments are same in both parent and child class and child class overrides the parent class.
// We use the @override annotation here.
// We cannot override the methods that are 'final'
// 'final' also prevents from inheriting.
// Overriding depends on objects.
// Static method do not depend on objects.
// Hence static methods can not be overridden However they can be inherited.

public class Circle extends Shapes{
    @Override
    void area () {
        System.out.println("Area of the circle is pi * rad * rad");
    }

    static void peri(int rad) {
        double perimeter = 2 * 3.142 * rad;
        System.out.println(perimeter);
    }
}
