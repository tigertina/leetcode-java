/**
 Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:

    The order of the result is not important. So in the above example, [5, 3] is also correct.
    Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?

*/
public class Solution {
    public int[] singleNumber(int[] nums) {
        int res = 0;
		for(int i = 0;i<nums.length;i++){
			res ^= nums[i];
		}
		int mask = res&(~(res-1));
		int A = 0, B = 0;
		for(int i = 0;i<nums.length;i++){
			if((nums[i]&mask) == 0 ){
				A ^= nums[i];
			}else
				B ^= nums[i];
		}
		int[] result = {A,B};
		return result;
    }  
}