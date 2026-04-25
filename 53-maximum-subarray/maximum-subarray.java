// my initial approach was to find prefix sum
// find the higest value in it and store the index at that point 
// find the non-neg value and from the found index and go back - that would be our range 
// use that range to find the sum --> not optimal - t: o(3n) and s: o(n)

// current sol v diff 
class Solution {
    public int maxSubArray(int[] nums) {

        int rsum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            rsum=Math.max(nums[i],rsum+nums[i]);
            max= Math.max(max,rsum);
        }
        return max;
    }
}