/**
 Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT. 
*/
public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0)
			return Integer.MAX_VALUE;
		int sign = 1;
		if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
			sign = -1;
		long dend = Math.abs((long) dividend);
		long visor = Math.abs((long) divisor);
		
		long result = 0;
		while (dend >= visor) {
			long tmp = visor, cnt = 1;
			while (tmp <= dend) {
				tmp <<= 1;
				cnt <<= 1;
			}
			tmp >>= 1;
			cnt >>= 1;
			result += cnt;
			dend -= tmp;
		}
		if(sign<0)
			return (int)(sign*result);
		else 
			if(result>Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			else
				return (int)result;
    }
}