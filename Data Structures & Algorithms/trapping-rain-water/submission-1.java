class Solution {
    public int trap(int[] height) {
       
        int res = 0;
        int n = height.length;
        int [] left = new int[n];
        int [] right = new int[n];
        left[0] = height[0];
        right[n-1] = height[n-1];
        for(int i=1;i<n;i++)
        {
            left[i] = Math.max(left[i-1],height[i]);
        }
        for(int j=n-2;j>=0;j--)
        {
            right[j] = Math.max(right[j+1],height[j]);
        }
        int low=0;
        int high = n-1;
        for(int i=0;i<n;i++)
        {
           int area = Math.max(0,Math.min(left[i],right[i])-height[i]);

           res += area;
        }
        return res;
    }
        
    
}
