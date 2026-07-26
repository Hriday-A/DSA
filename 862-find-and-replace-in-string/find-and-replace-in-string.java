class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            map.computeIfAbsent(indices[i], k -> new ArrayList<>()).add(i);
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