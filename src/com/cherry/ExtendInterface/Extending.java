package com.cherry.ExtendInterface;

public class Extending implements B{
    @Override
    public void fun() {
        System.out.println("I am fun");
    }

    @Override
    public void greet() {
        System.out.println("Hello Peter!");
    }
}
