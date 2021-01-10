//Problem URL: https://leetcode.com/problems/two-sum/
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int returnValues[] = new int[2];
        for(int i =0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(nums[i]+nums[j] != target) continue;
                    returnValues[0] = i;
                    returnValues[1] = j;
                }
            
        }
        return returnValues;
    }
}