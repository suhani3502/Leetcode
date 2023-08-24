class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size();
        for (int row = rows-2; row>=0; row--){
            for (int col=0; col<=row; col++){
                int current= triangle.get(row).get(col);
                int min=Math.min(triangle.get(row+1).get(col), triangle.get(row+1).get(col+1));
                triangle.get(row).set(col, current + min);
            }
        }
        return triangle.get(0).get(0);
    }
}