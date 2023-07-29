class Solution {
        public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] vis = new int[n][m]; 

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                int count = 0; 

                for (int drow = -1; drow <= 1; drow++) {
                    for (int dcol = -1; dcol <= 1; dcol++) {
                        if (drow == 0 && dcol == 0) continue; 
                        int nrow = row + drow;
                        int ncol = col + dcol;
                        if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && board[nrow][ncol] == 1) {
                            count++;
                        }
                    }
                }
                if (board[row][col] == 1 && (count < 2 || count > 3)) {
                vis[row][col] = 0;
                } else if (board[row][col] == 0 && count == 3) {
                    vis[row][col] = 1;
                } else {
                    vis[row][col] = board[row][col];
                }
            }
        }  

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                board[row][col] = vis[row][col];
            }
        }
    }
}
