class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        char[] charArr= pattern.toCharArray();
        String[] words = s.split("\\s+");
        int cl= charArr.length;
        int wl = words.length;
        if(cl!=wl) return false;
        for(int i=0;i<cl;i++){
            char c = charArr[i];
            String word = words[i];

            if (map1.containsKey(c)) {
                if (!word.equals(map1.get(c))) return false;
            } else {
                map1.put(c, word);
            }

            if (map2.containsKey(word)) {
                if (map2.get(word) != c) return false;
            } else {
                map2.put(word, c);
            }
        }
        return true;
    }
}