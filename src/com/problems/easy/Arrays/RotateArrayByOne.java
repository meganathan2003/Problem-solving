package com.problems.easy.Arrays;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class RotateArrayByOne {

    // Create a static method
    public static int[] rotateArrByOne(int[] arr) {


        if (arr.length == 0) {
            return new int[]{};
        }

        // create a new array
        int[] res = new int[arr.length];
        res[0] = arr[arr.length - 1];

        // Perform the logic
        for (int i = 0; i < arr.length - 1; i++) {
            res[i + 1] = arr[i];
        }

        return res;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArrByOne(arr)));
    }
}
