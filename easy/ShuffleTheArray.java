// Problem URL: https://leetcode.com/problems/shuffle-the-array/

class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int pos = n;
        for(int i = 1; i<nums.length; i+=2){
            int temp = nums[pos];
            for(int j=pos; j > i; j--){
                nums[j] = nums[j-1];
            }
            nums[i] = temp;
            pos++;
        }
        return nums;
    }
}