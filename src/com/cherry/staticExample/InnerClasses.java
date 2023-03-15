package com.cherry.staticExample;

// Outside classes cannot be static.
// Because it is not dependent on any other class.
// Inner classes can be static.

public class InnerClasses {

//    class Test { Here it means that Test is dependent on the InnerClass.
//    Static method/variables do not depend on objects.
//    And objects are resolved during run time, so static stuffs have nothing to do during the run time.
//    They are all resolved at compile time.
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Cherry");

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);
    }
}
