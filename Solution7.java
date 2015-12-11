/**
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321   */
public class Solution {
    public int reverse(int x) {
      boolean postive = x>=0;
		int sum = 0;
		while(x!=0){
			int digit = x%10;
			if(postive&&sum>Integer.MAX_VALUE/10){
				return 0;
			}
			if(!postive&&sum<Integer.MIN_VALUE/10)
				return 0;
			sum = sum*10+digit;
			x/=10;
		}
		return sum;
    }
}