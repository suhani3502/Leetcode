class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l=j+1 ; l<nums.length;l++){
                    if (nums[i] == nums[j] && nums[j]==nums[l]) {
                        nums[l] = '_';
                    } else {
                        break; // Stop the loop as soon as a non-duplicate element is found
                    }
                }
            }
        }
        
        int validIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != '_') {
                nums[validIndex++] = nums[i];
            }
        }
        
        return validIndex;
    }
}