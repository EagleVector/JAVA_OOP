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
//        Reversing a string program.
//        String str = "Give it a try";
//        System.out.println(str);
//        String[] arr = str.split(" ");
//        int start = 0;
//        int end = arr.length - 1;
//        for (int i = end; i >= start; i--) {
//            System.out.print(arr[i] + " ");
//        }
//        Class is a named group of properties and functions. new keyword is used to create new objects. It dynamically allocates memory and returns reference to it.

//        int a = 10;
//        int b = a;
//        System.out.println(a);
//        System.out.println(b);
//        b = 20;
//        System.out.println(a);
//        System.out.println(b);
//        Student[] students = new Student[5];

//        kunal is the object of class students. Class is a logical construct and object is the physical reality. It occupies the space in memory.
//        The dot operator links the object with the instance variables.
//        Declaring the object kunal that belongs to class Student.

//        Student kunal;

//        kunal = new Student();

//        kunal.name = "Kunal";
//        kunal.rno = 14;
//        kunal.marks = 94.98f;
//        kunal.salary = 900000; Cannot be done in java as it is a static language. Can be done in python.

//        System.out.println(kunal.rno);
//        System.out.println(kunal.name);
//        System.out.println(kunal.marks);

//        Lets do it in one shot.
//        Constructor is a special function that runs when you create an object and it allocates some variables.
//        Student cherry = new Student();
//
//        System.out.println(cherry.marks);
//        System.out.println(cherry.rno);
//        System.out.println(cherry.name);
//        kunal.greeting();
//        cherry.greeting();
//        cherry.changename("Shubham Kashyap");
//        cherry.greeting();
//        kunal.changename("Kunal Rocks");
//        kunal.greeting();

//        Student student1 = new Student(14, "Cherry", 65.98f);
//        System.out.println(student1.name);
//        System.out.println(student1.rno);
//        System.out.println(student1.marks);
//
//        Student student2 = new Student();
//        System.out.println(student2.marks);
//        System.out.println(student2.rno);
//        System.out.println(student2.name);
//
//        Student student3 = new Student(34, "Arpit", student1.marks);
//        System.out.println(student3.name);
//        System.out.println(student3.rno);
//        System.out.println(student3.marks);

//        Student random = new Student();
//        System.out.println(random.marks);
//        System.out.println(random.rno);
//        System.out.println(random.name);
        Student one = new Student();
        Student two = one;
        System.out.println(one.name);
        System.out.println(two.name);
        one.name = "Something";
        System.out.println(one.name);
        System.out.println(two.name);
    }
}
class Student {

// For every student.

    int rno;
    String name;

// Default value.
    float marks = 40.00f;

    // We need a way to add the values of the above properties object by object.
    // We need one word to access every object. --> "this" keyword.

//    void greeting() {
//        System.out.println("Hi! Greetings from " + name);
//    }
//
//    void changename(String newname) {
//        name = newname;
//    }

//    Student(int rno, String name, float marks) {
//        this.rno = rno;
//        this.name = name;
//        this.marks = marks;
//    }

// "this" is pointing to the object of the class --> student1.
// Constructor Overloading
//    Student() {
//        this.name = "Sunny";
//        this.rno = 45;
//        this.marks = 40.0f;
//
//    }

    Student() {

        // This is how we call a constructor from another constructor.
        // internally: new Student(13, "default person", 100.0f)
        this (13, "default person", 100.0f);
    }

    Student(int roll, String naam, float score) {
        rno = roll;
        name = naam;
        marks = score;
    }
}