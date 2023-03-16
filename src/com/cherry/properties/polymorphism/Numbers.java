package com.cherry.properties.polymorphism;

// Compile-time polymorphism or Static polymorphism --> Achieved via method over loading.
// Method Overloading --> Same names of different methods but data types, return types, arguments, ordering is different.
// At the time of compilation method selection is resolved.
// Example: multiple constructors.

public class Numbers {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(4, 5, 6));
        System.out.println(obj.sum(9.09,8));
    }
}
