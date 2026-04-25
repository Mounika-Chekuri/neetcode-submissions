class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n : nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
       PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
       for (int key : map.keySet()) {
    int v = map.get(key);
    pq.offer(new int[]{key, v}); 
}
        int [] res = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i] =  pq.poll()[0]; 
          //  pq.remove();
        }
        return res;
    }
}
