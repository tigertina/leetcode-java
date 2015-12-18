/**
Zigzag:即循环对角线结构（

0	 	 	 	8	 	 	 	16	 	 	 
1	 	 	7	9	 	 	15	17	 	 	 
2	 	6	 	10	 	14	 	18	 	 	 
3	5	 	 	11	13	 	 	19	 	 	 
4	 	 	 	12	 	 	 	20	 	 	 
）

 

向下循环:nRows

斜角线循环:nRows-2(减去首尾两个端点)

重复
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

 */
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
			return s;
		StringBuffer[] res = new StringBuffer[numRows];
		for (int i = 0; i < numRows; i++)
			res[i] = new StringBuffer();
		int i = 0;
		int gap = numRows - 2;
		while (i < s.length()) {
			for (int j = 0; i < s.length() && j < numRows; j++) {
				res[j].append(s.charAt(i));
				i++;
			}
			for (int j = gap; i < s.length() && j > 0; j--) {
				res[j].append(s.charAt(i));
				i++;
			}
		}
		StringBuffer resStr = new StringBuffer();
		for (i = 0; i < numRows; i++)
			resStr.append(res[i].toString());
		return resStr.toString();
    }
}