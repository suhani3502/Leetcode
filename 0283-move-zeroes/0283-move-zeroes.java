class Solution {
    public void moveZeroes(int[] nums) {
        Stack <Integer> stack=new Stack<>();
        for (int i=0; i<nums.length;i++){
            if(nums[i]!=0) stack.push(nums[i]);
            else continue;
        }
        for (int i=0 ; i<nums.length;i++){
            if (nums[i]==0){
                stack.push(nums[i]);
            }
        }
        for (int i=nums.length-1 ; i>=0 ; i--){
            nums[i]=stack.pop();
        }
    }
}