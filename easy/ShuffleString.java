// Problem URL: https://leetcode.com/problems/shuffle-string/

class ShuffleString {
    public String restoreString(String s, int[] indices) {
        StringBuffer result = new StringBuffer();
        for(int i=0;i<indices.length;i++){
            int pos = findElement(i, indices);
            result.append(s.charAt(pos));
        }
        return result.toString();
    }

    private int findElement(int i, int[] indices){
        for(int j=0;j<indices.length;j++){
            if(indices[j] == i)
                return j;
        }
        return -1;
    }
}