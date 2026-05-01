class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i;
        int row_len = matrix.length;
        int col_len = matrix[0].length;
        int row=-1;
        for(i=0;i<row_len;i++)
        {
            if(matrix[i][0]<=target && matrix[i][col_len-1]>=target)
            {
                row = i;
                break;
            }
        }
        if(row==-1) return false;
        int low = 0;
        int high = col_len-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(matrix[row][mid]==target) return true;
            if(matrix[row][mid]>target)
            {
                 high = mid-1;
            }
            else if(matrix[row][mid]<target)
            {
                low = mid+1;
            }
        }
        return false;
        
    }
}
