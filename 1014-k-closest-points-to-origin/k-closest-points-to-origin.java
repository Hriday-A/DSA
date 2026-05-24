class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue <int[]> pq= new PriorityQueue<>((a,b)->{
            int distA = a[0]*a[0] + a[1]*a[1];
            int distB = b[0]*b[0] + b[1]*b[1];
            return distB-distA;
        });
        int[][] res = new int[k][2];
        int l= points.length;
        for(int i=0;i<l;i++){
            pq.add(points[i]);
            if(pq.size()>k) pq.poll();
        }
        for (int i = 0; i < k; i++) {
        res[i] = pq.poll();
        }
        return res;
    }
}