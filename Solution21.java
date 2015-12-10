/**
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
Note that 1 is typically treated as an ugly number.  */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
        	return l2;
        if(l2==null)
        	return l1;
        ListNode head = new ListNode(-1);
        ListNode fake = head;
        while(l1!=null&&l2!=null){
        	if(l1.val<l2.val){
        		head.next = l1;
        		head = head.next;
        		l1 = l1.next;
        	}else{
        		head.next = l2;
        		head = head.next;
        		l2 = l2.next;
        	}
        }
        while(l1!=null){
        	head.next = l1;
        	head = head.next;
    		l1 = l1.next;
        }
        while(l2!=null){
        	head.next = l2;
    		head = head.next;
    		l2 = l2.next;
        }
        return fake.next;
    }
}