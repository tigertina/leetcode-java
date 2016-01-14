/**
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
			return head;
		int len = 1;
		ListNode last = head;
		while (last.next != null) {
			last = last.next;
			len++;
		}
	
		k = k%len;
		if(k == 0)
		    return head;
		ListNode tmp = head;
		for(int i = 0; i< len-k-1;i++){
			head = head.next;
		}
		System.out.print(head.val);
		ListNode res = head.next;
		head.next = null;
		last.next = tmp;
		return res;
    }
}