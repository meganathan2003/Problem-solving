package com.problems.easy.Arrays;

import java.util.Arrays;

public class FindMinAndMax {

    // Create a static method
    public static int[] findMinAndMax(int[] arr) {

        // find the minimum using math
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }

        // this loop for get the max value
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 56, 10000, 16};

        System.out.println(Arrays.toString(findMinAndMax(arr)));
    }
}
