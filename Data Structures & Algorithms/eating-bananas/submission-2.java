class Solution {
    public int time(int speed, int [] piles)
    {
        int n = piles.length;
        int t=0;
        for(int i=0;i<n;i++)
        {
    
            t += (int) Math.ceil((double)piles[i]/speed);
        }
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int res = high;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int time_taken = time(mid,piles);
            if(time_taken<=h)
            {
                res = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return res;
    }
}
