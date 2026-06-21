class Solution {
    HashMap<Integer,Integer> map;
    int n ;
    public int jump(int[] nums) {
        this.n = nums.length;
        map = new HashMap<>();
        return dfs(nums,0);
    }
    private int dfs(int[] nums, int curr){
        //base 
        if(curr>=n-1) return 0;
        if(map.containsKey(curr)) return map.get(curr);
        //logic 
        int min=99999;
        for(int i=1;i<=nums[curr];i++){
            int newI= curr+i;
            min= Math.min(min,dfs(nums,newI)+1);
        }
        map.put(curr,min);
        return min;
    }
}