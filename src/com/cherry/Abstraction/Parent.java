package com.cherry.Abstraction;

public abstract class Parent {

    int age;

// Important: We cannot create objects for abstract classes.
// But we can definitely create static methods for abstract classes.

    static void message(String msg) {
        System.out.println("Hi " + msg + "!");
    }

    void normalmethod(){
        System.out.println("hi");
    }
    abstract void career();
    abstract void partner();

}