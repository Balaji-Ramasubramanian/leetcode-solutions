// Problem URL: https://leetcode.com/problems/shuffle-an-array/

class ShuffleAnArray {

    int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int[] result = nums.clone();
        for(int i=nums.length-1;i>0;i--){
            Random r = new Random();
            // Pick a random index from 0 to i
            int j = r.nextInt(i+1);
             
            // Swap result[i] with the element at random index
            int temp = result[i];
            result[i] = result[j];
            result[j] = temp;
        }
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */