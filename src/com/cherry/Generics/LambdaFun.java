package com.cherry.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFun {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
//        Lambda Function -> A single line function.
//        Item here represents every item in the array list.
//        arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        LambdaFun calc = new LambdaFun();
        System.out.println(calc.operate(3, 4, sum));
        System.out.println(calc.operate(4,5,prod));
    }
    private int operate(int a, int b, Operation oper) {
        return oper.op(a, b);
    }
}

interface Operation {
    int op(int a, int b);
}
