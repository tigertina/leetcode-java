/**
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
		return generateBST(0,nums.length-1,nums);
    }
	
    public TreeNode generateBST(int left,int right,int[] nums){
        if(left>right)
        	return null;
        else{
        	int mid = left+(right-left)/2;
        	TreeNode node = new TreeNode(nums[mid]);
        	node.left = generateBST(left, mid-1, nums);
        	node.right = generateBST(mid+1, right, nums);
        	return node;
        }
    }
}