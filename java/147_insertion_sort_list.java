public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode pre = dummy;
        ListNode sorted = head; // The last sorted node
        ListNode insert = head.next; //  The node to insert
        
        while(insert != null) {
            
            // if 'insert' >= 'sorted', we simply move forward
            if (insert.val >= sorted.val) {
                sorted = sorted.next;
                insert = sorted.next;
                continue;
            }           
            
            // 'insert' node will be inserted after 'pre'
            while(pre != sorted && pre.next.val < insert.val ) {
                pre = pre.next;
            }
            
            sorted.next = insert.next;
            insert.next = pre.next;
            pre.next = insert;
            
            // reset 'pre' to dummy node
            pre = dummy;
            insert = sorted.next;
        }
        
        return dummy.next;
    }
}
