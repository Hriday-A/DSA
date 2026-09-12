class Solution {
    private int [] nums;
    private int target;
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        int l=0;
        int r= nums.length-1;
        this.nums=nums;
        this.target=target;
        int first = binarysearchfirst();
        if(first==-1) return new int[]{-1,-1};
        int last = binarysearchlast(first);
        return new int[]{first,last};
    }
    public int binarysearchfirst(){
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid =l+(r-l)/2;
            if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return nums[r]==target?r:-1;
    }

    public int binarysearchlast(int first){
        int l=first;
        int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2+1;
            if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid;
            }
        }
        return r;
    }
}