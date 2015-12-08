/**
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fakeHead = new ListNode(-1);
		
		ListNode tmp = fakeHead;
		while(head!=null){
			tmp.next = head;
			head = head.next;
			//直至一个新节点
			while(head!=null&&(head.val==tmp.next.val)){
				head = head.next;
			}
			tmp = tmp.next;
			//处理尾部重复
			tmp.next = null;
		}
		return fakeHead.next;
    }
}
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fakeHead = new ListNode(-1);
		
		ListNode tmp = fakeHead;
		while(head!=null){
			tmp.next = head;
			head = head.next;
			//直至一个新节点
			while(head!=null&&(head.val==tmp.next.val)){
				head = head.next;
			}
			tmp = tmp.next;
			//处理尾部重复
			tmp.next = null;
		}
		return fakeHead.next;
    }
}