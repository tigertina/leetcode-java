/**
 Given a binary tree

    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

    You may only use constant extra space.
    You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).

For example,
Given the following perfect binary tree,

         1
       /  \
      2    3
     / \  / \
    4  5  6  7

After calling your function, the tree should look like:

         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
You may assume that you have an infinite number of each kind of coin. 
*/
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null)
			return;
		LinkedList<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		queue.add(root);
		int cur = 1;
		int nextLevel = 0;
		ArrayList<TreeLinkNode> tmpList = new ArrayList<TreeLinkNode>();
		while (!queue.isEmpty()) {
			TreeLinkNode tmp = queue.poll();
			cur--;
			if (tmp.left != null) {
				queue.add(tmp.left);
				nextLevel++;
				tmpList.add(tmp.left);
			}
			if (tmp.right != null) {
				queue.add(tmp.right);
				nextLevel++;
				tmpList.add(tmp.right);
			}
			
			if (cur == 0) {
				for(int i = 0 ;i<tmpList.size()-1;i++)
					tmpList.get(i).next = tmpList.get(i+1);
				tmpList = new ArrayList<TreeLinkNode>();
				cur = nextLevel;
				nextLevel = 0;
			}

		}
    }
}