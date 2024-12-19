package com.problems.easy.Arrays;

import java.util.*;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};


        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    //    Create a static method
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Validation
        if (arr1.length == 0 || arr2.length == 0) {
            return new int[0];
        }

        // Step 1: Create a list to store the elements in arr1
        List<Integer> arr = new ArrayList<>();
        for (int num : arr1) {
            arr.add(num);
        }


        Set<Integer> arr2Set = new HashSet<>();
        for (int num : arr2) {
            arr2Set.add(num);
        }

        List<Integer> distinctEle = new ArrayList<>();

        List<Integer> remaining = new ArrayList<>();
        for (int num : arr) {
            if (arr2Set.contains(num)) {
                distinctEle.add(num);
            } else {
                remaining.add(num);
            }
        }

        Collections.sort(remaining);
        distinctEle.addAll(remaining);

        return distinctEle.stream().mapToInt(Integer::intValue).toArray();
    }

}
