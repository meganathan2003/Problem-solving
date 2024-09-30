package com.problems.easy.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SortFreqManner {

    // create a seprate method
    public static void sortFreqManner(Integer[] arr) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        StringBuilder builder = new StringBuilder();


        for (int j : arr) {
            frequencyMap.put(j, frequencyMap.getOrDefault(j, 0) + 1);
        }

        // add to element in string builder
        Arrays.sort(arr, (a, b) -> {

            System.out.println("Arr" + a);
            System.out.println("Arr" + b);
            int freqA = frequencyMap.get(a); // Frequency of element a
            int freqB = frequencyMap.get(b); // Frequency of element b

            System.out.println("Freq" + freqA);
            System.out.println("Freq" + freqB);
            // Compare based on frequency
            if (freqA == freqB) {
                // If frequencies are equal, compare the values directly (for ascending order)
                return a - b;
            }
            // Otherwise, compare based on frequency (for ascending frequency)
            return freqA - freqB;
        });

        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        // create a new array]\

        Integer[] arr = {1, 1, 3, 2};
        sortFreqManner(arr);


    }
}
