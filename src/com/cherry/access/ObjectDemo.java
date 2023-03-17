package com.cherry.access;

public class ObjectDemo {

    int num;


    public ObjectDemo(int num) {
        this.num = num;
    }

// Hashcode gives a unique identification number to an object.
// It's just a random number not an address.
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
//        ObjectDemo obj = new ObjectDemo(25);
//        ObjectDemo obj2 = obj;
//
//        if (obj == obj2) {
//            System.out.println("obj is equal to obj2");
//        }
//
//        if (obj.equals(obj2)) {
//            System.out.println("obj is equal to obj2");
//        }



// Same address

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }
}
