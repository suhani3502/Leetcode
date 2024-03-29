class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs(char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }
        
        int m = board.length;
        int n = board[0].length;
        
        if (row < 0 || row >= m || col < 0 || col >= n || board[row][col] != word.charAt(index)) {
            return false;
        }
        
        char original = board[row][col];
        board[row][col] = '*';
        
        // Explore the neighbors in all four directions
        boolean found = dfs(board, word, row - 1, col, index + 1) || 
                        dfs(board, word, row + 1, col, index + 1) || 
                        dfs(board, word, row, col - 1, index + 1) ||
                        dfs(board, word, row, col + 1, index + 1);   
        
        board[row][col] = original;
        
        return found;
    }
}
