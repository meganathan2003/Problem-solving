package com.problems.easy.Strings;

public class MaxScoreAfterSplittingString {

    // Create a static method
    public static int maxScore(String s) {
        int leftCount = 0; // To count '0's on the left side
        int rightCount = 0; // To count '1's on the right side
        int n = s.length();

        // Count total number of '1's in the string initially for the right part
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                rightCount++;
            }
        }

        int maxScore = 0;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                leftCount++;
            } else {
                rightCount--;
            }

            maxScore = Math.max(maxScore, leftCount + rightCount);
        }

        return maxScore;

    }

    public static void main(String[] args) {


        String s = "1111";

        System.out.println(maxScore(s));
    }
}
