class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0) return 0;
        int maxres=-1;
        for(int i=0;i<n;i++)
        {
            int j=i;
            int c=0;
            while(j<n-1&&(nums[j]+1==nums[j+1]||nums[j]==nums[j+1]))
            {
             
               if(nums[j]==nums[j+1]) c++;

             
                j++;
            }
           maxres = Math.max(maxres,j-i+1-c);
        }
        return maxres;
        
    }
}
