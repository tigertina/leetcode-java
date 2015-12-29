/**
Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

Example 1:
Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
Return 16
The two words can be "abcw", "xtfn".

Example 2:
Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
Return 4
The two words can be "ab", "cd".

Example 3:
Given ["a", "aa", "aaa", "aaaa"]
Return 0
No such pair of words.

*/
public class Solution {
    public int maxProduct(String[] words) {
        /*int res = 0;
		int[] letter = new int[26];
		for(int i = 0;i<words.length;i++){
			String str = words[i];
			letter = new int[26];
			for(int k = 0;k<str.length();k++)
				letter[str.charAt(k)-'a']=1;
			for(int j = i+1;j<words.length;j++){
				String tmp = words[j];
				int m ;
				for(m = 0;m<tmp.length();m++){
					if(letter[tmp.charAt(m)-'a']!=0)
						break;
				}
				if(m==tmp.length()){
					int tmpRes = tmp.length()*str.length();
					if(tmpRes>res)
						res = tmpRes;
				}
			}
		}
		return res;*/
		//将单词按照长度从长到短排序
		Arrays.sort(words,new Comparator<String>() {
			public int compare(String s1,String s2) {
				return s2.length()-s1.length();
			}
		});
		int[] maps = new int[words.length];
		for(int i = 0;i<words.length;i++){
			int bits = 0;
			for(int j = 0;j<words[i].length();j++){
				char c = words[i].charAt(j);
				bits = bits | (1<<c-'a');
			}
			maps[i] = bits;
		}
		int res = 0;
		for(int i = 0;i<words.length;i++){
			// 提前结束，没必要继续loop
			if(words[i].length()*words[i].length()<=res)
				break;
			for(int j = i+1;j<words.length;j++){
				if((maps[i]&maps[j])==0){
					res = Math.max(res, words[i].length()*words[j].length());
					// 下面的结果只会更小，没必要继续loop
					break;
				}
			}
		}
		return res;
    }
}