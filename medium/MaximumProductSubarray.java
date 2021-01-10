// Problem URL: https://leetcode.com/problems/maximum-product-subarray/
class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        for (int i = 0; i < nums.length; i++)
        {
            int mul = nums[i];
            // traversing in current subarray
            for (int j = i + 1; j < nums.length; j++)
            {
                result = Math.max(result, mul);
                mul *= nums[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }
}