class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        boolean hasOdd = false;

        for (int freq : map.values()) {
            count += freq - (freq % 2);

            if (freq % 2 == 1) {
                hasOdd = true;
            }
        }

        if (hasOdd) {
            count++;
        }

        return count;
    }
}
