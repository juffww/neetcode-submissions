class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++)
        {
            if(stack.empty()) {
                stack.push(i);
                continue;
            }

            int current = temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peek()] < current)
            {
                int topIndex = stack.pop();
                result[topIndex] = i - topIndex;
            }

            stack.push(i);
        }

        return result;
    }
}
