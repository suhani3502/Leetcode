class Solution {
    public int maximumWealth(int[][] accounts) {
        Stack<Integer> stack=new Stack<>();
        int row= accounts.length;
        int min = Integer.MIN_VALUE;
        int col = accounts[0].length;
        for (int i=0 ; i<row; i++){
            int sum=0;
            for (int j=0;j<col;j++){
                sum=sum+accounts[i][j];
            }
            stack.push(sum);
        }
        while(!stack.isEmpty()){
            min=Math.max(min,stack.pop());
        }
        return min;
    }
}