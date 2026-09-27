class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[] dp= new int[n];
        for(int i=0;i<n;i++){
            dp[i]=matrix[0][i];
        }

        for(int i=1;i<n;i++){
            int k=dp[0];
            for(int j=0;j<n;j++){
                int temp=dp[j];
                if(j==0){
                    dp[j]= matrix[i][j]+Math.min(dp[j],dp[j+1]);
                }
                else if(j==n-1){
                    dp[j]= matrix[i][j]+Math.min(k,dp[j]);
                }
                else{
                    dp[j]= matrix[i][j]+Math.min(Math.min(k,dp[j+1]),dp[j]);
                }
                k=temp;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,dp[i]);
        }
        return min;
    }
}