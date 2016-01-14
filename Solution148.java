/**
Sort a linked list in O(n log n) time using constant space complexity.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    	public ListNode sortList(ListNode head) {
		if (null == head || null == head.next)
			return head;
		ListNode center = genCenter(head);
		ListNode next = center.next;
		center.next = null;
		return mergerList(sortList(head), sortList(next));
	}

	public ListNode genCenter(ListNode head) {
		ListNode slow, fast;
		// 快慢指针法，找到链表中心
		slow = fast = head;
		while (fast != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public ListNode mergerList(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head = new ListNode(-1);
		ListNode fake = head;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				head.next = l1;
				head = head.next;
				l1 = l1.next;
			} else {
				head.next = l2;
				head = head.next;
				l2 = l2.next;
			}
		}
		head.next = l1 != null? l1 : l2;
		return fake.next;

	}
}