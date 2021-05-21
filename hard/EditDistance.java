// Problem URL: https://leetcode.com/problems/edit-distance/

// Algorithm:
/*
Step1: Initialise a 2D array with (word1's length + 1) columns and (word2's length + 1) rows
Step2: Fill the 0th column as the row's value and 0th value on its column value
Step3: If the (i-1)th character of word1 is equal to (j-1)th character of word2 then fill the array with its diagonal value 
        Else, fill it with min(arr[i-1][j-1], arr[i-1][j], arr[i][j-1]) + 1
*/

class EditDistance {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int arr[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0){
                    arr[i][j] = j;
                    continue;
                }
                if(j==0){
                    arr[i][j]=i;
                    continue;
                }
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1];
                } else {
                    arr[i][j] = min(arr[i-1][j-1], arr[i-1][j], arr[i][j-1]) + 1;
                }
            }
        }
        return arr[n][m];
    }
    public int min(int a, int b, int c){
        if(a < b && a < c){
            return a;
        } 
        if( b < c){
            return b;
        }
        return c;
    }
}