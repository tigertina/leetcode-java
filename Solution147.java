/**
Sort a linked list using insertion sort.
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
    public ListNode insertionSortList(ListNode head) {
        if(null == head || null == head.next)
    		return head;
    	ListNode cur = head;
    	ListNode helper = new ListNode(-1);
    	ListNode pre;
    	while(null != cur){
    		ListNode next = cur.next;
    		pre = helper;
    		while(pre.next != null && pre.next.val < cur.val){
    			pre = pre.next;
    		}
    		cur.next = pre.next;
    		pre.next = cur;
    		cur = next;
    		
    	}
    	return helper.next;
    }
}