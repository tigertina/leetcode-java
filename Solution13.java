/**
Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.
计数规则：
相同的数字连写，所表示的数等于这些数字相加得到的数，例如：III = 3
小的数字在大的数字右边，所表示的数等于这些数字相加得到的数，例如：VIII = 8
小的数字，限于（I、X和C）在大的数字左边，所表示的数等于大数减去小数所得的数，例如：IV = 4
正常使用时，连续的数字重复不得超过三次
在一个数的上面画横线，表示这个数扩大1000倍（本题只考虑3999以内的数，所以用不到这条规则）

其次，罗马数字转阿拉伯数字规则（仅限于3999以内）：

从前向后遍历罗马数字，如果某个数比前一个数小，则加上该数。反之，减去前一个数的两倍然后加上该数

 */
public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
	    m.put('I', 1);
	    m.put('V', 5);
	    m.put('X', 10);
	    m.put('L', 50);
	    m.put('C', 100);
	    m.put('D', 500);
	    m.put('M', 1000);
	   
	    int res = m.get(s.charAt(0));
	    for(int i=1;i<s.length();i++){
	    	int pre = m.get(s.charAt(i-1));
	    	int cur = m.get(s.charAt(i));
	    	if(cur<=pre){
	    		res+=cur;
	    	}else{
	    		res = res-pre*2+cur;
	    	}
	    }
	    return res;
    }
}