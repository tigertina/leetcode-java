/**Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5. 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode fakeNode1 = new ListNode(-1);
		fakeNode1.next = head;
		ListNode tmp = fakeNode1;
		ListNode fakeNode2 = new ListNode(-1);
		ListNode tmp2 = fakeNode2;
		while (tmp != null && tmp.next != null) {
			if (tmp.next.val < x) {
				tmp = tmp.next;
			} else {
				tmp2.next = tmp.next;
				tmp2 = tmp2.next;
				tmp.next = tmp.next.next;
			}
		}
		tmp2.next = null;
		tmp.next = fakeNode2.next;
		return fakeNode1.next;
    }
}