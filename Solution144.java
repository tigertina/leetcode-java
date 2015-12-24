/**
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},

   1
    \
     2
    /
   3

return [1,2,3]. 
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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		List<Integer> res = new ArrayList<Integer>();
		if (null == root)
			return res;
		while (!stack.isEmpty()) {
			TreeNode tmp = stack.pop();
			if (null != tmp)
				res.add(tmp.val);
			if (tmp.right != null)
				stack.push(tmp.right);
			if (tmp.left != null)
				stack.push(tmp.left);
		}
		return res;
    }
}