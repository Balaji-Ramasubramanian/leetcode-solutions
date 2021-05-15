// Problem URL: https://leetcode.com/problems/first-missing-positive/

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