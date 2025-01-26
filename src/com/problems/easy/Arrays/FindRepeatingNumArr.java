package com.problems.easy.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindRepeatingNumArr {

    // Create a static method
    public static int findRepeatingNum(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(map);


        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(findRepeatingNum(arr));
    }
}
