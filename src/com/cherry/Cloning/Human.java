package com.cherry.Cloning;

import java.util.Arrays;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 1, 2, 6, 7, 5};
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
////        This is shallow copy.
//        return super.clone();
//    }
//    We will overcome this by using deep copy.
//    It will create a new object and won't refer to the original one.

    @Override
    public Object clone() throws CloneNotSupportedException{
//        This is shallow copy.
        Human twin = (Human)super.clone();

//        Make a deep copy.
        twin.arr = new int[twin.arr.length]; // creating a new array now.
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
