class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int prev = 0;
        int curr = 0;

        int[] result = new int[n];

        Stack<Integer> st = new Stack<>();

        for (String log : logs) {

            String[] arr = log.split(":");

            int task = Integer.parseInt(arr[0]);
            curr = Integer.parseInt(arr[2]);

            if (arr[1].equals("start")) {

                if (!st.isEmpty()) {
                    result[st.peek()] += curr - prev;
                }

                st.push(task);
                prev = curr;

            } else {

                int popped = st.pop();

                result[popped] += curr - prev + 1;

                prev = curr + 1;
            }
        }

        return result;
    }
}