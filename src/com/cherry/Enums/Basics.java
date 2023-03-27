package com.cherry.Enums;
// Enums can implement as many interfaces as we want.

public class Basics {

    enum Week implements A{

        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are enum constants.
        // public static and final.
        // Child class of enums can not be created.
        // Type is Week.

        @Override
        public void hello(String name) {
            System.out.println("Hi There " + name + "!");
        }
        Week() {
            System.out.println("Constructor called for " + this.toString());
        }
        // This is not public or protected.
        // Only private or default.
//        why? we don't want to  create new objects.
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }
        System.out.println(week);

//        Ordinal tells us the position of the enum

        System.out.println(week.ordinal());
        week.hello("Cherry");
    }
}
