class Solution {
    int[] t;
    public int maxSumAfterPartitioning(int[] arr, int k) {
        this.t= new int[501];
        for(int i=0;i<arr.length;i++){
            return solve(i,arr,k);
        }
        return -1;
    }
    private int solve(int i,int[] arr, int k){
        //base 
        if(i>=arr.length) return 0;
        //logic
        if(t[i]!=0) return t[i];
        int result =0;
        int curr_max= -1;
        for(int j=i;j<arr.length && j-i+1<=k;j++){
            curr_max= Math.max(curr_max,arr[j]);
            result=Math.max(result,((j-i+1)*curr_max)+solve(j+1,arr,k));
        }
        return t[i]=result;
    }
}