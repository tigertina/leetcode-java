/**Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
*/
public class Solution {
	// DFS 遍历
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		traverse(res, root, 0);
		return res;
	}

	public void traverse(List<List<Integer>> res, TreeNode root, int level) {
		if (root == null) {
			return;
		}
		if (res.size() > level) {
			res.get(level).add(root.val);
		} else {
			ArrayList list = new ArrayList<Integer>();
			list.add(root.val);
			res.add(list);
		}
		traverse(res, root.left, level + 1);
		traverse(res, root.right, level + 1);
	}
	

}