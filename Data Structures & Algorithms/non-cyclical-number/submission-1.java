class Solution {
    public boolean isHappy(int n) {
       Set<Integer> unique = new HashSet<>();
      while(!unique.contains(n))
      {
        unique.add(n);
        n = sumOfSquareDigits(n);
        if(n==1) return true;
        
        
      }
    
      return false;  
    }
    public int sumOfSquareDigits(int n)
    {
        int sum = 0;
         while(n>0)
         {
            int r = n%10;
            sum = sum+r*r;
            n=n/10;
         }
         return sum;
    }
}
