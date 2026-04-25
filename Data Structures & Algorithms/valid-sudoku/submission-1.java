class Solution {
    public boolean check_row(int r,char [][] board)
    {
        Set<Character> visited = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            if(board[r][i]=='.') continue;
            if(!visited.contains(board[r][i]))
            {
                visited.add(board[r][i]);
            }
            else return false;
        }
        return true;
    }
      public boolean check_column(int c,char [][] board)
    {
        Set<Character> visited = new HashSet<>();
        for(int i=0;i<9;i++)
        {
             if(board[i][c]=='.') continue;
            if(!visited.contains(board[i][c]))
            {
                visited.add(board[i][c]);
            }
            else return false;
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            if(!check_row(i,board)) return false;
            if(!check_column(i,board)) return false;
        }
           for (int i = 0; i < 3; i++) {
            Set<Character> visited  = new HashSet<>();
            Set<Character> visited1 = new HashSet<>();
            Set<Character> visited2 = new HashSet<>();
            for (int row = i * 3; row < i * 3 + 3; row++) {  // rows 0-2, 3-5, 6-8
                for (int j = 0; j < 3; j++) {
                    if (board[row][j] == '.') continue;
                    if (!visited.contains(board[row][j])) visited.add(board[row][j]);
                    else return false;
                }
                for (int j = 3; j < 6; j++) {
                    if (board[row][j] == '.') continue;
                    if (!visited1.contains(board[row][j])) visited1.add(board[row][j]);
                    else return false;
                }
                for (int j = 6; j < 9; j++) {
                    if (board[row][j] == '.') continue;
                    if (!visited2.contains(board[row][j])) visited2.add(board[row][j]);
                    else return false;
                }
            }
        }
        return true;
    }
}
