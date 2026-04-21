class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length;
        boolean dir = true;
        int r=0,c=0;
        int[] res = new int[m*n];
        for(int i=0;i<m*n;i++){
            res[i] = mat[r][c];

            if(dir)// if going upwards
            {
                if(c==n-1){
                    r++;
                    dir= false;
                }else if(r==0){
                    c++;
                    dir=false;
                }else{
                    r--; c++;
                }
            }else{ // going downwards 
                if(r==m-1){
                    c++;
                    dir= true;
                }else if(c==0){
                    r++;
                    dir=true;
                }else{
                    c--; r++;
                }
            }
        }
        return res;
        
    }
}