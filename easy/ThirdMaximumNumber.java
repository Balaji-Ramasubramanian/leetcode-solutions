// Problem URL: https://leetcode.com/problems/third-maximum-number/

/*
Algorithm: Its a modification of Kth largest element problem
 Problem URL: https://leetcode.com/problems/kth-largest-element-in-an-array/
 Solution URL: https://github.com/Balaji-Ramasubramanian/leetcode-solutions/blob/main/medium/KthLargestElement.java
*/
class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int k =3; 
        if(nums.length < 3){
            k = 1;
        }
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
        int j =0, i=0;
        while(i<nums.length && j<k) {
            if(!(pq.contains(nums[i]))){
                pq.add(nums[i]);
                j++;
            }
            i++;
        }
        for(;i<nums.length;i++){
            if(pq.peek()<nums[i] && !(pq.contains(nums[i]))){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        if(pq.size() < k){
            for(int l =0;l<pq.size()-1;l++){
                pq.poll();
            }
        }
        System.out.println(pq);
        return pq.peek();
    }
}