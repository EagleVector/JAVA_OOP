package com.cherry.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            System.out.println(divide(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  finally {
            System.out.println("This is always gonna print no matter what");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Please enter a number another than 0");
        }
        return a / b;
    }
}
