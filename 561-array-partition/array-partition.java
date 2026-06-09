//Time Complexity - O(nlogn)
//Space Complexity - O(1)
/*
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}
*/
class Solution {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        int min=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        boolean flag= true;
        int add=0;
        for(int i=min;i<=max;i++){
            if(map.containsKey(i)){
                int cnt= map.get(i);
                while(cnt-->0){
                    if(flag){
                        add+=i;
                    }
                    flag=!flag;
                }
            }
        }
        return add;
    }
}