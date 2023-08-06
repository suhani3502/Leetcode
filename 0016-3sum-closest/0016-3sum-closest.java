class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=Integer.MAX_VALUE;
        int closestSum=0;
        int sum=0;
        for (int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                for (int k=j+1 ; k<nums.length;k++){
                    sum=nums[i]+nums[j]+nums[k];
                    int diff = Math.abs(target-sum);
                    if(diff<ans){
                        ans=diff;
                        closestSum=sum;
                    }
                }
            }
        }
        return closestSum;
    }
}