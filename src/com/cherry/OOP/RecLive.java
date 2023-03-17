package com.cherry.OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class RecLive {
    public static void main(String[] args) {
//        printincreasing(7);
        int[] arr = {0, 3, 0, 1, 12, 0};
//        System.out.println(Arrays.toString(uniqueoccurence(arr)));
//        System.out.println(freq(arr));
//        System.out.println(freqcount(arr));
//        int[] res = new int[arr.length];
//        int[] result = new int[arr.length];

//        result[0] = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            result[i] = arr[i] + result[i - 1];
//        }
//        System.out.println(Arrays.toString(result));
        movingzeroes(arr);
    }

    public static void movingzeroes(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }


//    public static int[] uniqueoccurence(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length - i - 1; j++) {
//                if (arr[j] >= arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        return arr;
//    }
//
//    static int freq(int[] arr) {
//        int count = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                count++;
//            }
//        }
//        return count;
//    }

//    public static void printincreasing(int n) {
//        if (n == 1) {
//            System.out.println(1);
//            return;
//        }
//        else {
//            printincreasing(n - 1);
//            System.out.println(n);
//        }
//    }



}
