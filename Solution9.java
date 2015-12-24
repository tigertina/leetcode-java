/**
Determine whether an integer is a palindrome. Do this without extra space.

click to show spoilers.
Some hints:

Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
			return false;
		if(x<10)
		    return true;
		int mem = 1000000000;
		while(x/mem==0){
			mem = mem/10;
		}
		while(x!=0){
			int first = x /mem;
			int last = x%10;
			if(first!=last)
				return false;
			x = x%mem;
			x = x/10;
			mem = mem/100;
		}
		return true;
    }
}