package com.cherry.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(2, 4,6);
//        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);
//        BoxWeight box = new BoxWeight();
//        System.out.println(box.h + " " + box.weight);
//        BoxWeight wbox = new BoxWeight(2, 4, 6, 1);
//        System.out.println(wbox.h + " " + wbox.l + " " + wbox.w + " " + wbox.weight);

//        There are many variables in both parent and child classes.
//        We are given access to the variables that are in the reference type i.e BoxWeight.
//        But here the weight variable is not initialized.
//        Hence we do not have access to the weight variable.

//        Box box5 = new BoxWeight(2, 4, 6, 3);
//        System.out.println(box5.w);
//        System.out.println(box5.weight);  Not able to access it.

//        Now here, when the object itself is of type parent class.
//        We cannot call the constructor that belongs to the child class.
//        That is the reason we cannot do this initialization as well.
//        BoxWeight box6 = new Box(2,4, 6, 1); Not possible
        BoxPrice boxp = new BoxPrice(4, 2, 400);
        System.out.println(boxp.h +" "+ boxp.l+" "+ boxp.w+" "+ boxp.price+" "+ boxp.weight);

        BoxColor boxc = new BoxColor(4, 3, "Green");
        System.out.println(boxc.h + " " + boxc.l + " " + boxc.w + " " + boxc.weight + " " + boxc.colour);
    }
}
