class Solution {
    int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return helper(nums,0);
    }
    private int helper(int[] nums,int i){
        //base
        if(i>=nums.length) return 0;
        //logic 
        if(memo[i]!=-1) return memo[i];
        int steal = nums[i]+helper(nums,i+2);
        int skip= helper(nums,i+1);
        memo[i]=Math.max(steal,skip);
        return memo[i];
}
}