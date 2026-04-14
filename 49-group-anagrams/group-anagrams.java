class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){ // --> str='eat','ate',.....
            char[] charArr = str.toCharArray();//['e','a','t']
            Arrays.sort(charArr);// ['a','e','t']
            String sorted = String.valueOf(charArr); // sorted = 'aet'
            if (!map.containsKey(sorted)){ // checking if sorted (aet) already exists or not in the hashmap
                map.put(sorted, new ArrayList<>()); // it doesnt, we add 
            } // but if it does 
            List<String> li = map.get(sorted); // we first call the list to the corresponding key to add the value in
            li.add(str); // we add the value in the list
            map.put(sorted,li); // we updated the HashMap in we new values 
        }
        return new ArrayList<>(map.values()); // we create a new Arraylist that is combination of all the values of our map
    }
}