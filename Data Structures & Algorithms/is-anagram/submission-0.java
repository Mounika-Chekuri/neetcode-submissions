class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;
      int [] ch = new int[26];
      char[] ch_s = s.toCharArray();
      char [] ch_t = t.toCharArray();
      
      for(char p : ch_s)
      {
           ch[p-'a']++;
          
      }
     
      for(char c : ch_t)
      {
        ch[c-'a']--;
       
      }
      for(int i=0;i<26;i++)
      {
        if(ch[i]!=0) return false;
      }
      return true;
    }
}
