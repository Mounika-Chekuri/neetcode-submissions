class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        int len=0;
        char [] ch = s.toCharArray();
        int n = ch.length;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(ch[i]))
            {
                 map.put(ch[i],1);
                 len++;
                 maxlen = Math.max(maxlen,len);
            }
            else
            {
               while(map.containsKey(ch[i])&&j<n)
               {
                 map.remove(ch[j]);
                 j++;
                 len--;
               }
               map.put(ch[i],1);
               len++;
            }
        }
        return maxlen;
    }
}

