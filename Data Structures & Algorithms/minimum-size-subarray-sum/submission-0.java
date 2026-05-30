class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start =0;
        int sum = 0;
        int n = nums.length;
        int len = Integer.MAX_VALUE;
        for(int end=0;end<n;end++)
        {
            sum+=nums[end];
            while(sum>=target)
            {
              len = Math.min(len,end-start+1);
              sum = sum-nums[start++];
            }
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}