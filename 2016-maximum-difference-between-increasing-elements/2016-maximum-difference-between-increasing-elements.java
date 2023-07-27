class Solution {
    public int maximumDifference(int[] nums) {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            if(nums[i]<nums[j]){
                int diff=nums[j]-nums[i];
                max =Math.max(max,diff);
            }
        }
        if(max!=Integer.MIN_VALUE) return max;
        else return -1;
    }
}