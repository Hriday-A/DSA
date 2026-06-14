class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] bucket= new int[n+1];
        // reduce sorting using bucket sort
        for(int i:citations){
            if(i>n) bucket[n]++;
            else bucket[i]++;
        }
        int sum=0;
        for(int j=n;j>0;j--){
            sum+=bucket[j];
            if(sum>=j) return j;
        }
        return 0;
    }
}

//nlogn 
// class Solution {
//     public int hIndex(int[] citations) {
//         Arrays.sort(citations);
//         int j=citations.length;
//         for(int i=0;i<citations.length;i++){
//             if(citations[i]>=j) return j;
//             j--;
//         }
//         return 0;
//     }
// }