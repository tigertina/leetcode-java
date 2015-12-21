/**
Write a function to find the longest common prefix string amongst an array of strings.
 * 
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
			return "";
		String prefix = strs[0];
		for(int i = 1;i<strs.length;i++){
			if(prefix.length()==0||strs[i].length()==0)
				return "";
			//int len = Math.min(strs[i].length(), prefix.length());
			int len = strs[i].length() < prefix.length()?strs[i].length():prefix.length() ;
			int k ;
			for(k=0;k<len;k++){
				if(prefix.charAt(k)!=strs[i].charAt(k))
					break;
			}
			prefix = prefix.substring(0,k);
		}
		return prefix;
    }
}