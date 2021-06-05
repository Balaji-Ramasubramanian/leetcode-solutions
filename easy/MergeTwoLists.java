// Problem URL: https://leetcode.com/problems/merge-two-sorted-lists/

/*
Step 1: initialize a mergedList & a headPtr to point the first node of the result list
Step 2: Add the minimum value from l1, l2 to mergedList & add a next node to the mergedList
Step 3: return the headPtr node
*/

class MergeTwoLists {
   
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedList = new ListNode();
        ListNode headPtr = mergedList;
        while(l1 != null && l2 != null){
            mergedList.next = new ListNode();
            mergedList = mergedList.next;
            if(l1.val < l2.val){
                mergedList.val = l1.val;
                l1 = l1.next;
            } else {
                mergedList.val = l2.val;
                l2 = l2.next;
            }
        }
        
        while(l1 != null){
            mergedList.next = new ListNode();
            mergedList = mergedList.next;
            mergedList.val = l1.val;
            l1 = l1.next;
        }
        while(l2 != null){
            mergedList.next = new ListNode();
            mergedList = mergedList.next;
            mergedList.val = l2.val;
            l2 = l2.next;
        }
        return headPtr.next;
    }
}