package com.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap is the implementation of Map,
 * but it doesn't maintain any order.
 * A Map doesn't allow duplicate keys,
 * but you can have duplicate values.
 * HashMap and LinkedHashMap allow null keys and values,
 * but TreeMap doesn't allow any null key or value.
 */

public class HashMapExample {

    public static void main(String[] args) {

        // create a map without Generic
        Map map = new HashMap();
        map.put(1, "dinesh"); // here map we can use put method for add the element

        System.out.println(map); // output is object {1= dinesh}

    }
}
