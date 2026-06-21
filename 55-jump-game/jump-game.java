// class Solution {
//     public boolean canJump(int[] nums) {
//         int n= nums.length;
//         int t= n-1;
//         for(int i=n-2;i>=0;i--){
//             if(i+nums[i]>=t){
//                 t=i;
//             }
//         }
//         return t==0;
//     }
// }

// DFS 
class Solution {
    int n;
    HashSet<Integer> set;
    public boolean canJump(int[] nums) {
        this.n=nums.length;
        this.set = new HashSet<>();
        return dfs(nums,0);
    }
    private boolean dfs(int[] nums,int currI){
        //base case
        if(currI==n-1) return true;
        if(set.contains(currI)) return false;
        //logic 
        for(int k=1;k<=nums[currI];k++){
            int newI = currI+k;
            if(dfs(nums,newI)) return true;
        }
        set.add(currI);
        return false;
    }
}