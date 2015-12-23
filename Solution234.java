/**
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
			return true;
		ListNode slow, fast;
		//快慢指针法，找到链表中心
		slow = fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (null != fast) {
			//链表元素奇数个
			slow = reverseList(slow.next);
		} else {
			//链表元素偶数个
			slow = reverseList(slow);
		}
		while (null != slow) {
			if (head.val != slow.val)
				return false;
			slow = slow.next;
			head = head.next;
		}
		return true;
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
}