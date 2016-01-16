/** 
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

"((()))", "(()())", "(())()", "()(())", "()()()" 
*/
public class Solution {
    public List<String> result = new ArrayList<String>();

	public List<String> generateParenthesis(int n) {
		generate(n, n, "");
		return result;
	}

	public void generate(int left, int right, String s) {
		if (left == 0 && right == 0) {
			result.add(s);
		}
		if (left > 0) {
			generate(left - 1, right, s + "(");
		}
		if (right > 0 && left < right) {
			generate(left, right - 1, s + ")");
		}
	}
}