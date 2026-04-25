class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> u = new HashSet<>();
      for(int i=0;i<nums.length;i++)
      {
        if(u.contains(nums[i]))
        {
            return true;
        }
        u.add(nums[i]);
      }
      return false;
    }
}
