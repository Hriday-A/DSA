class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rev= new int[nums.length];
        int pro= 1;
        for(int i=0;i<nums.length;i++){
            rev[i]=pro;
            pro = pro*nums[i];
        }
        pro=1;
        for(int i=nums.length-1;i>=0;i--){
            rev[i]= rev[i]*pro;
            pro=pro*nums[i];
            System.out.println(rev[i]);
        }

        return rev;
        
    }
}