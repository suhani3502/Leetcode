class Solution {
    public int maximizeGreatness(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for (int i=0, j=1; j<nums.length;j++){
            if(nums[i]<nums[j]){
                ans++;
                i++;
            }
        }
        return ans;
    }
}