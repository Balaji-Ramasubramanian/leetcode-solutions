// Problem URL: https://leetcode.com/problems/roman-to-integer/

import java.util.Hashtable;
class RomanToInteger {
  public int romanToInt(String s) {
      int num = 0;
      if(s.contains("IV")){
          num +=4;
          s = s.replace("IV", "");
      }
      if(s.contains("IX")){
          num +=9;
          s = s.replace("IX", "");
      }
      if(s.contains("XL")){
          num +=40;
          s = s.replace("XL", "");
      }
      if(s.contains("XC")){
          num +=90;
          s = s.replace("XC", "");
      }
      if(s.contains("CD")){
          num +=400;
          s = s.replace("CD", "");
      }
      if(s.contains("CM")){
          num +=900;
          s = s.replace("CM", "");
      }
      Hashtable<Character,Integer> values = new Hashtable(){{
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
      }};
      for(int i =0; i<s.length();i++) {
          num += values.get(s.charAt(i));
      }
      return num;
    }
}