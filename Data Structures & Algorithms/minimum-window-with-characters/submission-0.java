class Solution {
    public boolean isValid(Map<Character,Integer> freq_t,Map<Character,Integer> freq_s)
    {
    
        for(char ch : freq_t.keySet())
        {
            if(!freq_s.containsKey(ch)) return false;
            if(freq_s.get(ch)!=freq_t.get(ch)) return false;
            
        }
        return true;
    }
    public String minWindow(String s, String t) {
        HashMap <Character,Integer> freq_t = new HashMap<>();
        char [] ch_s = s.toCharArray();
        char [] ch_t = t.toCharArray();
        HashMap <Character,Integer> freq_S = new HashMap<>();
        String result = "";
        int res_left=0;
        int res_right=0;
        int n = s.length();
        int res = Integer.MAX_VALUE;
        int have = 0;
        
        for(char ch : ch_t)
        {
            freq_t.put(ch,freq_t.getOrDefault(ch,0)+1);
        }
        int left =0;
        int need = freq_t.size();
        for(int right=0;right<n;right++)
        {
        
           freq_S.put(ch_s[right],freq_S.getOrDefault(ch_s[right],0)+1);
              if (freq_t.containsKey(ch_s[right]) && freq_S.get(ch_s[right]).equals(freq_t.get(ch_s[right]))) {
                have++;
            }
           while(have==need)
           {
             //res = Math.max(res,right-left+1);
             if(res>right-left+1)
             {
                res = right-left+1;
                res_left = left;
                res_right = right;
             }
             freq_S.put(ch_s[left],freq_S.get(ch_s[left])-1);
             if (freq_t.containsKey(ch_s[left]) && freq_S.get(ch_s[left]) < freq_t.get(ch_s[left])) {
                    have--;
                }
             left++;
           }
        }
        if(res==Integer.MAX_VALUE) return "";
        return s.substring(res_left,res_right+1);
    }
}
