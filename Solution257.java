/**
Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
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
    List<String> list = new ArrayList<String>();
	public List<String> binaryTreePaths(TreeNode root) {
        if(null!=root)
        	findPath(root,String.valueOf(root.val));
        return list;
    }
	public void findPath(TreeNode root,String str){
		if(null==root.left&&null==root.right){
			list.add(str);
		}
		if(null!=root.left) findPath(root.left, str+"->"+root.left.val);
		if(null!=root.right) findPath(root.right, str+"->"+root.right.val);
	}
}