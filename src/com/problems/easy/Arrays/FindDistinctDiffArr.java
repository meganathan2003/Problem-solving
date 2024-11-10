package com.problems.easy.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDistinctDiffArr {

    public static int[] distinctDifferenceArray(int[] nums) {
        if (nums.length == 0) {
            return new int[0];
        }

        Set<Integer> diff = new HashSet<>();
        int[] res = new int[nums.length];

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            diff.add(nums[i]);
            for (int j = i; j < nums.length - 2; j++) {

                count++;

            }
            res[i] = diff.size() - count;
            count = 0;
        }

        return res;

    }

    public static void main(String[] args) {

        int[] nums = { 3, 2, 3, 4, 2 };
        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));
    }
}
