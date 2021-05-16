// Problem URL: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
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
class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        while(current != null && current.next != null){
            ListNode next = current.next;
            if(current.val == next.val){
                int val = current.val;
                while(current != null && current.val == val){
                    current = current.next;
                }
                if(previous != null){
                    previous.next = current;
                } 
                else {
                    head = current;
                }
            } else {
                previous = current;
                current = next;
            }
        }
        return head;
    }
}