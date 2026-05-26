class Solution {
    public int characterReplacement(String s, int k) {
        int [] count = new int[26];
        char [] ch = s.toCharArray();
        int maxFreq = 0;
        int n = ch.length;
        int start = 0;
        int res = 0;
        for(int end =0;end<n;end++)
        {
            count[ch[end]-'A']++;
            maxFreq = Math.max(maxFreq,count[ch[end]-'A']);
            while(end-start+1-maxFreq>k)
            {
                count[ch[start]-'A']--;
                start++;
            }
            res = Math.max(res,end-start+1);

        }
        return res;

    }
}
