// Problem URL: https://leetcode.com/problems/find-the-duplicate-number/

/*
Problem statement state the nums array contains 1-n elements and one duplicate.
To find duplicate without additional memory space, The array can be sorted and iterated to find if there any duplicates
*/

class FindDuplicate {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
}