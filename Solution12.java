/**
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
 */
public class Solution {
    public String intToRoman(int num) {
        String[][] roman = {  
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},  
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},  
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},  
            {"", "M", "MM", "MMM"}  
        };  
          
        String ret = "";  
        int digit = 0;  
        while (num != 0) {  
            int remain = num % 10;  
            ret = roman[digit][remain] + ret;  
            digit++;  
            num /= 10;  
        }  
          
        return ret;  
    }
}