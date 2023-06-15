class Solution {
    public int singleNonDuplicate(int[] nums) {
        int elem=0;
        for (int i=0; i<nums.length;i++){
            elem=elem^nums[i];
            
        }
        return elem;
        
    }
}