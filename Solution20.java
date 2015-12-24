/**
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * }
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
		for(int i =0;i<s.length();i++){
			char cur = s.charAt(i);
			if(cur == '}'){
				if(!stack.isEmpty()&&stack.peek()=='{'){
					stack.pop();
					continue;
				}
			}
			if(cur==']'){
				if(!stack.isEmpty()&&stack.peek()=='['){
					stack.pop();
					continue;
				}
			}
			if(cur == ')'){
				if(!stack.isEmpty()&&stack.peek()=='('){
					stack.pop();
					continue;
				}
			}
			stack.push(cur);
		}
		return stack.isEmpty();
    }
}