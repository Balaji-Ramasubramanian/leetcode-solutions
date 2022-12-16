// Problem URL: https://leetcode.com/problems/rotate-list/
/**
 * 
 **/

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
class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return head;
        int l = findLength(head);
        int rotate = k%l;
        for(int i = 0;i<rotate;i++){
            ListNode first = head;
            int previousVal = head.val;
            ListNode iterate = head.next;
            int currentVal = head.val;
            while(iterate != null){
                currentVal = iterate.val;
                iterate.val = previousVal;
                iterate = iterate.next;
                previousVal = currentVal;
            }
            first.val = currentVal;
        }
        return head;
    }

    public int findLength(ListNode head){
        ListNode node = head;
        int l = 0;
        while(node != null){
            l++;
            node = node.next;
        }
        return l;
    }
    
}