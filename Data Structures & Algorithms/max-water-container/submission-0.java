class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int n = heights.length;
        int i=0,j=n-1;
        while(i<j)
        {
           int area = Math.min(heights[i],heights[j])*(j-i);
           if(heights[i]<heights[j]) i++;
           else j--;
           res = Math.max(res,area);
        }
        return res;
    }
}
