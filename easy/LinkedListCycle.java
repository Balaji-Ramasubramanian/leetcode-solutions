// Problem URL: https://leetcode.com/problems/linked-list-cycle/


/*
Steps:
Step 1: Initiate slowPtr, fastPtr with head
Step 2: while slowPtr & fastPtr is not null
            Move slowPtr by one node & fastPtr by two nodes
            if any particular point, slowPtr == fastPtr then, there is a loop
            else return false;
*/

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

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slowPtr = head, fastPtr = head;
        while(slowPtr != null && fastPtr != null){
            slowPtr = slowPtr.next;
            if(fastPtr.next != null) 
            {
                fastPtr = fastPtr.next.next;
            } else {
                return false;
            }
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }
}