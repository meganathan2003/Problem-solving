package com.problems.easy.Arrays;

import java.util.Arrays;

public class FindThirdLargestElement {

    // Create a static method
    public static int findThirdLargestElement(int[] arr) {

        // Validation
        if (arr.length < 3) {
            return -1;
        }

        // sort the array and
        Arrays.sort(arr);

        int count = 0;
        int maxNum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > maxNum) {
                maxNum = arr[i];
                count++;
                if (count == 2) {
                    return maxNum;
                }
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 5};
        System.out.println(findThirdLargestElement(arr));
    }
}
