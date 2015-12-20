/**
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

*/
public class Solution {
    public void rotate(int[] nums, int k) {     
        int len = nums.length;
        k = k%len;
        if(len==1||k==0)
        	return;
        reverse(nums,0,len-k-1);
        reverse(nums, len-k, len-1);
        reverse(nums, 0, len-1);
    }
	
	public void reverse(int[] nums,int i ,int j){
		while(i<j&&i>=0){
			nums[i] = nums[i]^nums[j];
			nums[j] = nums[i]^nums[j];
			nums[i] = nums[i]^nums[j];
			i++;
			j--;
		}
	}
}