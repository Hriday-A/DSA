class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String[] s1= s.split(" ");
        char[] c=pattern.toCharArray();
        if(s1.length!=pattern.length()) return false;
        for(int i=0;i<c.length;i++){
            if(!map.containsKey(c[i])){
                map.put(c[i],s1[i]);
            }
            if(!map.get(c[i]).equals(s1[i])) return false;
            if(!map2.containsKey(s1[i])){
                map2.put(s1[i],c[i]);
            }
            if(map2.get(s1[i])!=c[i]) return false;
        }
        return true;
    }
}