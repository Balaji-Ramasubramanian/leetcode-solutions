//Problem URL: https://leetcode.com/problems/number-of-1-bits/
public class NumberOfOneBits {
    public int hammingWeight(long n) {
        n = n & 0xffffffffl; // making as unsigned int value
        int count = 0;
        while(n > 0){
            n = n & (n-1);
            count ++;
        }
        return count;
    }
}