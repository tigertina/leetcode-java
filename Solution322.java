/**
 You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:
coins = [1, 2, 5], amount = 11
return 3 (11 = 5 + 5 + 1)

Example 2:
coins = [2], amount = 3
return -1.

Note:
You may assume that you have an infinite number of each kind of coin. 
*/
public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0)
			return 0;
		int res = -1;		
		int[] dp = new int[amount + 1];
		for (int i = 0; i < dp.length; i++)
			dp[i] = Integer.MAX_VALUE-1;
		for (int i = 0; i < coins.length; i++)
			if (coins[i] <= amount)
				dp[coins[i]] = 1;
		for (int i = 0; i < coins.length; i++) {
			int coin = coins[i];
			for (int j = 0; j + coin < dp.length; j++) {
				dp[j + coin] = Math.min(dp[j + coin], dp[j] + 1);
			}
		}
		res = dp[amount] == Integer.MAX_VALUE-1 ? -1 : dp[amount];
		return res;
    }
}