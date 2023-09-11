// Problem URL: https://leetcode.com/problems/concatenation-of-array/

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }
}
