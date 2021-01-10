// Problem URL: https://leetcode.com/problems/richest-customer-wealth/
class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i =0;i<accounts.length;i++){
            int localMax = 0;
            for(int j=0;j<accounts[i].length;j++){
                localMax += accounts[i][j];
            }
            if(localMax>max){
                max = localMax;
            }
        }
        return max;
    }
}