/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode fast = head.next, slow = head;

        while(fast != null && fast.next != null){
            if(fast == slow)
                return true;

            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}