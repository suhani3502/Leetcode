class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] ans = new int[n*m];
        int l=0;
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                    ans[l++]=matrix[i][j];   
            }
        }
        Arrays.sort(ans);
        return ans[k-1];
    }
}