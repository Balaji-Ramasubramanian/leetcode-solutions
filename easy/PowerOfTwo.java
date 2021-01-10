//Problem URL: https://leetcode.com/problems/power-of-two/
class PowerOfTwo {
    public boolean isPowerOfTwo(long n) {
        // n = n & 0xffffffffl; // making n as unsignedValue
        // power of 2 will have only one set bit.
        // count the list of set bits, if count == 1, it's power of two
        if(n == 0) return false;
        int count = 0;
        while(n> 0){
            n = (n & (n-1));
            count ++;
        }
        if (count == 1) return true;
        else return false;
    }
}