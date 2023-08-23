class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=nums[0];
        for (int i=1; i<nums.length; i++){
            xor = xor^nums[i];
        }
        int diffBit = 1;
        while ((xor & diffBit) == 0) {
            diffBit <<= 1;
        }
        
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & diffBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        
        return new int[]{num1, num2};
    }
}