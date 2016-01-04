/**
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
 */
public class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n == 0)
            return 0;
        int left = 0 , right = n-1;
        while(nums[left] > nums[right]){
            int mid = left + (right - left)/2;
            if(nums[left] <= nums[mid])
                left = mid+1;
            else 
                right = mid;
        }
        return nums[left];
    }
}