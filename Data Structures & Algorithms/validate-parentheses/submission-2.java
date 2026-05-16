class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char value : s.toCharArray())
        {
            if(value == '{' || value == '[' || value == '(' ) stack.push(value);
            else 
            {
                if(stack.empty()) return false;
                char top = stack.pop();

                if(value == '}' && top != '{') return false; 
                if(value == ']' && top != '[') return false;
                if(value == ')' && top != '(') return false;
            }
        }

        return stack.empty();
    }
}
