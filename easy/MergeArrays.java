// Problem URL: https://leetcode.com/problems/merge-sorted-array/

/*
Step 1: Find the index at with nums2[i] need to be inserted
Step 2: From the index to m, Swift the elements of nums1 to right
Step 3: Insert nums2[i] in the index & increase the m value
*/

class MergeArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i =0;i<n;i++){
            int index = findIndex(nums1, m, nums2[i]);
            swiftRight(nums1, index, m);
            nums1[index] = nums2[i];
            m++;
        }
    }
    
    public int findIndex(int[] nums1, int m, int val){
        for(int i =0;i<m;i++){
            if(nums1[i] > val){
                return i;
            }
        }
        return m;
    }
    
    public void swiftRight(int[] nums1, int from, int m){
        for(int i = m; i>from;i--){
            nums1[i] = nums1[i-1];
        }
    }
}