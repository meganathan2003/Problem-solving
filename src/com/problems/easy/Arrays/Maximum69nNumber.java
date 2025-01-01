package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximum69nNumber {

    // Create a static method
    public static int maximum69Number(int num) {

        if (num < 0) {
            return 0;
        }

        char[] digits = Integer.toString(num).toCharArray();

        // Replace the first occurrence of '6' with '9'
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break; // Replace only the first '6' and exit
            }
        }

        return Integer.parseInt(new String(digits));
    }


    public static void main(String[] args) {

        int num = 9996;
        System.out.println(maximum69Number(num));
    }
}
