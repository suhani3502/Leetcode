class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        int row = board.length;
        int col= board[0].length;
        for(int i=0; i<row;i++){
            for (int j=0; j<col;j++){
                char nums =board[i][j];
                if (nums!='.'){
                    if((!seen.add("r"+nums+i)) || (!seen.add("c"+nums+j)) || (!seen.add("s"+nums+i/3+j/3))) return false;
                }
            }
        }
        return true;
    }
}