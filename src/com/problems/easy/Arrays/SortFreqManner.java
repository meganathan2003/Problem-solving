package com.problems.easy.Arrays;

import java.util.*;

public class SortFreqManner {

    public static void main(String[] args) {
        // Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Reading the input size
        int n = sc.nextInt();

        // Reading the array elements
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create a frequency map
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int j : arr) {
            frequencyMap.put(j, frequencyMap.getOrDefault(j, 0) + 1);
        }

        // Sort the array by frequency and value
        Arrays.sort(arr, (a, b) -> {
            int freqA = frequencyMap.get(a); // Frequency of element a
            int freqB = frequencyMap.get(b); // Frequency of element b

            // Compare based on frequency first
            if (freqA != freqB) {
                return freqA - freqB; // Sort by frequency (ascending)
            }
            // If frequencies are equal, sort by value (ascending)
            return a - b;
        });
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(" "); // Add space between numbers
            }
        }
    }
}
