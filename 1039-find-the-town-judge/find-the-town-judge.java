class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegrees = new int[n+1]; // no value at 0
        for(int[] tr:trust){
            indegrees[tr[0]]--; // judge should not trust 
            indegrees[tr[1]]++; //everyone should trust judge
        }
        for(int i=1;i<n+1;i++){
            if(indegrees[i]==n-1) return i;
        }
        return -1;
    }
}