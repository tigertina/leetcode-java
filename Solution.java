/**
*Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
For example,
Given "egg", "add", return true.
Given "foo", "bar", return false.
Given "paper", "title", return true.
*/
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] s_array=s.toCharArray();
		  char[] t_array=t.toCharArray();
		HashMap sm = new HashMap();
		HashMap tm = new HashMap();
		boolean flag = true;
		for(int i =0;i<s.length();i++){
			if (sm.put(s_array[i],s_array[i])!=tm.put(t_array[i],s_array[i])){
				flag = false;
				break;				
			}				
		}
		return flag;
    }
}