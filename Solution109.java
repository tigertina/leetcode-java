/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
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
    public ListNode genCenter(ListNode head) {
		ListNode slow, fast;
		slow = fast = head;
	    ListNode temp= null; // this is pointer to the node which is just before middle node in the linkedlist
		while (fast != null && fast.next != null) {
			temp = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		temp.next = null;
		return slow;
	}
	public TreeNode sortedListToBST(ListNode head) {
		return generateBSTLinked(head);
		/*if (head == null ) return null;
        if (head.next == null) return new TreeNode(head.val);
    
        ListNode slowptr = head;
        ListNode fastptr = head;
        ListNode temp= null; // this is pointer to the node which is just before middle node in the linkedlist
    
        while(fastptr != null && fastptr.next != null) {
            temp = slowptr;
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        temp.next = null;
        TreeNode root = new TreeNode(slowptr.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slowptr.next);
    
        return root;*/
    }
	public TreeNode generateBSTLinked(ListNode head){
		if(null == head)
			return null;
		if(head.next == null)
			return new TreeNode(head.val);
		ListNode mid = genCenter(head);
		TreeNode node = new TreeNode(mid.val);
		node.left = generateBSTLinked(head);
		node.right = generateBSTLinked(mid.next);
		return node;
	}
}