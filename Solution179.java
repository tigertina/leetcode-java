/**
Given a list of non negative integers, arrange them such that they form the largest number.

For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.
*/
public class Solution {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0;i<nums.length;i++)
        	strs[i] = String.valueOf(nums[i]);
        Arrays.sort(strs,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				 return (o2 + o1).compareTo(o1 + o2);     
			}
        });
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<nums.length;i++)
        	res.append(strs[i]);
       
        return res.toString().replaceFirst("^0+", "0");
    }
}