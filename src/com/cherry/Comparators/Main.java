package com.cherry.Comparators;

public class Main {
    public static void main(String[] args) {
        Student Cherry = new Student(10, 82.90f);
        Student Sunny = new Student(12, 78.87f);

        if (Cherry.compareTo(Sunny) > 0) {
            System.out.println("Cherry has more marks");
        }
    }
}
