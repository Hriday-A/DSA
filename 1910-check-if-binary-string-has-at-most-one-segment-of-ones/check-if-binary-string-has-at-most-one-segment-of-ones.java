class Solution {
    public boolean checkOnesSegment(String s) {
        int seen1 = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)-'0'==1) seen1 = 1;
            if(s.charAt(i)-'0'==0 && seen1 == 1){
                return false;
            }
        }
        return true;
    }
}