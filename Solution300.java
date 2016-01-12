/**
 Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.

Follow up: Could you improve it to O(n log n) time complexity? 
*/
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
			return 0;
		int[] dp = new int[nums.length];
		dp[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			int res = 0;
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i] && res < dp[j])
					res = dp[j];
			}
			dp[i] = res + 1;
		}
		int max = 0;
		for(int i = 0; i < nums.length; i++)
		    if(max < dp[i])
		        max = dp[i];
		return max;
    }
}