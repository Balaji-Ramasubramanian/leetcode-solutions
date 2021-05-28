// Problem URL: https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/

/*
Algorithm:
    MinHeap is used to store for this algorithm. To represent min heap structure, a PriorityQueue is used.
    Store k elements of the array in the heap. The heap stored in the ASCII value order (smallest to largest).
    If the first element is lesser than the iterating element, add the current to heap and remove its first element.
    In this manner, the heap will always having k largest elements in sorted order. So the result is first element after iterating the array.

Step 1: Initialize a PriorityQueue with capacity of k
Step 2: Add first k elements with the pq
Step 3: from k to n elements in nums, check if the current element is greater than the pq's first element
        If true, remove the pq's first element and add the current element
Step 4: Return the pq's first element
*/

class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
        for(int i =0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(pq.peek()<nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}