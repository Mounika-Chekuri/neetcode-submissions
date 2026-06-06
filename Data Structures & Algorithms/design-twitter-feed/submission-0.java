class Twitter {
    private int time;
    private HashMap<Integer, Set<Integer>> followMap;
    private HashMap<Integer, List<int[]>> tweetMap;

    public Twitter() {
        time = 0;
        followMap = new HashMap<>();
        tweetMap = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweetMap.computeIfAbsent(userId, k -> new ArrayList<>())
                .add(new int[]{time, tweetId});
        time--;
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        followMap.computeIfAbsent(userId, k -> new HashSet<>()).add(userId);
        
        for (int followeeId : followMap.get(userId)) {
            List<int[]> tweets = tweetMap.get(followeeId);
            if (tweets != null && !tweets.isEmpty()) {
                int lastIndex = tweets.size() - 1;
                int[] lastTweet = tweets.get(lastIndex);
                pq.offer(new int[]{lastTweet[0], lastTweet[1], followeeId, lastIndex});
            }
        }
        
        while (!pq.isEmpty() && res.size() < 10) {
            int[] curr = pq.poll();
            res.add(curr[1]);
            if (curr[3] - 1 >= 0) {
                List<int[]> tweets = tweetMap.get(curr[2]);
                int nextIndex = curr[3] - 1;
                int[] nextTweet = tweets.get(nextIndex);
                pq.offer(new int[]{nextTweet[0], nextTweet[1], curr[2], nextIndex});
            }
        }
        
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        followMap.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        followMap.getOrDefault(followerId, new HashSet<>()).remove(followeeId);
    }
}
