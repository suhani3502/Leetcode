class Solution {
    public int[] runningSum(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<nums.length;i++){
            if(!stack.isEmpty()){
                stack.push(nums[i]+stack.peek());
            }
            else{
                stack.push(nums[i]);
            }
        }
        int[] array = new int[stack.size()];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = stack.pop();
        }
        return array;
    }
}