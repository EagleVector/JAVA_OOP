package com.cherry.Generics;

import java.util.Arrays;
import java.util.List;

// Further restrictions on the type checking.

// Here T should either be number or its subclass.
public class WildCard<T extends Number> {

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

//        We are making it a generic class.
//        GENERICS
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add(10);
//        list2.add("ghjk");
//        <Integer> --> Generics. We can only add classes in generics.
//        Parameterized input is very important --> For Type Safety (valid inputs)
//        We want to use our Custom Array List to store string, float, bool, double etc.
//        For that we use generics.


    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCard() {

        this.data = new Object[DEFAULT_SIZE];

    }

    public void getlist(List<? extends Number> list) {
        // do something

        // Here you can only pass Number type
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // Copy the current items in the new array.
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {

        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {

        return size;
    }

    public void set(int index, Object replacement) {

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
        WildCard<String> list = new WildCard();
//        list.add(9);
//        list.add(5);
//        list.add(3);
        list.add("sunny");

        for (int i = 1; i < 15; i++) {
            list.add("A" + i);
        }

        System.out.println(list);

    }
}
