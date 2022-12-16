// Problem URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
/**
 * Step 1: Iterate from index 1 to last digit
 * Step 2: Check if i and previous element are same,
 * Step 3: If those are same, & move element is already 1, 
 *         then, push the element to lastDigit and move other elements in the array forward.
 *         else, make move element as 1
 * Step 4: Decrease lastDigit by one in every push action. Return the lastDigit at last. 
 *         This denotes the last Digit of non-duplicate elements in the array
 **/
class RemoveDuplicatesFromSortedArrayII {
    int lastDigit = 0;
    public int removeDuplicates(int[] nums) {
        lastDigit = nums.length;
        int move = 0;
        for(int i =1; i<= nums.length-1 && i<lastDigit; i++){
            if(nums[i] == nums[i-1]){
                if(move == 1) {
                    pushAtLast(nums, i);
                    i--;
                }
                move = 1;
            } else {
                move = 0;
            }
        }
        return lastDigit;
    }

    // Push the duplicate element into the last and move other elements one step forward in the array.
    public void pushAtLast(int[] nums, int i){
        int temp = nums[i];
        for(; i<lastDigit-1; i++){
            nums[i] = nums[i+1];
        }
        nums[lastDigit-1] = temp;
        lastDigit--;
    }
}