// Problem URL: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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

 // The logic used here is to have 2 iterator for the linkedlist, move one of the iterator to n positions from head.
 // Then iterate both nodes until the b node hits last. When b hits last, then the position of a indicates the node to be removed.
 // Hence remove this from the link by setting a.next = a.next.next;
class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a = head;
        ListNode b = head;
        ListNode finalList = a;
        for(int i=1;i<=n;i++){
            b = b.next;
        }
        if(b == null){
            return finalList = finalList.next;
        }
        while(b != null && b.next != null){
            a = a.next;
            b = b.next;
        }
        if(a!=null && a.next != null)
            a.next = a.next.next;
        return finalList;
    }
}