/**
 Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed. 
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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
			return head;
		ListNode tmp = new ListNode(-1);
		tmp.next = head;
		ListNode ptr1 = tmp;
		ListNode ptr2 = tmp.next;
		while (null != ptr2 && null != ptr2.next) {
			ListNode next = ptr2.next.next;
			ptr2.next.next = ptr2;
			ptr1.next = ptr2.next;
			ptr2.next = next;
			ptr1 = ptr2;
			ptr2 = next;			
		}
		return tmp.next;
    }
}