class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char [] ch = s.toCharArray();
        for(char c : ch)
        {
            if(c==')')
            {
                 if((!stack.isEmpty())&&stack.peek()=='(') stack.pop();
                 else return false;
            }
            else if(c=='}')
            {
                 if((!stack.isEmpty())&&stack.peek()=='{') stack.pop();
                 else return false;
            }
            else if(c==']')
            {
                 if((!stack.isEmpty())&&stack.peek()=='[') stack.pop();
                 else return false;
            }
            else stack.push(c);
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
