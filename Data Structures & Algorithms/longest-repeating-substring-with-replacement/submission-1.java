class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq = new int[26];
        char [] ch = s.toCharArray();
        int left = 0;
        int n = s.length();
        int maxFreq = 0;
        int res = 0;
        for(int right =0;right<n;right++)
        {
            freq[ch[right]-'A']++;
            maxFreq = Math.max(freq[ch[right]-'A'],maxFreq);
            if(right-left+1-maxFreq>k)
            {
                freq[ch[left]-'A']--;
                left++;
            }
            res = Math.max(0,right-left+1);
        }
        return res;
    }
}
