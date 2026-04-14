class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sl= s.length();
        int tl=t.length();
        if (sl!=tl) return false;
        HashMap <Character,Character> smap = new HashMap<>();
        HashMap <Character,Character> tmap = new HashMap<>();
        for(int i=0;i<sl;i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (smap.containsKey(schar)){
                if (tchar!=smap.get(schar)) return false;
            }else{
                smap.put(schar,tchar);
            }
            if (tmap.containsKey(tchar)){
                if (schar!=tmap.get(tchar)) return false;
            }else{
                tmap.put(tchar,schar);
            }
        }
        return true;

    }
}