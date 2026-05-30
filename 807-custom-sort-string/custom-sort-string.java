class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(char c: order.toCharArray()){
            if(map.containsKey(c)){
                int t = map.get(c);
                for(int k =0;k<t;k++){
                    sb.append(c);
                }
                map.remove(c);
            }
        }
        for(char c: map.keySet())
        {
            int t = map.get(c);
            for(int k =0;k<t;k++){
                sb.append(c);
            }
            // map.remove(c);
        }
        return sb.toString();
    }
}