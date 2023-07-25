class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        int n = strs[0].length(); // Length of each string in the array

        for (int j = 0; j < n; ++j) {
            for (int i = 1; i < strs.length; ++i) {
                if (strs[i].charAt(j) < strs[i - 1].charAt(j)) {
                    ++count;
                    break;
                }
            }
        }

        return count;
    }
}
