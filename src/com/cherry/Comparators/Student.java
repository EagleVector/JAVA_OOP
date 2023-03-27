package com.cherry.Comparators;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

//    It's very important to define compareTo method so that it has a reference to compare the 2 objects.

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);

        // Here if the diff is greater than 0, this > o else o > this
        return diff;
    }
}
