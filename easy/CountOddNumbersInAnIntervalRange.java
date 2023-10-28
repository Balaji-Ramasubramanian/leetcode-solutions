// Problem URL: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

/**
Use cases to be considered:
 - high = low
 - Both high & low are even numbers
 - High is even number
 - Low is even number
 - Both high and low is odd number

If both low & high are odd numbers, (high-low)/2 +1 will return the count of odd numbers, 
hence we need to move low to first odd number & high to last odd number in the range.

If low ie even do low+=1, If high is even do high+=1
return (high-low)/2 +1
 */
class OddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        if((low&1) == 0) low+=1;
        if((high&1) == 0) high-=1;
        return (high-low)/2 +1;
    }
}