class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<sc.length;i++){
            if(!map.containsKey(sc[i])){
                map.put(sc[i],tc[i]);
            }
            if(map.get(sc[i])!=tc[i]) return false;
            if(!map2.containsKey(tc[i])){
                map2.put(tc[i],sc[i]);
            }
            if(map2.get(tc[i])!=sc[i]) return false;
        }
        return true;
    }
}