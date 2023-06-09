class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null ||prices.length==0) return 0;
        int min =prices[0];
        int max = Integer.MIN_VALUE;
        
        for (int i=0; i<prices.length;i++){
            int cost= prices[i]-min;
            if(cost>max) max=cost;
            if (prices[i]<min) min=prices[i];
        }
        return max;
        
    }
}