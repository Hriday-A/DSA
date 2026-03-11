class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(
        (a,b) -> {
            if (Math.abs(a-x) == Math.abs(b-x)) {
                return b - a;
            }
            return Math.abs(b-x) - Math.abs(a-x);
            }
        );
        for(int i:arr){
            pq.offer(i);
            if(pq.size()>k){
                pq.poll();
                }  
            }
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<k;i++){
            res.add(pq.poll());
        }

        Collections.sort(res);

        return res;


        
    }
}