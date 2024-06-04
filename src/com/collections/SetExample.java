package com.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Below the code for learn the set and
 * implement the code set is very powerful
 * while manipulate the data it inherit the
 * abstract class and Set interface
 *
 * @author Meganathan
 */
public class SetExample {

    public static void main(String[] args) {

        // import the set
        Set<String> set = new HashSet<String>();
        // add the elements into the set
        set.add("dinesh");
        set.add("dinesh");
        set.add("Meganathan");

        set.forEach(System.out::println); // this is for lambda experssion

    }
}
