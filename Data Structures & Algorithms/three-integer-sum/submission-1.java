class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> s = new HashSet();
        ArrayList<List<Integer>> triplets = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
           int target = -1*nums[i];
           int j=i+1;
           int k = n-1;
           while(j<k)
           {
              if(nums[j]+nums[k]==target)
              {
                List<Integer> res = new ArrayList<>();
                res.add(nums[i]);
                res.add(nums[j++]);
                res.add(nums[k--]);
                if(s.contains(res)) continue;
                s.add(res);
                triplets.add(res);
               

              }
              else if(nums[j]+nums[k]<target)
              {
                j++;
              }
              else k--;
           }
        }
        return triplets;
        
    }
}
