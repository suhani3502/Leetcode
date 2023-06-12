class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans =0;
        int cnt=0;
        
        for (final int num: nums){
            if(num==1){
                cnt++;
                ans=Math.max(ans,cnt);
            }
            else{
                cnt=0;   
            }
        }
        return ans;
    }
}