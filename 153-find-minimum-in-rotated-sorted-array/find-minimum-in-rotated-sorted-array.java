class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[r]>nums[mid]){
                r=mid;
                System.out.println("r="+r);
            }else{
                l=mid+1;
                System.out.println("l="+l);
            }
        }
        return nums[l];
    }
}