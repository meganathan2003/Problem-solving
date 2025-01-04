package com.problems.easy.Strings;

import java.util.*;

public class VowelQueries {
    public static int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int n = words.length;
        int[] prefix = new int[n];

        // Compute the prefix sum
        for (int i = 0; i < n; i++) {
            String word = words[i];
            boolean startsWithVowel = vowels.contains(word.charAt(0));
            boolean endsWithVowel = vowels.contains(word.charAt(word.length() - 1));
            prefix[i] = (i > 0 ? prefix[i - 1] : 0) + (startsWithVowel && endsWithVowel ? 1 : 0);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            ans[i] = prefix[ri] - (li > 0 ? prefix[li - 1] : 0);
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = {{0, 2}, {1, 4}, {1, 1}};
        System.out.println(Arrays.toString(vowelStrings(words, queries)));

        String[] words2 = {"a", "e", "i"};
        int[][] queries2 = {{0, 2}, {0, 1}, {2, 2}};
        System.out.println(Arrays.toString(vowelStrings(words2, queries2)));
    }
}
