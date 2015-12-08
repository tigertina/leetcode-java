/**
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        
       /* int l = minDepth(root.left);
        int r = minDepth(root.right);
        if(l==0) return r+1;
        if(r==0) return l+1;
        return l<r?l+1:r+1;*/
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int depth = 1;
		int cur = 1;
		int nextLevel = 0;
		while(!queue.isEmpty()){
			TreeNode tmp = queue.poll();
			cur--;			
			if(tmp.left==null&&tmp.right==null)
				return depth;
			if(tmp.left!=null){
				queue.add(tmp.left);
				nextLevel++;
			}			
			if(tmp.right!=null){
				queue.add(tmp.right);
				nextLevel++;
			}
			if(cur==0){			    
				depth++;
				cur = nextLevel;
				nextLevel=0;
			}
		}
		return depth;
		
    }
}