class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] prev = new int [n];
        prev[0]=1;
        int[] suff = new int[n];
        suff[n-1]=1;
        for(int i=1;i<n;i++)
        {
            prev[i]=nums[i-1]*prev[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            suff[i]=nums[i+1]*suff[i+1];
        }
        int [] res = new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=prev[i]*suff[i];
        } 
        return res;
    }
}  
