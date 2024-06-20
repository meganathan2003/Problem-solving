package com.problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Below the problem for find the
 * destination city in the list of
 * array you will traverse the all cities
 * and return the destination city
 * Each list A and B
 *
 * @author meganathan
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]];
 * Output: "Sao Paulo"
 */
public class DestCity {

    // Create a seperate method
    public String destCity(List<List<String>> paths) {
        // Create a HashMap to store the number of times each city appears as a starting point
        HashMap<String, Integer> cityMap = new HashMap<>();

        // Iterate through each path and populate the HashMap
        for (List<String> path : paths) {
            String start = path.get(0);
            String end = path.get(1);

            // Increment the count for the start city
            cityMap.put(start, cityMap.getOrDefault(start, 0) + 1);

            // Ensure the end city is in the map, but with count 0 if it's not a start city
            cityMap.putIfAbsent(end, 0);
        }

        // If there are no destination return empty string
        return "";
    }

    public static void main(String[] args) {
        // Create a new List
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));

        // Create a new obj
        DestCity destCity = new DestCity();
        System.out.println(destCity.destCity(paths));
    }
}
