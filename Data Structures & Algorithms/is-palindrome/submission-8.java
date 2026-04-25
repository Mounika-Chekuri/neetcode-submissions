class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        char [] ch = s1.toCharArray();
        int n = ch.length;
        int i=0,j=n-1;
        while(i<j)
        {
            if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='0'&&ch[i]<='9'))
            {
                if((ch[j]>='a'&&ch[j]<='z')||(ch[j]>='0'&&ch[j]<='9'))
                {
                    if(ch[i]!=ch[j]) return false;
                    i++;
                    j--;
                }
                else j--;
            }
            else i++;
        }
        return true;
    }
}
