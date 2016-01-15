/**
 Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(null == head || null == head.next)
			return;
		ListNode fast;		
		ListNode slow;
		ListNode tmp = head;
		fast = slow = head;
		while(fast != null && fast.next != null){
		    tmp = slow;
			fast = fast.next.next;
			slow = slow.next;
		}
		if (null != fast) {
			// 链表元素奇数个
			
			slow = reverseList(slow.next);
		
			tmp.next.next = null;
		} else {
			// 链表元素偶数个
			slow = reverseList(slow);
			tmp.next = null;
		}
		
		merger(head,slow);
    }

    public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = prev;
			prev = head;
			head = tmp;
		}
		return prev;
	}

    public ListNode merger(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head = new ListNode(-1);
		ListNode fake = head;
		int i = 0;
		while (l1 != null && l2 != null) {
			if (i%2==0) {
				head.next = l1;
				head = head.next;
				l1 = l1.next;
			} else {
				head.next = l2;
				head = head.next;
				l2 = l2.next;
			}
			i++;
		}
		head.next = l1 != null? l1:l2;
		return fake.next;
	}
}