class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] result = new char[n][m];
        
        for (int i = 0; i < m; i++) {
            int obstacleIdx = n - 1;
            
            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '#') {
                    char temp = box[i][j];
                    box[i][j] = box[i][obstacleIdx];
                    box[i][obstacleIdx] = temp;
                    obstacleIdx--;
                } else if (box[i][j] == '*') {
                    obstacleIdx = j - 1;
                }
            }
            
            for (int j = 0; j < n; j++) {
                result[j][m - i - 1] = box[i][j];
            }
        }
        
        return result;
    }
}