/**
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/
public class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> res = new ArrayList<List<Integer>>();
		Integer[] arr = new Integer[numRows];
		for(int j = 0;j<numRows;j++)
			arr[j] = 0;
        for(int i = 0; i < numRows; i++){
            for(int j = i;j>=1;j--){
                arr[j] = arr[j-1]+arr[j];
            }
            arr[i] = 1;
            res.add(Arrays.asList(Arrays.copyOf(arr,i+1)));
            
        }
        return res;
    }
}