// Exhaustive method 
// class Solution {
//     public int rob(int[] nums) {
//         return helper(nums,0);
//     }
//     private int helper(int[] nums, int idx){
//         //base
//         if(idx>=nums.length) return 0;
//         //logic
//         //dont choose 
//         int case1 = helper(nums,idx+1);
//         //choose 
//         int case2 = nums[idx]+helper(nums,idx+2);
//         return Math.max(case1, case2);
//     }
// }

import java.util.Arrays;
class Solution {
    int[] memo;
    public int rob(int[] nums) {
        this.memo= new int[nums.length];
        Arrays.fill(memo,-1);
        return helper(nums,0);
    }
    private int helper(int[] nums, int idx){
        //base
        if(idx>=nums.length) return 0;
        if(memo[idx]!=-1) return memo[idx];
        //logic
        //dont choose 
        int case1 = helper(nums,idx+1);
        //choose 
        int case2 = nums[idx]+helper(nums,idx+2);
        memo[idx]= Math.max(case1, case2);
        return memo[idx];
    }
}