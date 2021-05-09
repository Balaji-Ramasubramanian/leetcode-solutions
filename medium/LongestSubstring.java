// Problem URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/
class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
      int max = 0;
        for(int i = 0; i < s.length(); i++){
            HashSet chars = new HashSet();
            int localMax = 0;
            for( int j = i; j< s.length(); j++){
                if(chars.contains(s.charAt(j))){
                   break;
                }
                localMax++;
                chars.add(s.charAt(j));
            }
            if(max < localMax) max = localMax;
        }
        return max;
    }
}