
/**
 * Reverse a linked list
 * 
 * @author priyanka.debnath
 *
 */

public class Solution {
	public static ListNode reverseList(ListNode node) {
		ListNode prev = null;
		ListNode curr = node;
		ListNode next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

}
