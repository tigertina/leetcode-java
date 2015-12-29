/**
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        /*if(nums.length == 0||nums[0]==target||target<nums[0])
			return 0;
		
		int res = 1;
		int i ;
		for(i = 1;i<nums.length;i++){
			if(target == nums[i]){
				res = i;
				break;
			}
			if(nums[i-1]<target&&target<nums[i]){
				res = i;
				break;
			}
		}
		if(i==nums.length){
		    res = nums.length;
		}
		return res;*/
		if (nums.length == 0 || target == 0)
			return 0;
		int left = 0, right = nums.length - 1, mid = 0;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (target == nums[mid])
				return mid;
			else if (target < nums[mid]) {
				right = mid - 1;
			} else
				left = mid + 1;
		}
		return left;
    }
}