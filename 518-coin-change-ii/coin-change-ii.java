class Solution {
    public int change(int amount, int[] coins) {
        int c= coins.length;
        int[][] dp = new int[c+1][amount+1];
        for(int i=0;i<c+1;i++){
            dp[i][0]=1;
        }

        for(int i=1; i<c+1;i++){
            for(int j=0; j<amount+1;j++){
                if (coins[i - 1] <= j) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
            } else {
                dp[i][j] = dp[i - 1][j];
            }
            }
        }
        return dp[c][amount];
    }
}