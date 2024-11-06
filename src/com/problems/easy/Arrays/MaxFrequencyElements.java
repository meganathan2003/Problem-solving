package com.problems.easy.Arrays;

import java.util.HashMap;

public class MaxFrequencyElements {

    public static int maxFrequencyElements(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int freqCount = 0;

        HashMap<Integer, Integer> countNum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

        }

    }

    public static void main(String[] args) {

        int[] nums = {19, 19, 19, 20, 19, 8, 19};
        System.out.println(maxFrequencyElements(nums));

    }
}
