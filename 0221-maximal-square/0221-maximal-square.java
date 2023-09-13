class Solution {
    public int maximalSquare(char[][] matrix) {
        int n=matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        int max=0;
        
        if (matrix==null || n ==0 || m==0) return 0;
        
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (matrix[i][j]=='1'){
                    if (i==0 || j==0){
                        dp[i][j]=1;
                    }
                    else {
                        dp[i][j]= Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1])+1;
                    }
                }
                max= Math.max(max,dp[i][j]);
            }
        }
        return max*max;
        
    }
}