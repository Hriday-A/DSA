class Solution {
    public void setZeroes(int[][] matrix) {
        int m= matrix.length;
        int n = matrix[0].length;
        // first check first col and first row if zero there 
        boolean firstrow=false;
        boolean firstcol= false;

        //first row 
        for(int i=0;i<n;i++){
            if(matrix[0][i]==0) firstrow=true;
        }
        //first col
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0) firstcol=true;
        }
        //Scan first row and mark at zero index of col/row
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        // set all col and row zero for the markers
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        // making first row and col zero if there 
        if(firstrow){
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
        if(firstcol){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}