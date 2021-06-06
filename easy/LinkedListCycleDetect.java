// Problem URL: https://leetcode.com/problems/linked-list-cycle-ii/


/*
Steps:
Step 1: Initiate slowPtr, fastPtr with head
Step 2: while slowPtr & fastPtr is not null
            Move slowPtr by one node & fastPtr by two nodes
            if any particular point, slowPtr == fastPtr then, there is a loop
            else return null;
Step 3: if there is a loop, then iterate slowPtr from head & move fastPtr from its current position by one
        the point where they meet will be the starting index of the loop
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
public class LinkedListCycleDetect {
    public ListNode detectCycle(ListNode head) {
        ListNode slowPtr = head, fastPtr = head;
        while(slowPtr != null && fastPtr != null){
            slowPtr = slowPtr.next;
            if(fastPtr.next != null) 
            {
                fastPtr = fastPtr.next.next;
            } else {
                return null;
            }
            if(slowPtr == fastPtr){
                return findIndex(head, fastPtr);
            }
        }
        return null;
    }
    
    public ListNode findIndex(ListNode head, ListNode fastPtr){
        ListNode slowPtr = head;
        while(slowPtr != fastPtr){
            fastPtr = fastPtr.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
    }
}