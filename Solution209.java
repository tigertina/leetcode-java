/**
Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint. 
*/
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int start = 0;
		int end = 0;
		int min = nums.length + 1;
		int sum = 0;
		while(start<nums.length&&end<nums.length){
			while(sum<s&&end<nums.length){
				sum += nums[end++];
 			}
			while(sum>=s && start<=end){
				min = Math.min(min, end-start);
				sum -= nums[start++];
			}
		}
		return min == nums.length + 1 ? 0 : min;
    }
}