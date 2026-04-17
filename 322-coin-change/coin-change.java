// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         //Brute force - Exhaustive
//         int re = helper(coins,amount,0);
//         if(re<Integer.MAX_VALUE-10) return re;
//         return -1;
//     }
//     private int helper(int[] coins, int amount, int idx){
//         //base 
//         if(idx==coins.length || amount<0) return Integer.MAX_VALUE-10;
//         if(amount==0) return 0;
//         //logic
//         //Not choose
//         int case1= helper(coins,amount,idx+1);
//         //choose 
//         int case2=1+helper(coins,amount-coins[idx],idx);
//         return Math.min(case1,case2);
//     }
// }

class Solution {
    public int coinChange(int[] coins, int amount) {
        int m= coins.length;
        int n= amount;
        int [][] dp = new int[m+1][n+1];
        dp[0][0]=0;
        for(int i=1;i<=n;i++){
            dp[0][i]= Integer.MAX_VALUE -10;
        }
        for(int i=1; i<=m;i++){
            for(int j=0;j<=n;j++){
                if(j<coins[i-1]){
                    dp[i][j]= dp[i-1][j];
                }else{
                   dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]); 
                }
            }
        }
        if(dp[m][n]<Integer.MAX_VALUE -10) return dp[m][n];
        return -1;
    }
}