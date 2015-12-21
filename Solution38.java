/**
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.
 * }
 */
public class Solution {
    public String countAndSay(int n) {
        if(n<=0)
        	return "";
        if(n==1)
        	return "1";
        String pre = "1";
        StringBuffer sb = new StringBuffer();
        int ron = 1;
       
        while(ron++<n){
            int cnt = 1;
        	sb.setLength(0);
        	int i ;
        	for( i = 1;i<pre.length();i++){
        		if(pre.charAt(i)== pre.charAt(i-1)){
        			cnt++;
        		}else{
        			sb.append(cnt).append(pre.charAt(i-1));
        			cnt=1;
        		}
        	}
        	sb.append(cnt).append(pre.charAt(i-1));
        	pre = sb.toString();
        }
        return sb.toString();
    }
}