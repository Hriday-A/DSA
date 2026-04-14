class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sl= s.length();
        int tl=t.length();
        if (sl!=tl) return false;
        HashMap <Character,Character> smap = new HashMap<>();
        HashMap <Character,Character> tmap = new HashMap<>();
        for(int i=0;i<sl;i++){
            char schar = s.charAt(i);// each character indidvually 
            char tchar = t.charAt(i);
            if (smap.containsKey(schar)){ // check if already a value is there 
                if (tchar!=smap.get(schar)) return false; //checks if for that schar if tchar is same or diff 
            }else{
                smap.put(schar,tchar); // puts the value if not there 
            }
            if (tmap.containsKey(tchar)){
                if (schar!=tmap.get(tchar)) return false; // same for tmap to check if vice versa is true 
            }else{
                tmap.put(tchar,schar);
            }
        }
        return true;

    }
}