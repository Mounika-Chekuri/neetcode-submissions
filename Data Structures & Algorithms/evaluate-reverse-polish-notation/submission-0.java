class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s1 = new Stack<Integer>();
        for(String ch : tokens)
        {
            switch(ch)
            {

               case "+" : 
               int n1 = s1.pop();
               int n2 =  s1.pop();
               s1.push(n2+n1);
               break;
               case "-" : 
               n1 = s1.pop();
               n2 =  s1.pop();
               s1.push(n2-n1);
               break;
               case "*" : 
               n1 = s1.pop();
               n2 =  s1.pop();
               s1.push(n2*n1);
               break;
               case "/" : 
               n1 = s1.pop();
               n2 =  s1.pop();
               s1.push(n2/n1);
               break;
               default:
               s1.push(Integer.parseInt(ch));
            }
        }
        return s1.pop();


    }
}
