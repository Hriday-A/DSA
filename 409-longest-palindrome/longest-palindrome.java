class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int count = 0;
        boolean hasOdd= false;
        for(int i:map.values()){
            if(i%2==0){
                count= count+i;
            }else {
                count = count+(i-1);
                hasOdd= true;
            }
        }
        if (hasOdd){
            count=count +1;
        }
        return count;

    }
}