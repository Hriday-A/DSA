class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        for(int i=0;i<c1.length;i++){
            counts1[c1[i] - 'a']++;
            counts2[c2[i] - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
                if (counts1[i] != counts2[i]) {
                    return false;
                }
            }

            return true;
    }
}