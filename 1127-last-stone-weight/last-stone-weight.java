class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i:stones){
            pq.add(i);
        }

        while (pq.size() > 1){
            int x=pq.poll();
            int y= pq.poll();
            int z=x-y;
            if (z<0){
                z=z*(-1);
                pq.add(z);
            }
            else if(z>0){
                pq.add(z);
            }
        }

        if (pq.isEmpty()) {
            return 0;
        }

        return pq.peek();


    }
}