package com.cherry.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(26);
        Daughter daughter = new Daughter(20);
        son.career();
        daughter.partner();

        Parent.message("Cherry");
        son.normalmethod();
    }
}
