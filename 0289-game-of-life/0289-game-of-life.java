class Solution {
        public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] nextGen = new int[n][m]; // Store the next generation state

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                int count = 0; // Reset the count for each cell

                for (int drow = -1; drow <= 1; drow++) {
                    for (int dcol = -1; dcol <= 1; dcol++) {
                        if (drow == 0 && dcol == 0) continue; // Skip the current cell
                        int nrow = row + drow;
                        int ncol = col + dcol;
                        if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && board[nrow][ncol] == 1) {
                            count++;
                        }
                    }
                }
                if (board[row][col] == 1 && (count < 2 || count > 3)) {
                // Any live cell with fewer than two live neighbors dies
                // Any live cell with more than three live neighbors dies
                nextGen[row][col] = 0;
                } else if (board[row][col] == 0 && count == 3) {
                // Any dead cell with exactly three live neighbors becomes a live cell
                    nextGen[row][col] = 1;
                } else {
                // Otherwise, the cell state remains the same
                    nextGen[row][col] = board[row][col];
                }
            }
        }  


        // Copy the next generation state back to the original board
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                board[row][col] = nextGen[row][col];
            }
        }
    }
}
