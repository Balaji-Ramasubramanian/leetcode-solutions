// Problem URL: https://leetcode.com/problems/reverse-integer/
class ReverseInteger {
    public int reverse(int x) {
        boolean isNegative = false;
        if(x < 0){
            isNegative = true;
            x = x*-1;
        }
        long reverse = 0;
        while(x > 0){
            reverse = (reverse * 10) + (x%10);
            x = x/10;
        }
        if(reverse > Integer.MAX_VALUE) return 0;
        if(reverse < Integer.MIN_VALUE) return 0;
        if(isNegative) reverse = reverse * -1;
        return (int)reverse;
    }
}