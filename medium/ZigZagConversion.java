// Problem URL: https://leetcode.com/problems/zigzag-conversion/

class ZigZagConversion {
    public String convert(String s, int numRows) {
        String result = "";
        int zig = 0, zag =0 ;
        if(numRows == 1) return s;
        if(numRows > 1) zig= (numRows -1) * 2;
        int count = 0;
        if(!s.isEmpty()){
            for(int i = 0; i<numRows && i<s.length(); i++){
                result = result + s.charAt(i);
                for(int pos = i;pos<s.length();){
                    if(zig != 0 && pos<s.length()){
                        pos += zig;
                       if(pos<s.length())  result = result + s.charAt(pos);
                        count++;
                    }
                    if(zag != 0 && pos<s.length()){
                        pos += zag; 
                        if(pos<s.length()) result = result + s.charAt(pos);
                        count++;
                    }
                }
                zig -=2;
                zag +=2;
            }
        }
        return result;
    }
}