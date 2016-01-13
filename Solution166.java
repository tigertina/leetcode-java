/**
Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

For example,

    Given numerator = 1, denominator = 2, return "0.5".
    Given numerator = 2, denominator = 1, return "2".
    Given numerator = 2, denominator = 3, return "0.(6)".

*/
public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder res = new StringBuilder();
		if (numerator < 0 && denominator > 0 || numerator > 0
				&& denominator < 0) {
			res.append('-');
		}
		long num = Math.abs((long) numerator);
		long den = Math.abs((long) denominator);
		res.append(num / den);
		num = num % den;
		if (num == 0)
			return res.toString();
		else
			res.append('.');
		long result = 0;
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		while (!map.containsKey(num)) {
			map.put(num, res.length());
			result = num * 10 / den;
			num = num * 10 % den;
			if (num != 0 || (num == 0 && !map.containsKey(num)))
				res.append(result);
		}
		if(num!=0){
			res.insert(map.get(num), "(");
			res.append(")");
		}
		return res.toString();
    }
}