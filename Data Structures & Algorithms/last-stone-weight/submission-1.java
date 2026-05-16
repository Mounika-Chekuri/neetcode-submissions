class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> queue = new PriorityQueue<>((a,b)->b-a);
        for(int stone : stones)
        {
            queue.add(stone);
        }
        if(queue.size()==1) return queue.poll();
        if(queue.size()==0) return 0;
        while(!queue.isEmpty())
        {
            int size = queue.size();
        
            int s1 = queue.poll();
            int s2 = queue.poll();
            if(s1!=s2) queue.add(s1-s2);
            if(queue.size()==1) return queue.poll();

        }
        return 0;

        
    }
}
