package com.problems.easy.Arrays;

import java.util.Arrays;

public class MissingInArray {

    // Create a static method
    public static int findMissingInArr(int[] arr) {

        if (arr.length == 0) return 0;

        Arrays.sort(arr);

        int num = 1;

        for (int n : arr) {
            if (num != n) {
                break;
            }
            num++;
        }
        return num;

    }

    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(findMissingInArr(arr));
    }
}
