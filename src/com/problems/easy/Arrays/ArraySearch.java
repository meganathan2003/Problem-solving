package com.problems.easy.Arrays;

public class ArraySearch {

    // Create a static method
    public static int arraySearchIndex(int[] arr, int k) {

        if (arr.length == 0) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {

            if (k == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(arraySearchIndex(arr, 2));
    }
}
