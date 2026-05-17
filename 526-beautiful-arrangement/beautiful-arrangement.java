class Solution {
    boolean[] arr;
    int result;
    public int countArrangement(int n) {
        this.arr = new boolean[n+1];
        this.result=0;
        helper(n,1);
        return result;
    }
    public void helper(int n, int idx){
        //base 
        if(idx>n)
        {
            result++;
            return;
        }  

        //logic 
        for(int i=1;i<=n;i++){
            if((arr[i]==false)&&(i%idx==0 || idx%i==0)){
                arr[i]= true; //action 
                helper(n,idx+1); //recurse
                // System.out.println(arr[i]);
                //backtrack 
                arr[i]= false;
            }
        }
    }
}