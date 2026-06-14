class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        // int max=0;
        int i=0;
        int sum=0;
        while(i<prices.length){
            min = Math.min(min,prices[i]);
            System.out.println(min);
            if(min!=-1 && prices[i]>min){
                sum+=prices[i]- min;
                min=prices[i];
            }
            i++;
        }
        return sum;
    }
}