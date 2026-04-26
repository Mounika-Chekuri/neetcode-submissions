class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max = -10001;
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        PriorityQueue<int []> queue = new PriorityQueue<>((int [] a,int [] b)-> b[0]-a[0]);
        for(int i=0;i<k;i++)
        {
           
            queue.add(new int[]{nums[i],i});
        }
        res.add(queue.peek()[0]);
        int left = 0;
        for(int i=k;i<n;i++)
        {

             if(nums[left]==queue.peek()[0])
             {
                queue.remove();
                while(!queue.isEmpty()&&queue.peek()[1]<=left)
                {
                     queue.remove();
                }
                //left++;
             }
             queue.add(new int[]{nums[i],i});
             res.add(queue.peek()[0]);
             left++;
        }
       return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
