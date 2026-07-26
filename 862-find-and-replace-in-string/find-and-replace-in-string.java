class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            List<Integer> list = map.getOrDefault(indices[i], new ArrayList<>());
            list.add(i);
            map.put(indices[i], list);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();

        while (i < n) {
            if (map.containsKey(i)) {
                boolean replaced = false;
                for (int l : map.get(i)) {
                    int m = sources[l].length();
                    if (i + m <= n &&
                        s.substring(i, i + m).equals(sources[l])) {
                        sb.append(targets[l]);
                        i += m;
                        replaced = true;
                        break;
                    }
                }
                if (replaced) {
                    continue;
                }
            }
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}