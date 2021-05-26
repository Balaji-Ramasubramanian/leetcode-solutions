// Problem URL: https://leetcode.com/problems/first-missing-positive/

// Algorithm:
/*
Step1: Sort the given array
Step2: Initialize an integer j to trace the positive numbers
Step3: Iterator through the array 
        If the array element is positive and greater the j, return j
        Else if the number is positive, increase j
*/

class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j = 1;
        for(int i =0;i<nums.length;i++) {
            if(nums[i] > j) {
                return j;
            } else if(nums[i] > 0) {
                j++;
            }
        }
        return (nums[nums.length-1] >0)?++nums[nums.length-1]:1;
    }
}