class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int j=citations.length;
        for(int i=0;i<citations.length;i++){
            if(citations[i]>=j) return j;
            j--;
        }
        return 0;
    }
}