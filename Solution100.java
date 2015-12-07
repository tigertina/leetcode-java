/**
 Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value. 
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /*if(p==null&&q==null)
        	return true;
        if(p!=null&&q!=null&&p.val==q.val){
        	boolean left = isSameTree(p.left, q.left);
        	boolean right = isSameTree(p.right, q.right);
        	return left&&right;
        }else 
        	return false;*/
        LinkedList<TreeNode> queue1 = new LinkedList<TreeNode>();
		LinkedList<TreeNode> queue2 = new LinkedList<TreeNode>();
        queue1.add(p);
        queue2.add(q);
        while(!queue1.isEmpty()&&!queue2.isEmpty()){
        	TreeNode tmp1 = queue1.poll();
        	TreeNode tmp2 = queue2.poll();
        	if(tmp1==null&&tmp2==null)
        		continue;
        	else if(tmp1==null||tmp2==null)
        		return false;
        	if(tmp1.val==tmp2.val){
        		queue1.add(tmp1.left);
        		queue2.add(tmp2.left);
        		queue1.add(tmp1.right);
        		queue2.add(tmp2.right);        		
        	}else
        		return false;        	
        }
        return queue1.isEmpty()&&queue2.isEmpty();
    }
}