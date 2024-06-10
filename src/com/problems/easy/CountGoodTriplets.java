package com.problems.easy;

/**
 * Below the code for find the
 * count triplets in the array and
 * return the array
 *
 * @author meganathan
 * Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
 * Output: 4
 */
public class CountGoodTriplets {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {

        int count = 0;
        int n = arr.length;

        // Below the loops for find the good Count
        // TODO: Need to understand the code
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && // 3 - 0
                            Math.abs(arr[j] - arr[k]) <= b && // 0 - 1
                            Math.abs(arr[i] - arr[k]) <= c // 3 - 1
                    ) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // Create a new Array
        int[] arr = {1, 1, 2, 2, 3};
        int a = 0;
        int b = 0;
        int c = 1;

        // Create a new obj
        CountGoodTriplets goodTriplets = new CountGoodTriplets();
        System.out.println(goodTriplets.countGoodTriplets(arr, a, b, c));

    }
}
