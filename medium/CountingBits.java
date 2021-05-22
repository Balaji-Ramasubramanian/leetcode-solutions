// Problem URL: https://leetcode.com/problems/counting-bits/

// Algorithm:
/*
Step 1: Initialize int array which holds count of set bits for 0 - 255 numbers.
Step 2: For each number 0 to num, Calculate the set bit count by using the initialized array valus
Step 3: Get the last 8 bits of the given number by performing AND operation with 0xff and lookup the count of the number in the array. 
        Right shift the number by 8 and repeat the same process for 24 bits and sum the counts.
*/

class CountingBits {
    int[] countBits256 = new int[256];

    // Initialize a 256 size int array that holds the count of set bits for 0 to 255 numbers  
    public void initialize() {
        countBits256[0]=0;
        for(int i=1;i<256;i++) {
            countBits256[i] = (i & 1) + countBits256[i/2];
        }
    }

    // Process the count operation using the lookup array
    public int[] countBits(int num) {
        initialize();
        int[] result = new int[num+1];
        for(int i=0;i<=num;i++) {
            result[i] = (countBits256[i & 0xff] +
                countBits256[(i>>8) & 0xff] + 
                countBits256[(i>>16)  & 0xff] + 
                countBits256[(i>>24) & 0xff]);
        }
        return result;
    }

}