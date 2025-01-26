package com.problems.easy.Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class RotateArrByK {

    // create a static method
    public static int[] rotateArrByK(int[] arr, int k) {

        if (arr.length == 0) {
            return new int[]{};
        }


        for (int i = 1; i <= k; i++) {
            int lastEle = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = lastEle;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9};
        int k = 2;


        System.out.println(Arrays.toString(rotateArrByK(arr, k)));
    }

}
