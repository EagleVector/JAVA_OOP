package com.cherry.access;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Cherry");
//        System.out.println(obj.num);               Cannot access num variable as it is private.
//        Solution is using a getter.

        System.out.println(obj.getNum());
    }
}
