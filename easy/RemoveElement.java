// Problem URL: https://leetcode.com/problems/remove-element/


class RemoveElement {
public int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;
        int lastpos = nums.length-1;
        for(int i =0;i<nums.length && i<lastpos;i++){
            if(nums[i] == val){
                while (nums[lastpos] == val && lastpos >i)
                    lastpos--;
                int temp = nums[i];
                nums[i] = nums[lastpos];
                nums[lastpos] = temp;
                if(lastpos>0)
                    lastpos--;
            }
        }
        return lastpos >= 0 && nums[lastpos] == val ? lastpos: lastpos+1;
    }
};