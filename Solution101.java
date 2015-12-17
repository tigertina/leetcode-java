/**Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
		if (null == root)
			return true;
		return symmetric(root.left, root.right);
	}

	public boolean symmetric(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return true;
		if (t1 == null && t2 != null || t1 != null && t2 == null)
			return false;
		if (t1.val != t2.val)
			return false;
		return symmetric(t1.left, t2.right) && symmetric(t1.right, t2.left);

	}
}