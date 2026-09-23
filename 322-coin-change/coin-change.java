class Solution {
    public int coinChange(int[] coins, int amount) {
        int m = coins.length;
        int n= amount;
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=n;i++){
            dp[0][i]=999999;
            // System.out.println(dp[0][i]);
        }

        for(int i=1;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(j<coins[i-1]) dp[i][j]=dp[i-1][j];
                else{
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-coins[i-1]]+1);
                    // System.out.println(dp[i][j]);
                }
            }
        }
        if(dp[m][n]==999999) return -1;
        return dp[m][n];
    }
}