// Problem URL: https://leetcode.com/problems/backspace-string-compare/

// Algorithm
/*
Step1: Initialize 2 StringBuffer objects to store the processed string values
Step2: Iterate through the string characters,
        If the character is # and StringBuffer length > 0, then replace the StringBuffers last character with empty string
        Else append the character with the StringBuffer
Step3: Return if both the String buffers are equal
*/

class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '#' && s1.length() >0){
                s1.replace(s1.length()-1, s1.length(), "");
            } else if(s.charAt(i) !='#'){
                s1.append(s.charAt(i));
            }
        }
        for(int i =0;i<t.length();i++){
            if(t.charAt(i) == '#' && s2.length() >0){
                s2.replace(s2.length()-1, s2.length(), "");
            } else if(t.charAt(i) !='#') {
                s2.append(t.charAt(i));
            }
        }
        System.out.println(s1+" "+s2);
        return s1.toString().equals(s2.toString());
    }
}