package com.problems.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NRepeatedElements {

    public static int repeatedNTimes(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();


        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 3};
        System.out.println(repeatedNTimes(nums));

    }
}
