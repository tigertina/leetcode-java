/**
Reverse a singly linked list.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next ==null)
			return head;
		ListNode prev = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return prev;
    }
}