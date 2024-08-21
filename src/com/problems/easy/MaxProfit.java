package com.problems.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Below the code for find the maxmimum profit in the array list
 *
 * Examples:Input: prices = [3, 4, 7, 9, 2] Output: 6 Explanation: Buy on the
 * first day (price = 3) and sell on the fourth day (price = 9). The profit is 9
 * - 3 = 6.
 *
 */
public class MaxProfit {

    public static int maxProfit(ArrayList<Integer> prices) {

        // Check the validation
        if (prices == null || prices.size() < 2) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // check the minPrice
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            // updated the profit value
            int profit = price - minPrice; //  4 - 3 = 1

            // calculate the max profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        ArrayList<Integer> prices1 = new ArrayList<>(List.of(3, 4, 7, 9, 2));
        ArrayList<Integer> prices2 = new ArrayList<>(List.of(8, 7, 6, 5, 4, 3));

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));

    }

}
