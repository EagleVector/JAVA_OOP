package com.cherry.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new LinkedList<>();
//
//        list2.add(23);
//        list2.add(12);
//        list2.add(67);
//
//        System.out.println(list2);
//        We can use vector for the same operation.
//        Array Lists are synchronized but Vectors are not Synchronized.
//        Synchronized -> Accessible to multiple threads at the same time.
//        Non- Synchronized -> Accessible to a single thread.

        List<Integer> vector = new Vector<>();

        vector.add(23);
        vector.add(12);
        vector.add(67);

        System.out.println(vector);


    }
}
