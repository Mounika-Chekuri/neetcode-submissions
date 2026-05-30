class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int [] count_freq_s1 = new int[26];
        int [] count_freq_s2 = new int[26];
        int n = s1.length();
        for(int i=0;i<n;i++)
        {
            count_freq_s1[s1.charAt(i)-'a']++;
            count_freq_s2[s2.charAt(i)-'a']++;
        }
        
        int matches = 0;
        for(int i=0;i<26;i++)
        {
            if(count_freq_s1[i]==count_freq_s2[i]) matches++;
        }
        if(matches==26) return true;
        int start=0;
        for(int i=n;i<s2.length();i++)
        {
            int left = s2.charAt(start) - 'a';
if(count_freq_s2[left] == count_freq_s1[left]) matches--; 
count_freq_s2[left]--;
if(count_freq_s2[left] == count_freq_s1[left]) matches++; 

int right = s2.charAt(i) - 'a';
if(count_freq_s2[right] == count_freq_s1[right]) matches--;
count_freq_s2[right]++;
if(count_freq_s2[right] == count_freq_s1[right]) matches++; 

start++;
if(matches == 26) return true;
           // if(Arrays.equals(count_freq_s1,count_freq_s2)) return true;
           if(matches==26) return true;
           
        }
        return false;
        
    }
}
