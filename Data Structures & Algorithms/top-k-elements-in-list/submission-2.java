class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n  = nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int key : map.keySet())
        {
            pq.offer(new int[]{key,map.get(key)});
        }
        int [] res = new int[k];
        for(int i=0;i<k;i++)
        {
           res[i] = pq.poll()[0];
        }
        return res;
    }
}
