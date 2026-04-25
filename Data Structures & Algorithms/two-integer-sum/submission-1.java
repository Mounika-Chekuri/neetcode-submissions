class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int [] res = new  int[2];
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int k = target-nums[i];
            if(mp.containsKey(k))
            {
                   int j = mp.get(k);
                   if(i!=j)
                   {
                   res[0]=i;
                   res[1]=j;
                   break;
                   }
            }
        }
        return res;
        
    }
}
