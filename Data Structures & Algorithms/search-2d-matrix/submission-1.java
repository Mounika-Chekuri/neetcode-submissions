class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        int row_len = matrix.length;
        int col_len = matrix[0].length;
        int r = 0;
        int c = col_len-1;
        while(r<row_len && c>=0)
        {
            
            if(matrix[r][c]==target) return true;
            if(matrix[r][c]>target)
            {
                 c--;
            }
            else if(matrix[r][c]<target)
            {
                r++;
            }
        }
        return false;
        
    }
}
