package array;

import defaultpackage.Utils;

/**
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day.
 * 
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * 
 * Return the maximum profit you can achieve from this transaction. If you
 * cannot achieve any profit, return 0.
 * 
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * @author speed
 *
 */
public class BuyAndSellStock121 {

	public static void main(String[] args) {
		int[] input = { 7, 1, 5, 3, 6, 4 };
		int output = 5;
		// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
		// 6-1 = 5.
		// Note that buying on day 2 and selling on day 1 is not allowed because you
		// must buy before you sell.

		Utils.checkResult(maxProfit(input), output);
		
		// Example 2
		int[] input2 = { 7, 6, 4, 3, 1 };
		output = 0;
		// Explanation: In this case, no transactions are done and the max profit = 0.

		Utils.checkResult(maxProfit(input2), output);

	}

	public static int maxProfit(int[] prices) {
		//iterate over array
		int smallestVal = 999999; //Smallest value so far
		int overallProf = 0;
		int profitIfSoldToday = 0;
		
		
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] < smallestVal) {
				smallestVal = prices[i];
				continue;
			}
			profitIfSoldToday = prices[i] - smallestVal;
			if(overallProf < profitIfSoldToday) {
				overallProf = profitIfSoldToday;
			}
		}
		return overallProf;
	}

}
