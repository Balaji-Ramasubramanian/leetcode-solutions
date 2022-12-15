// Problem URL: https://leetcode.com/problems/remove-element/
/**
 * 
 * Step 1: Iterate from index 0 to lastDigit
 * Step 2: Check if i and given element are same,
 * Step 3: If those are same, push the element to lastDigit and move other elements in the array forward.
 * Step 4: Decrease lastDigit by one in every push action. Return the lastDigit at last. 
 *         This denotes the last Digit of non-duplicate elements in the array
 **/
class RemoveElement {
    int lastDigit = 0;
    public int removeElement(int[] nums, int val) {
        lastDigit = nums.length;
        for(int i =0; i<= nums.length-1 && i<lastDigit; i++){
            if(nums[i] == val){
                pushAtLast(nums, i);
                i--;
            }
        }
        return lastDigit;
    }

    public void pushAtLast(int[] nums, int i){
        int temp = nums[i];
        for(; i<lastDigit-1; i++){
            nums[i] = nums[i+1];
        }
        nums[lastDigit-1] = temp;
        lastDigit--;
    }
};