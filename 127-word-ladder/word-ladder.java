class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);

        if (!set.contains(endWord)) {
            return 0;
        }
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int level =1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String s = q.poll();
                char[] schar= s.toCharArray();
                for(int j=0;j<schar.length;j++){
                    char org= schar[j];
                    for(char c='a';c<='z';c++){
                        if(schar[j]==c) continue;
                        schar[j]=c;
                        String newWord = new String(schar);
                        if(newWord.equals(endWord)) return level+1;
                        if(set.contains(newWord)){
                            q.add(newWord);
                            set.remove(newWord);
                        }
                    }
                     schar[j]=org; // restoring the orginal value 
                }
            }
            level++;
        }
        return 0;
     }
}
   