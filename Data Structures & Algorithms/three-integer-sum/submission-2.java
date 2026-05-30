// nums = [-1,0,1,2,-1,4]
// O/p->  [[-1,-1,2],[-1,0,1]]

//Arrays.sort => [-1,-1,0,1,2,4]

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n  = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            
            int target = nums[i]*-1;
            int low = i+1;
            int high = n-1;
            while(low<high)
            {
            
                if(nums[low]+nums[high]==target)
                {
                  List<Integer> triplet = new ArrayList<>();
                  triplet.add(nums[i]);
                   triplet.add(nums[low]);
                    triplet.add(nums[high]);

                  if(!s.contains(triplet))
                  {
                  res.add(triplet);
                  s.add(triplet);
                  }
                  low++;
                }
               else  if(nums[low]+nums[high]<target)
               {
                low++;
               }
               else high--;
            }

        }
        return res;
        
    }
}
