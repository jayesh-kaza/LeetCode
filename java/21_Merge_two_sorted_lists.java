public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode ws = dummy;
        merge(ws,l1,l2);
        return dummy.next;
    }
    
    public void merge(ListNode ws, ListNode l1,ListNode l2){
        while(l1 != null || l2 != null){
            if(l1 == null){
                ws.next = l2;
                l2 = l2.next;
            }else if(l2==null){
                ws.next = l1;
                l1=l1.next;
            }else if(l1.val < l2.val){
                ws.next = l1;
                l1=l1.next;
            }else{
                ws.next = l2;
                l2=l2.next;
            }
            ws = ws.next;
        }
    }
}
