// Problem URL: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null){
            ListNode next = current.next;
            if(current != null && current.val == next.val){
                int val = next.val;
                while(next != null && next.val == val){
                    next = next.next;
                }
            }
            current.next = next;
            current = next;
        }
        return head;
    }
}