package com.OOPS;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;

        // Wrapper Class. Num has now multiple functionalities.
//        Integer num = 45;

//        int b = 20;

//        swapaandb(a, b);
        // It will not swap it because in java we only have pass by value.
//        System.out.println(a + " " + b);
//        Lets pass the reference variables now using the wrapper classes.
//        Integer num1 = 10;
//        Integer num2 = 20;
//        swapnum1num2(num1, num2);
//        System.out.println(num1 + " " + num2);
//        final int hike = 2;
//        hike = 5;  Cannot be done as hike is fixed using final keyword. Always initialize while declaring.

//  Still it is not swapping the reason being Integer class is a final class.
        final A cherry = new A("Shubham Kashyap");
        cherry.name = "EagleVector";
//        This is possible.

//        cherry = new A("EagleVector"); This is not possible.

    }

//    static void swapnum1num2(Integer num1, Integer num2) {
//        Integer temp = num1;
//        num1 = num2;
//        num2 = temp;
//    }

//    static void swapaandb(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }
}
