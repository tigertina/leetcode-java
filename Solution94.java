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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode tmp = root;
        do{
        	while(tmp!=null){
        		stack.push(tmp);
        		tmp = tmp.left;
        	}
        	if(!stack.isEmpty()){
        		tmp = stack.pop();
        		res.add(tmp.val);
        		tmp = tmp.right;
        	}
        }while(!stack.isEmpty()||tmp!=null);
        return res; 
    }
}