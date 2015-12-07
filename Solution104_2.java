/**
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
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
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        
        int level = 0;
		LinkedList queue = new LinkedList();
		queue.add(root);
		int curNum = 1;
		int nextNum = 0;
		while(!queue.isEmpty()){
			TreeNode n = (TreeNode) queue.poll();
			curNum --;
			if(n.left!=null){
				queue.add(n.left);
				nextNum++;
			}
			if(n.right!=null){
				queue.add(n.right);
				nextNum++;
			}
			if(curNum==0){
				curNum = nextNum;
				nextNum = 0;
				level++;
			}
				
		}
		return level;
		
    }
}