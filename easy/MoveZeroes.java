// Problem URL: https://leetcode.com/problems/move-zeroes/
/**
 * 
 * Step 1: Iterate from index 0 to lastDigit
 * Step 2: Check if i is 0
 * Step 3: If so, push the element to lastDigit and move other elements in the array forward.
 * Step 4: Decrease lastDigit by one in every push action. Return the lastDigit at last. 
 *         This denotes the last Digit of non-duplicate elements in the array
 **/
class MoveZeroes {
    int lastDigit = 0;
    public void moveZeroes(int[] nums) {
      lastDigit = nums.length;
        for(int i =0; i<= nums.length-1 && i<lastDigit; i++){
            if(nums[i] == 0){
                pushAtLast(nums, i);
                i--;
            }
        }
    }

    // Push the element into the last and move other elements one step forward in the array.
    public void pushAtLast(int[] nums, int i){
        int temp = nums[i];
        for(; i<lastDigit-1; i++){
            nums[i] = nums[i+1];
        }
        nums[lastDigit-1] = temp;
        lastDigit--;
    }
}