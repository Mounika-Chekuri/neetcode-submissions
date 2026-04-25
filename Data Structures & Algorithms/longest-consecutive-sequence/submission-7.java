class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int c=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            int j=i;
            c=0;
            while(j<n-1)
            {
                if((nums[j]+1==nums[j+1])||(nums[j]==nums[j+1]))
                {
                       if(nums[j]==nums[j+1]) c++;
                    j++;
                }
                else break;
            }
            res = Math.max(res,j-i-c+1);
        }
       return res;
    }
}
