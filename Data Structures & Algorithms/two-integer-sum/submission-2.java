class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int [] res = new  int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            int k = target-nums[i];
            if(mp.containsKey(k))
            {
                   int j = mp.get(k);
                   res[0]=j;
                   res[1]=i;
                   break;
            }
            mp.put(nums[i],i);
        }
        return res;
        
    }
}
