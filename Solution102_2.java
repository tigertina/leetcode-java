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
    // BFS遍历打印
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		if (root == null)
			return res;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int cur = 1;
		int nextLevel = 0;
		while (!queue.isEmpty()) {
			TreeNode tmp = queue.poll();

			cur--;
			if (tmp.left != null) {
				queue.add(tmp.left);
				nextLevel++;
			}
			if (tmp.right != null) {
				queue.add(tmp.right);
				nextLevel++;
			}
			list.add(tmp.val);
			if (cur == 0) {
				res.add(list);
				list = new ArrayList<Integer>();
				cur = nextLevel;
				nextLevel = 0;
			}

		}
		return res;
	}

}