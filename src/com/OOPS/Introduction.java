package com.OOPS;

import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        numbers[3] = 67;
//        numbers[2] = 65;
//        numbers[1] = 90;
//        numbers[0] = 23;
//        numbers[4] = 8;
//        System.out.println(Arrays.toString(numbers));
//
//        String[] names = {"Cherry", "Sunny", "Bunny", "Puppy", "Kissie"};
//        System.out.println(Arrays.toString(names));
// // Reversing a string program.
//        String str = "Give it a try";
//        System.out.println(str);
//        String[] arr = str.split(" ");
//        int start = 0;
//        int end = arr.length - 1;
//        for (int i = end; i >= start; i--) {
//            System.out.print(arr[i] + " ");
//        }
// Class is a named group of properties and functions. new keyword is used to create new objects. It dynamically allocates memory and returns reference to it.

//        int a = 10;
//        int b = a;
//        System.out.println(a);
//        System.out.println(b);
//        b = 20;
//        System.out.println(a);
//        System.out.println(b);
        Student[] students = new Student[5];

// kunal is the object of class students. Class is a logical construct and object is the physical reality. It occupies the space in memory.
// The dot operator links the object with the instance variables.
// Declaring the object kunal that belongs to class Student.

        Student kunal;
        Student cherry;
        kunal = new Student();
        System.out.println(kunal.name);
    }
}
class Student {

// For every student.

    int rno;
    String name;
    float marks;
}