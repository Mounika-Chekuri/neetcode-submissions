class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] res = new int[n];
        Stack<Integer> s1 = new Stack<Integer>();
        res[n-1]=0;
        s1.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
          int top = s1.peek();
          if(temperatures[top]<=temperatures[i])
          {
            while(!s1.isEmpty()&&temperatures[top]<=temperatures[i])
            {
              
              s1.pop();
              if(!s1.isEmpty()) top = s1.peek();
             // s1.push(i);
            }
            if(s1.isEmpty())
            {
              // s1.push(i);
               res[i]=0; 
            }
            else res[i] = s1.peek()-i;
            s1.push(i);
          }
          else if(temperatures[top]>temperatures[i])
          {
            res[i]=top-i;
            s1.push(i);
          }
        }
        return res;
    }
}
