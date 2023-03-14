package OOPS;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[3] = 67;
        numbers[2] = 65;
        numbers[1] = 90;
        numbers[0] = 23;
        numbers[4] = 8;
        System.out.println(Arrays.toString(numbers));

        String[] names = {"Cherry", "Sunny", "Bunny", "Puppy", "Kissie"};
        System.out.println(Arrays.toString(names));
 // Reversing a string program.
        String str = "Give it a try";
        System.out.println(str);
        String[] arr = str.split(" ");
        int start = 0;
        int end = arr.length - 1;
        for (int i = end; i >= start; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}