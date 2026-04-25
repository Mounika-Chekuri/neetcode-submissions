class Solution {
    public boolean isAnagram(String s, String t) {
          HashMap<Character,Integer> map = new HashMap<>();
          for(char ch : s.toCharArray())
          {
            map.put(ch,map.getOrDefault(ch,0)+1);
          }
          for(char ch : t.toCharArray())
          {
            map.put(ch,map.getOrDefault(ch,0)-1);
          }
          for(int v : map.values())
          {
            if(v!=0) return false;
          }
      return true;
    }
}
