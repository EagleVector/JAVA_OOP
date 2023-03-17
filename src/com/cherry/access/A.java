package com.cherry.access;

public class A {

// 'private' limits the scope of variable inside a class.
// 'private' is for sensitive data.
// It cannot be accessed anywhere else.
    private int num;
// 'public' makes the variable accessible everywhere.
// Within the package or outside the package --> In some different packages.
    public String name;

// If we do not define the access modifier,
// In that case the variable can be accessed anywhere in the package but not outside it.

// Protected --> makes the variable accessible anywhere inside the package or subsequent packages but not outside it.
// Only the subclass can access the protected members in the base class when it is outside.
    int[] arr;

    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
