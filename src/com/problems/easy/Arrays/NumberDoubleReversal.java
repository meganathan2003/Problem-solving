package com.problems.easy.Arrays;

public class NumberDoubleReversal {

    // Create a static method
    public static boolean isSameAfterReversals(int num) {
        if (num < -1) {
            return false;
        }

        return num == 0 || num % 10 != 0;

    }

    public static void main(String[] args) {
        int num = 526;
        System.out.println(isSameAfterReversals(num));
    }
}
