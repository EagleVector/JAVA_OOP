package com.cherry.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

// Actual arraylist can store int, string, bool, float etc.
//        ArrayList list = new ArrayList();
//        list.add(90);
//        list.add("Sunny");
//        list.add(56.90);
//        System.out.println(list);
//        list.get(1);
//        list.remove(0);
//        list.set(0, 90.98674);
//        System.out.println(list);
//        System.out.println(list.isEmpty());

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    
    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // Copy the current items in the new array.
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int replacement) {
        data[index] = replacement;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        // The Custom array list that we have created can only store integers.
        CustomArrayList list = new CustomArrayList();
//        list.add(9);
//        list.add(5);
//        list.add(3);

        for (int i = 0; i < 15; i++) {
            list.add(i);
        }

        System.out.println(list);

//        GENERICS
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
//        list2.add("ghjk");
//        <Integer> --> Generics. We can only add classes in generics.
//        Parameterized input is very important --> For Type Safety (valid inputs)
//        We want to use our Custom Array List to store string, float, bool, double etc.
//        For that we use generics.

    }
}
