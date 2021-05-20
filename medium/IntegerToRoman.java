// Problem URL: https://leetcode.com/problems/integer-to-roman/

class IntegerToRoman {
    public String intToRoman(int num) {
        String result = "";
        while(num > 0){
            if(num >= 1000){
                result +="M";
                num -= 1000;
            } 
            if(num >= 500 && num < 900){
                result +="D";
                num -=  500;
            } 
            if (num >= 100 && num < 400){
                result +="C";
                num -=  100;
            } 
            if (num >= 50 && num < 90){
                result +="L";
                num -=  50;
            } 
            if (num >= 10 && num < 40){
                result +="X";
                num -=  10;
            } 
            if (num >= 5 && num < 9){
                result +="V";
                num -=  5;
            }
            if( num < 4 && num > 0){
                result += "I";
                num -=1;
            }
            if ( num >= 900 && num < 1000){
                result +="CM";
                num -= 900;
            } 
            if ( num >= 400 && num < 500){
                result +="CD";
                num -= 400;
            } 
            if (num >= 90 && num < 100){
                result +="XC";
                num -= 90;
            } 
            if (num >= 40 && num < 50){
                result +="XL";
                num -= 40;
            } 
            if (num == 9){
                result +="IX";
                num = 0;
            } 
            if (num == 4){
                result +="IV";
                num = 0;
            }
        }
        return result;
    }
}