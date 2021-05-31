// Problem URL: https://leetcode.com/problems/kth-largest-element-in-a-stream/

/*
    Its a modification of Kth largest element in array problem. URL: https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/
    Solution URL: https://github.com/Balaji-Ramasubramanian/leetcode-solutions/blob/main/medium/KthLargestElement.java
*/

class KthLargest {
    PriorityQueue<Integer> pq;
    int count;
    public KthLargest(int k, int[] nums) {
        count = k;
        pq = new PriorityQueue<Integer>(k);
        for(int i =0;i<k && i< nums.length;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(pq.peek()<nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
    }
    
    public int add(int val) {
           if (pq.peek() == null || pq.size() < count){
                pq.add(val);
            }else if(pq.peek() < val){
                pq.poll();
                pq.add(val);
            } 
       return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */