package com.problems.easy;

/**
 * Print the pattern below using any loop. The number of rows should be obtained
 * from the user while running the program. The below is an example for user
 * input of 5.
 * 
 * 
 * *
 * * *
 * * * *
 * * * * *
 */
public class PatternPrinting {

    // // Create a static method
    // public static String printingPattern() {

    // // loop for print the pattern
    // String patternStar = "";

    // }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // String star = "";
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            // System.out.println(star);
        }

    }

}
