/**
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].
*/
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex +=1;
        Integer[] arr = new Integer[rowIndex];
		for(int j = 0;j<rowIndex;j++)
			arr[j] = 0;
		for(int i = 0; i < rowIndex; i++){
            for(int j = i;j>=1;j--){
                arr[j] = arr[j-1]+arr[j];
            }
            arr[i] = 1;   
        }
		return Arrays.asList(arr);
    }
}