/*
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},

   1
    \
     2
    /
   3

return [1,3,2]. 
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
    List<Integer> res = new ArrayList<Integer>();
	public List<Integer> inorderTraversal(TreeNode root) {
		inTraversal(root);
		return res;
	}
	
	public void inTraversal(TreeNode root){
		if(null == root)
			return;
		if(null!=root.left) inTraversal(root.left);
		res.add(root.val);
		if(null!=root.right) inTraversal(root.right);
	}
}