package com.problems.easy.Strings;

public class ScoreOfString {

    // Create a static method
    public static int scoreOfString(String s) {

//        Validation
        if (s.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            // minus the ascii value
            sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return sum;
    }

    public static void main(String[] args) {

        String s = "hello";

        System.out.println(scoreOfString(s));
    }
}
