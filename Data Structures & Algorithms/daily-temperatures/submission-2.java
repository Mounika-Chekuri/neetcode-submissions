class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        int[] stack = new int[n]; // array-based stack, no boxing overhead
        int top = -1;

        for (int i = 0; i < n; i++) {
            // Pop indices whose temperature is now resolved
            while (top != -1 && temperatures[stack[top]] < temperatures[i]) {
                int idx = stack[top--];
                res[idx] = i - idx; // days waited = current index - stored index
            }
            stack[++top] = i;
        }
        return res;
    }
}

