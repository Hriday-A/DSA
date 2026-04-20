class Solution {
    Integer [][] memo;
    public int minFallingPathSum(int[][] matrix) {
        if(matrix==null || matrix.length==0) return 0;
        int min = Integer.MAX_VALUE;
        int n = matrix.length;
        this.memo= new Integer[n][n];
        for(int j=0;j<n;j++){
            min=Math.min(min,helper(matrix,0,j));
        }
        return min;
    }
    private int helper(int[][] matrix, int i, int j){
        int n = matrix.length;
        // base 
        if(j<0 || j>=n) return Integer.MAX_VALUE -10;
        if (i==n) return 0;
        if(memo[i][j]!= null) return memo[i][j];
        // logic 
        int down= helper(matrix,i+1,j);
        int left = helper(matrix,i+1,j-1);
        int right = helper(matrix,i+1,j+1); 
        memo[i][j] = matrix[i][j] + Math.min(down,Math.min(left,right));
        return memo[i][j];
    }
}