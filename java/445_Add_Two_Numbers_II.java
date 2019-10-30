/*
Problem statement
https://leetcode.com/problems/add-two-numbers-ii/
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int carry = 0, data;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                stack1.push(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                stack2.push(l2.val);
                l2 = l2.next;
            }
        }
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty() && !stack2.isEmpty()) {
                if (head == null) {
                    data = stack1.pop() + stack2.pop() + carry;
                    carry = data/10;
                    head = new ListNode(data % 10);
                } else {
                    data = stack1.pop() + stack2.pop() + carry;
                    carry = data/10;
                    temp = new ListNode(data % 10);
                    temp.next = head;
                    head = temp;
                }

            }
            else if (!stack1.isEmpty()) {
                data = stack1.pop() + carry;
                carry = data/10;
                temp = new ListNode(data%10);
                temp.next = head;
                head = temp;
            }
            else {
                data = stack2.pop() + carry;
                carry = data/10;
                temp = new ListNode(data%10);
                temp.next = head;
                head = temp;
            }
        }
        if( carry != 0) {
            temp = new ListNode(carry);
            temp.next = head;
            head = temp;
        }
        return head;
    }
}