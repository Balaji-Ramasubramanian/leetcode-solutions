// Problem URL: https://leetcode.com/problems/plus-one/

class PlusOne {
    public int[] plusOne(int[] digits) {
       int n = digits.length;
        int carry = (digits[n-1]+1)/10;
        if(carry == 0){
            digits[n-1] += 1;
            return digits;
        }
        ArrayList<Integer> sum = new ArrayList<Integer>();
        sum.add((digits[n-1]+1)%10);
        for(int i = n-1;i>0 ;i--){
            int s = (digits[i-1] + carry);
            sum.add(s%10);
            carry = s/10;
        }
        if(carry>0) sum.add(carry);
        int l = sum.size();
        int[] sumarr = new int[l];
        for(int i = 0;i<l;i++){
            sumarr[i] = sum.get(l-1-i);
        }
        return sumarr;
    }
}