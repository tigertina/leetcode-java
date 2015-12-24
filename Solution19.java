/**
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = 0;
		ListNode tmp = head;
		while(tmp!=null){
			cnt++;
			tmp = tmp.next;
		}
		int index = cnt-n;
		ListNode fakeHead = new ListNode(-1);
		fakeHead.next = head;
		tmp = fakeHead;
		int i=0;
		while(tmp!=null&&tmp.next!=null){
			if(i==index){
				tmp.next = tmp.next.next;
				break;
			}
			i++;
			tmp = tmp.next;
		}
		return fakeHead.next;
    }
}