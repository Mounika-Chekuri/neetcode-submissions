class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> h1 = new HashMap<>();
        Map<Character,Integer> h2 = new HashMap<>();
        int n = s2.length();
        int window_size = s1.length();
        char [] ch = s1.toCharArray();
        char []  ch2 = s2.toCharArray();
        for(char t : ch)
        {
            h1.put(t,h1.getOrDefault(t,0)+1);
        }
        int start=0;
        for(int end=0;end<n;end++)
        {
            h2.put(ch2[end], h2.getOrDefault(ch2[end], 0) + 1);
            if(end-start+1>window_size)
            {
                int a = h2.get(ch2[start]);
                if(a==1) h2.remove(ch2[start]);
                else h2.put(ch2[start],a-1);
                start++;
            }
            if(end-start+1==window_size)
            {
                 if(h1.equals(h2)) return true;
            }
        }
        return false;
    }
}
