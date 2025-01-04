package com.problems.easy.Strings;

import java.util.Stack;

public class ValidParentheses {

    // Create a static method
    public static boolean isValid(String s) {

        // Create a stack
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Check the opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || !stack.isEmpty() || stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' || !stack.isEmpty() || stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' || !stack.isEmpty() || stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {


        String s = "([{])";

        System.out.println(isValid(s));

    }
}
