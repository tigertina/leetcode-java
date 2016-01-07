/**
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem. 
*/
public class Solution {
    public void sortColors(int[] nums) {
        int i = -1;
        int j = -1;
        int k = -1;
        for(int p = 0; p < nums.length; p ++)
        {
            
            if(nums[p] == 0)
            {
                nums[++k] = 2;    //2往后挪
                nums[++j] = 1;    //1往后挪
                nums[++i] = 0;    //0往后挪
            }
            else if(nums[p] == 1)
            {
                nums[++k] = 2;
                nums[++j] = 1;
            }
            else
                nums[++k] = 2;
        }

    }
}