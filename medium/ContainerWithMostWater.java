// Problem URL: https://leetcode.com/problems/container-with-most-water/
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int minHeight = Math.min(height[i], height[j]);
            int length = (j-i);
            max = Math.max(max, minHeight*length);
            if(height[i] < height[j]){
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}