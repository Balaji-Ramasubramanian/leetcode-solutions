/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// Problem URL: https://leetcode.com/problems/add-two-numbers/
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;
        while(l1 != null || l2 != null) {
            int a = (l1 != null)? l1.val : 0;
            int b = (l2 != null)? l2.val : 0;
            int digitSum = (a + b + carry);
            current.next = new ListNode(digitSum%10);
            current = current.next;
            carry = digitSum / 10;
            l1 = (l1 != null)? l1.next : null;
            l2 = (l2 != null)? l2.next : null;
        }
        if(carry > 0){
            current.next = new ListNode(carry);
        }
        return head.next;
    }
}