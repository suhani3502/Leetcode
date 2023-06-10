class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet <Integer> ();

        for (int num:nums){
            hashSet.add(num);
        }

        int longestStreak=0;
        for (int num:nums){
            if(!hashSet.contains(num-1)){
                int CurrentStreak=1;
                int CurrentNum=num;

                while(hashSet.contains(CurrentNum+1)){
                    CurrentNum+=1;
                    CurrentStreak+=1;
                }

                longestStreak =Math.max(longestStreak, CurrentStreak);
            }
        }
        return longestStreak;
    }
}