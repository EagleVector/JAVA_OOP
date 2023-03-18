package com.cherry.Abstraction;

public class Son extends Parent{

    public Son(int age) {
        this.age = age;
    }

    @Override
    void normalmethod() {
        super.normalmethod();
    }

    @Override
    void career() {
        System.out.println("I want to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Wonder woman and her age is " + age);
    }
}
