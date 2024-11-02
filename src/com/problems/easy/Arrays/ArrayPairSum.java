package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Given an integer array nums of 2n integers,
 * group these integers into n pairs (a1, b1), (a2, b2),
 * ..., (an, bn) such that the sum of min(ai, bi) for
 * all i is maximized. Return the maximized sum.
 *
 * @author Meganathan
 */
public class ArrayPairSum {

    public static int arrayPairSum(int[] nums) {

        if (nums.length == 0) {
            return 0;

        }
        Arrays.sort(nums); //  sort the array first
        int maximizeParing = 0;

        for (int i = 0; i < nums.length; i += 2) {
            maximizeParing += nums[i];
        }

        return maximizeParing;

    }

    public static void main(String[] args) {

        int[] nums = {6, 2, 6, 5, 1, 2};
        System.out.println(arrayPairSum(nums));

    }
}
