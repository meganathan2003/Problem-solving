package com.problems.easy.Arrays;

import java.util.Arrays;

public class SortZerosAndOnes {

    //Create a static method
    public static int[] sortArr(int[] arr) {

        if (arr.length == 0) {
            return new int[]{};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                // Validation for if array is length below 2
                if (arr.length == 2) {

                    // perform the logic
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                } else {
                    for (int k = j + 1; k < arr.length; k++) {

                        if (arr[j] < arr[i]) {

                            int temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                        } else if (arr[k] < arr[j]) {

                            int temp = arr[k];
                            arr[k] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
        }

        return arr;

    }

    public static void main(String[] args) {


        int[] arr = {1, 0, 1, 2, 0, 1};
        System.out.println(Arrays.toString(sortArr(sortArr(arr))));
    }
}
