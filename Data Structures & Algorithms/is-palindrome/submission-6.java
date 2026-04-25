class Solution {
    public boolean isPalindrome(String s) {
      char [] res  = s.toLowerCase().toCharArray();
       int n = res.length;
       if(n<=1) return true;
       int i=0,j=n-1;
       for(int p=0;p<n;p++) System.out.print(res[p]);
       while(i<j)
       {
        System.out.print(res[j]);
        while((i<j&&!((res[i]>='a'&&res[i]<='z')||res[i]>='0'&&res[i]<='9'))) i++;
         while((j>i&&!((res[j]>='a'&&res[j]<='z')||res[j]>='0'&&res[j]<='9'))) j--;
        if(res[i]!=res[j]) return false;
        i++;
        j--;
       }
       return true;

    }
}
