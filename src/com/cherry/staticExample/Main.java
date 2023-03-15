package com.cherry.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human h1 = new Human(26, "Cherry", 1000, false);
//        Human h2 = new Human(32, "Sunny", 1500, true);
//        Human h3 = new Human(17, "Bunny", 800, false);
//
//        System.out.println(h1.age);
//        System.out.println(h2.name);
//        System.out.println(h2.population);
//        System.out.println(h1.population);
//        System.out.println(Human.population); // Direct accessing the variables without the object declaration.
//        This is the concept of static
//        greeting is under static which do not belong to an object.
//        greeting(); This cannot be performed as main is a static method that is fetching non-static method greeting.

//        Static method can only fetch static data.
//        In the end everything will be running inside main or via main.
//        There are two ways 1.
//        either make the method static
//        or create an object of the non-static method.
//        This is how we do it.
//        Main funn = new Main();
//        funn.fun();
        fun();
        Human.welcome();
    }

    static void fun() {
        System.out.println("Hi! There");
//        greeting(); Not possible to call method that belongs to an object.
//        We want to run the greeting method inside this static fun()
//        so we will be creating an object of the non-static method
        Main obj = new Main();
        obj.greeting();
    }
// We know that something which is not static belongs to an object
    void greeting() {
//        fun();                          // It is possible to call the static method which doesnot belong to any object inside non-static
        System.out.println("Hello World!");
    }

}