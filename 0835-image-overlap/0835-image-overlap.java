class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int N = img1.length;
        int maxOverlap=0;
        for (int rowOffset=-N+1 ; rowOffset<N; rowOffset++){
            for (int colOffset= -N+1; colOffset<N; colOffset++){
                int overlapCount=0;
                for (int row = 0; row < N; row++) {
                    for (int col = 0; col < N; col++) {
                        int rA = row + rowOffset;
                        int cA = col + colOffset;
                        
                        if (rA >= 0 && rA < N && cA >= 0 && cA < N && img1[rA][cA] == 1 && img2[row][col] == 1) {
                            overlapCount++;
                        }
                    }
                }

                maxOverlap = Math.max(maxOverlap, overlapCount);
            }
        }
        return maxOverlap;
    }
}