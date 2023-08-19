class Solution {
    public int[] swap(int i , int j, int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return nums;
    }
    public List<Integer> ArrayToList(int[] nums){
        List<Integer> list= new ArrayList<>();
        for (int i=0; i<nums.length;i++){
            list.add(nums[i]);
        }
        return list;
    }
    public void permute (int start , Set<List<Integer>> result , int[] nums){
        if(start==nums.length){
            result.add(ArrayToList(nums));
        }
        for (int i=start ; i<nums.length;i++){
            swap(i,start,nums);
            permute(start+1, result, nums);
            swap(i, start, nums);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        permute(0, ans, nums);
        return new ArrayList<>(ans);
    }
}