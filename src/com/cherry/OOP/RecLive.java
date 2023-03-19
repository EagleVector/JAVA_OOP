package com.cherry.OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class RecLive {
    public static void main(String[] args) {
//        printincreasing(7);
//        int[] arr = {1, 2, 2, 5, 1, 5, 1, 5, 6, 1};
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
//        movingzeroes(arr);
//        boolean ans = freqcheck(arr);
//        System.out.println(ans);
//        int[] arr = {-2, 5, -1, 6, 2, 4};
//        System.out.println(maximumelement(arr, 0));
//        String str = "abc";
//        System.out.println(subsequence("", str));
//        int[] arr = {-2, 4, 5, 1, 6};
//        int target = 9;
//        System.out.println(findelement(arr, target, 0));
//        String str = "abc";
//        PrintSSAscii("", str);
//        String str = "abc";
//        PermutationBT(str, 0, str.length() - 1);
//        System.out.println(Robot(0, 0, 3,4));
//        int[][] maze = {
//                {1, 0, 0, 0},
//                {1, 1, 0, 1},
//                {0, 1, 0, 0},
//                {1, 1, 1, 1}
//        };
//
//        int[][] path = new int[maze.length][maze[0].length];
//
//        RatInAMaze(maze, 0, 0, path, 1);
//    }
    }
//
//    public static void RatInAMaze(int[][] maze, int row, int col, int[][] path, int step) {
//        if (row == maze.length - 1 && col == maze[0].length - 1) {
//            path[row][col] = step;
//            for (int i = 0; i < path.length; i++) {
//                int[] arr = path[i];
//                System.out.println(Arrays.toString(arr));
//            }
//            System.out.println();
//            return;
//        }
//
//        if (maze[row][col] == 0) {
//            return;
//        }
//
//        maze[row][col] = 0;
//        path[row][col] = step;
//
//        if (row < maze.length - 1) {
//            RatInAMaze(maze, row + 1, col, path, step);
//        }
//
//        if (col < maze[0].length - 1) {
//            RatInAMaze(maze, row, col + 1, path, step);
//        }
//
//        maze[row][col] = 1;
//        path[row][col] = 0;
//    }
//}

//    public static int Robot(int m, int n, int row, int col) {
//        if (m == row - 1 || n == col - 1) {
//            return 1;
//        }
//
//        int right = Robot(m + 1, n, row, col);
//        int down = Robot(m, n + 1, row, col);
//        return right + down;
//        }
//    }

//    public static void PermutationBT(String str, int start, int end) {
//        if (start == end) {
//            System.out.println(str);
//        }
//        else {
//
//            for (int i = start; i <= end; i++) {
//
//                str = swap(str, start, i);
//                PermutationBT(str, start + 1, end);
//                str = swap(str, start, i);
//            }
//        }
//    }
//    public static String swap(String a, int i, int j) {
//        char[] charArray = a.toCharArray();
//
//        char temp = charArray[i];
//        charArray[i] = charArray[j];
//        charArray[j] = temp;
//
//        return String.valueOf(charArray);
//    }

//    public static void Permutation(String answer, String question) {
//        if (question.isEmpty()) {
//            System.out.println(answer);
//            return;
//        }
//        char ch = question.charAt(0);
//
//        for (int i = 0; i <= answer.length(); i++) {
//            String first = answer.substring(0,i);
//            String second = answer.substring(i,answer.length());
//            Permutation(first + ch + second, question.substring(1));
//        }
//    }

//    private static void PrintSSAscii(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            System.out.println(processed);
//            return;
//        }
//        char ch = unprocessed.charAt(0);
//
//        PrintSSAscii(processed + ch, unprocessed.substring(1));
//        PrintSSAscii(processed, unprocessed.substring(1));
//        PrintSSAscii(processed + (ch + 0), unprocessed.substring(1));
//    }

//    private static int findelement(int[] arr, int target, int index) {
//        if (index == arr.length) {
//            return -1;
//        }
//        if (target == arr[index]) {
//            return index;
//        }
//        return findelement(arr, target, index + 1);
//    }


//    private static ArrayList<String> subsequence(String processed, String unprocessed) {
//        if (unprocessed.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(processed);
//            return list;
//        }
//        char ch = unprocessed.charAt(0);
//
//        ArrayList<String> left = subsequence(processed + ch, unprocessed.substring(1));
//        ArrayList<String> right = subsequence(processed, unprocessed.substring(1));
//
//        left.addAll(right);
//        return left;
//    }


//    public static int maximumelement(int[] arr, int index) {
//        if (index == arr.length - 1) {
//            return arr[index];
//        }
//
//        return Math.max(arr[index], maximumelement(arr, index + 1));
//    }


//    public static boolean freqcheck(int[] arr) {
//        int k = 1000;
//        int[] freq = new int[2 * k + 1];
//
//        for (int i = 0; i < arr.length; i++) {
//            freq[arr[i] + k]++;
//        }
//        Arrays.sort(freq);
//
//        for (int i = 0; i < freq.length - 1; i++) {
//            if (freq[i] != 0 && freq[i] == freq[i + 1]) {
//                return false;
//            }
//        }
//        return true;
//    }


//    public static void movingzeroes(int[] arr) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                list.add(arr[i]);
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                list.add(arr[i]);
//            }
//        }
//        System.out.println(list);
//    }


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