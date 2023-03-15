package com.cherry.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
// Population variable is static --> This means it will remain the same independent of any object.
    static long population;

    Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
// In order to access static variables we have to use class name.
        Human.population += 1;
        Human.welcome();

    }

    static void welcome() {
        System.out.println("Welcome to DisneyLand!");
//        System.out.println(this.age);
// This is also not allowed under a static class.
    }

}
