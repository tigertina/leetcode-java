/**
Reverse a singly linked list.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        /*递归
		if(head==null||head.next ==null)
			return head;
		ListNode prev = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return prev;*/
		//非递归
		ListNode prev = null;
		while(head!=null){
			ListNode tmp = head.next;
			head.next = prev;
			prev = head;
			head = tmp;
		}
		return prev;
		
    }
}