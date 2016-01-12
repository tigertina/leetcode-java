/**
Note: This is an extension of House Robber.

After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
*/
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		// 抢第一家到倒数第二家的最大值
		for (int i = 1; i < nums.length - 1; i++) {
			dp[i] = Math.max(dp[i - 1], (i == 1 ? 0 : dp[i - 2]) + nums[i]);
		}
		int res = dp[nums.length - 2];
		// 抢第二家到最后一家的最大值
		dp = new int[nums.length];
		dp[1] = nums[1];
		for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
		}
		return Math.max(res, dp[nums.length - 1]);
    }
}