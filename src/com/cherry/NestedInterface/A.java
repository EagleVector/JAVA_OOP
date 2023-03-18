package com.cherry.NestedInterface;

public class A {
    // nested interface
    // the top-level in the nested interface must be public or default.
    // All the standard stuffs remain the same.
    public interface Nested {
        boolean isOdd(int num);
    }
}

class B implements A.Nested {
    @Override
    public boolean isOdd(int num) {
        return (num & 1 ) == 1;
    }
}