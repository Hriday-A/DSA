class Solution {
    public int findMaxLength(int[] nums) {
        int rsum=0;
        int len=0;
        //1:+1, 0:-1
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1); 
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) rsum+=1;
            else rsum-=1;
            if(!map.containsKey(rsum)){
                map.put(rsum,i);
            }
            int curr=map.get(rsum);
            if((i-curr)>len) len=i-curr;
        }
        return len;
    }
}