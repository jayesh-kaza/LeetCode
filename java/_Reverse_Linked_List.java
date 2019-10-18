
/**
 * Reverse a linked list
 * 
 * @author priyanka.debnath
 *
 */

public class Solution {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		l12.next = l13;
		l11.next = l12;

		ListNode result = reverse(l11);
		System.out.println(result);

	}

	public static ListNode reverse(ListNode node) {
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
