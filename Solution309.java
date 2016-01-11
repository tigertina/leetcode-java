/**
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:

    You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
    After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)

Example:

prices = [1, 2, 3, 0, 2]
maxProfit = 3
transactions = [buy, sell, cooldown, buy, sell]

*/
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2)
			return 0;
		int[] sell = new int[prices.length];
		int[] buy = new int[prices.length];
		sell[0] = 0;
		buy[0] = -prices[0];
		for (int i = 1; i < prices.length; i++) {
			sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
			if (i >= 2) {
				buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);
			} else {
				buy[i] = Math.max(buy[i - 1], -prices[i]);
			}
		}
		return sell[prices.length - 1];
    }
}