package com.cherry.singletonn;

// Singleton --> Class in which has only one object/instance.
// We make the constructor private.
public class Singleton {
    private Singleton () {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check whether 1 object only is created or not
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
