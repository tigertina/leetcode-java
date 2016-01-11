/**
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.
*/
public class Solution {

	public int maxProfit(int[] prices) {
		if (prices.length == 0)
			return 0;
		int[] preProfit = new int[prices.length];
		int[] postProfit = new int[prices.length];
		int res = 0;
		int min = prices[0];
		for (int i = 0; i < prices.length; i++) {
			if (min > prices[i])
				min = prices[i];
			if (prices[i] - min > res) {
				res = prices[i] - min;
			}
			preProfit[i] = res;
		}
		res = 0;
		
		int max = prices[prices.length - 1];
		for (int j = prices.length - 1; j >= 0; j--) {
			if (max < prices[j])
				max = prices[j];
			if (max - prices[j] > res)
				res = max - prices[j];
			postProfit[j] = res;
		}
		
		res = 0;
		for (int i = 0; i < prices.length; i++) {
			if (preProfit[i] + postProfit[i] > res)
				res = preProfit[i] + postProfit[i];
		}
		return res;
	}
}