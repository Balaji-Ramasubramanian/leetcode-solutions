// Problem URL: https://leetcode.com/problems/trapping-rain-water/

// Algorithm
/*
Step 1: Init i =0, j = height.length-1, leftMax = 0, rightMax =0, water = 0;
Step 2: Iterate while i <j
         If(height[i] < height[j])
            if(height[i] > leftMax) leftMax = height[i]
            else water = water +  (leftMax - height[i])
            decrease i
         Else 
            if(height[j] > rightMax) rightMax = height[j]
            else water = water +  (rightMax - height[j])
            decrease j
Step 3: Return water value
*/

class TrappingRainWater {
    public int trap(int[] height) {
        int leftMax = 0, rightMax = 0, i = 0, j = height.length-1, water = 0;
        while(i<j){
            if(height[i] < height[j]){
                if(height[i] > leftMax) leftMax = height[i];
                else water += (leftMax - height[i]);
                i++;
            } else {
                if(height[j] > rightMax) rightMax = height[j];
                else water += (rightMax - height[j]);
                j--;
            }
        }
        return water;
    }
}