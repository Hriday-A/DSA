class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int[] indegrees = new int[numCourses];
        for(int[] pr: prerequisites){
            int in = pr[1];
            int dep = pr[0];
            if(!map.containsKey(in)){
                map.put(in,new ArrayList<>());
            }
            map.get(in).add(dep);
            indegrees[dep]++;
        }
        Queue<Integer> q= new LinkedList<>();
        int c=0;
        for(int i=0;i<numCourses;i++){
            if(indegrees[i]==0){
                q.add(i);
                c++;
            }
        }
        if(c==numCourses) return true;
        if(q.isEmpty()) return false;
        while(!q.isEmpty()){
            int curr= q.poll();
            List<Integer> li= map.get(curr);
            if(li!=null){
                for(int baby: li){
                    indegrees[baby]--;
                    if(indegrees[baby]==0){
                        q.add(baby);
                        c++;
                        if(c==numCourses) return true;
                    }
                }
            }
        }
        if(c==numCourses) return true;
        return false;
    }
}