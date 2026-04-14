class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){ // --> str='eat','ate',.....
            char[] charArr = str.toCharArray();//['e','a','t']
            Arrays.sort(charArr);// ['a','e','t']
            String sorted = String.valueOf(charArr); // sorted = 'aet'
            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            List<String> li = map.get(sorted);
            li.add(str);
            map.put(sorted,li);
        }
        return new ArrayList<>(map.values());
    }
}