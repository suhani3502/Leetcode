class Solution {
    private void permutations (int index, int[] nums, List<List<Integer>> ans){
        List<Integer> ds= new ArrayList<>();
        if(index==nums.length){
            for (int i=0; i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList(ds));
            return;
        }
        
        for (int i=index; i<nums.length;i++){
            swap(i,index,nums);
            permutations(index+1, nums, ans);
            swap(i,index,nums);
        }
    }
    
    void swap (int i,int j, int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(0,nums,ans);
        return ans;
    }
}