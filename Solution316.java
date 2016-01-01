/**
 Given a string which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.

Example:

Given "bcabc"
Return "abc"

Given "cbacdcbc"
Return "acdb" 
*/
public class Solution {
    public String removeDuplicateLetters(String s) {
        if (s == null ||s.length() == 0)
            return s;
            
        // 记录每个字符出现的次数    
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        
        // 找出当前最小字符
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos))
                pos = i;
            
            // 避免无字符可用,也就是说，如果只出现一次，就留下该值，这个时候找到的最小值肯定是在该字符前面
            if (--cnt[s.charAt(i) - 'a'] == 0)
                break;
        }
        
        // 除去字符串中已经append的字符的所有重复值
        return s.charAt(pos) + removeDuplicateLetters(s.substring(pos + 1).replaceAll("" + s.charAt(pos), ""));
    }
}