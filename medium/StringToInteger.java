// Problem URL: https://leetcode.com/problems/string-to-integer-atoi/
import java.math.BigInteger;
class StringToInteger {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        boolean isNegative = false;
        if(s.charAt(0) == '-' || s.charAt(0) =='+'){
           if(s.charAt(0) == '-' ){
                isNegative = true;
            } 
           s = s.substring(1, s.length());
        }
        String n = "";
        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                n += s.charAt(i);
            } else {
                break;
            }
        }
        if(n.isEmpty()) return 0;
        BigInteger bigInt = new BigInteger(n);
        if(bigInt.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            return (isNegative)? Integer.MIN_VALUE: Integer.MAX_VALUE;
        }
       
        return (isNegative)?-1*Integer.parseInt(n): Integer.parseInt(n);
    }
}