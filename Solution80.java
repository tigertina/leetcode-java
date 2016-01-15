/**
 Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length. 
*/
public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = 0;
		
		for (int i = 0; i < nums.length; i++) {
			int cur = nums[i];
			
			int times = 1;
			while (i + 1 < nums.length && cur == nums[i + 1]) {
				times++;
				i++;
			}
			times = times < 2 ?times:2;
			len += times;
			for(int j = len-1;j>=len-times;j--){
				nums[j] = cur;
			}
		}
		return len;
    }
}