// Problem URL: https://leetcode.com/problems/first-unique-character-in-a-string/

//Algorithm
/*
Step 1: Declare an object to store index & count(frequency of a letter)
Step 2: Initiate a HashMap. Iterate through the String characters
Step 3: If the char already present in the HashMap, get the count from the object and add 1 to it.
        Else, Add the char as key and CountIndex(1, index) to the HashMap
Step 4: For every key in the HashMap, get the count. If count == 1 and less than minIndex, minIndex = currIndex.
Step 5: return -1 if no such minIndex else, return minIndex
*/

class FirstUniqueCharacterInString {
   class CountIndex {
        int count, index;
        public CountIndex(int count, int index) {
            this.count = count;
            this.index = index;
        }
    }
    public int firstUniqChar(String s) {
        HashMap<Character, CountIndex> counter = new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(counter.containsKey(s.charAt(i))){
                int count = counter.get(s.charAt(i)).count+1;
                counter.put(s.charAt(i), new CountIndex(count, i));
            } else {
                counter.put(s.charAt(i), new CountIndex(1, i));
            }
        }
        int minIndex = Integer.MAX_VALUE;
        for(Character c: counter.keySet()){
            if(counter.get(c).count == 1 && counter.get(c).index < minIndex){
                minIndex = counter.get(c).index;
            }
        }
        return (minIndex == Integer.MAX_VALUE)? -1: minIndex;
    }
}