// class Solution {
//     HashMap<Integer,Integer> map;
//     int n ;
//     public int jump(int[] nums) {
//         this.n = nums.length;
//         map = new HashMap<>();
//         return dfs(nums,0);
//     }
//     private int dfs(int[] nums, int curr){
//         //base 
//         if(curr>=n-1) return 0;
//         if(map.containsKey(curr)) return map.get(curr);
//         //logic 
//         int min=99999;
//         for(int i=1;i<=nums[curr];i++){
//             int newI= curr+i;
//             min= Math.min(min,dfs(nums,newI)+1);
//         }
//         map.put(curr,min);
//         return min;
//     }
// }

// class Solution {
//     public int jump(int[] nums) {
//         int n=nums.length;
//         if(n==1) return 0;
//         HashSet<Integer> set= new HashSet<>();
//         Queue<Integer> q = new LinkedList<>();
//         q.add(0);
//         int level=0;
//         while(!q.isEmpty()){
//             int size = q.size();
//             for(int i=0;i<size;i++){
//                 int curr=q.poll();
//                 for(int k=1;k<=nums[curr];k++){
//                     int newi= curr+k;
//                     if(newi>=n-1) return level+1;
//                     if(!set.contains(newi)){
//                         q.add(newi);
//                         set.add(newi);
//                     }
//                 }
//             }
//             level++;
//         }
//         return level;
//     }
// }

class Solution {
    public int jump(int[] nums) {
        int n= nums.length;
        int coverage =0;
        int farthest= 0;
        int jump=0;
        if(n==1) return 0;
        for(int i=0;i<n-1;i++){
            coverage = Math.max(coverage,i+nums[i]);
            if(i==farthest){
                farthest = coverage;
                jump++;
                if(coverage>=n-1) return jump;
            }
        }
        return jump;
    }
}