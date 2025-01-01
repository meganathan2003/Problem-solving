package com.problems.easy.Arrays;

public class ReverseWordsThree {
    // Create a static method
    public static String reverseWords(String s) {

        if (s.isEmpty()) {
            return "";

        }

        String[] words = s.split(" ");

        // Use a StringBuilder to reverse each word
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }

        // Remove the trailing space at the end and return the result
        return result.toString().trim();


    }

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
