/**
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:

    pattern = "abba", str = "dog cat cat dog" should return true.
    pattern = "abba", str = "dog cat cat fish" should return false.
    pattern = "aaaa", str = "dog cat cat dog" should return false.
    pattern = "abba", str = "dog dog dog dog" should return false.

Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space. 
*/
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] s_array=pattern.toCharArray();
		String[] t_array=str.split(" ");
		if(s_array.length!=t_array.length)
		    return false;
		HashMap sm = new HashMap();
		HashMap tm = new HashMap();
		boolean flag = true;
		for(int i =0;i<s_array.length;i++){
			if (sm.put(s_array[i],s_array[i])!=tm.put(t_array[i],s_array[i])){
				flag = false;
				break;				
			}				
		}
		return flag;
    }
}