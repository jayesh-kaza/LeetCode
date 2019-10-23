public class Solution {

public ListNode mergeKLists(ListNode[] lists) {
    if(lists == null || lists.length == 0 ){
        return null;
    }
    return mergeKLists(lists,0,lists.length-1);
}

public ListNode mergeKLists(ListNode[] lists, int left, int right){
    if(left < right){
        int mid = (left + right)/2;
        return merge(mergeKLists(lists,left,mid),mergeKLists(lists,mid+1,right));
    }
    return lists[left];
}

public ListNode merge(ListNode n1, ListNode n2){
    ListNode head =  new ListNode(0);
    ListNode n = head;
    while(n1 != null && n2 != null){
        if(n1.val < n2.val){
            n.next = n1;
            n1 = n1.next;
            n = n.next;
        }else{
            n.next = n2;
            n = n.next;
            n2 = n2.next;
        }
    }
    if( n1 != null){
        n.next = n1;
    }else{
        n.next = n2;
    }
    return head.next;
}
}
