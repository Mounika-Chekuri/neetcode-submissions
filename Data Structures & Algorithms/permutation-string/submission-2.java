class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int [] count_freq_s1 = new int[26];
        int [] count_freq_s2 = new int[26];
        int n = s1.length();
        for(int i=0;i<n;i++)
        {
            count_freq_s1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++)
        {
            count_freq_s2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(count_freq_s1,count_freq_s2)) return true;
        int start=0;
        for(int i=n;i<s2.length();i++)
        {
            count_freq_s2[s2.charAt(start++)-'a']--;
            count_freq_s2[s2.charAt(i)-'a']++;
            if(Arrays.equals(count_freq_s1,count_freq_s2)) return true;
           
        }
        return false;
        
    }
}
