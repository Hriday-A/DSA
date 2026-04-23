class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l =0;
        int r = n-1;
        int max=0;
        while(l<r){
            int curr = Math.min(height[l],height[r]);
            int area = curr*(r-l);
            max= Math.max(max,area);
            if(height[l]<=height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}