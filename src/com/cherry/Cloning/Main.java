package com.cherry.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Cherry = new Human(26, "Shubham Kashyap");

//        This is also one of the way of object cloning, but it is not the optimized way.
//        This is taking a lot of processing time.

//        Human Billi = new Human(Cherry);
//        System.out.println(Billi.age);
//        System.out.println(Billi.name);
//        Clone copies Cherry to twin.
//        It's a faster way to copy.
//        Used to clone bigger objects.
//        It's doing shallow copy of objects.

        Human twin = (Human)Cherry.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

//        twin.arr[0] = 100;
//        System.out.println(Arrays.toString(twin.arr));

//        The change made in twin is reflected in the cherry as well.
//        This is called shallow copying.
//        Primitives will not change but non primitives will change and will be reflected back.

//        System.out.println(Arrays.toString(Cherry.arr));
//        Deep Copy.
//        It is not pointing to the same array in Cherry.

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(Cherry.arr));
    }
}
