class Solution {
    int[][] memo;
    public int uniquePaths(int m, int n) {
        this.memo= new int[m+1][n+1];
        return solve(0,0,m,n);
    }
    private int solve(int i, int j,int m, int n){
        //base 
        if(i==m-1 && j==n-1) return 1;
        if(i == m || j == n) return 0;
        //logic 
        if(memo[i][j]!=0) return memo[i][j];
        int right = solve(i+1,j,m,n);
        int down = solve(i,j+1,m,n);
        return memo[i][j]=right+down;

    }
}