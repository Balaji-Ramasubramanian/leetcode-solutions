// Problem URL: https://leetcode.com/problems/maximum-subarray/
class MaximumSubarray {
    public int maxSubArray(int[] nums) {
             int result = nums[0];
        for (int i = 0; i < nums.length; i++)
        {
            int sum = nums[i];
            // traversing in current subarray
            for (int j = i + 1; j < nums.length; j++)
            {
                result = Math.max(result, sum);
                sum += nums[j];
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}