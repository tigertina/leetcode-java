/**
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water. 
*/
public class Solution {
    public int maxArea(int[] height) {
        /*int maxArea = 0;
		for(int i = 0;i<height.length;i++){
			for(int j = i+1;j<height.length;j++){
				int min = Math.min(height[i], height[j]);
				if(height[i]<height[j])
					maxArea = Math.max(maxArea, (j-i)*min);
			}
		}
		return maxArea;*/
		int left = 0;
		int right = height.length-1;
		int maxArea = 0;
		while(left < right){
			if(height[left]<height[right]){
				maxArea = Math.max(maxArea, (right-left)*height[left]);
				left++;
			}else{
				maxArea = Math.max(maxArea, (right-left)*height[right]);
				right--;
			}
		}
		return maxArea;
    }
}