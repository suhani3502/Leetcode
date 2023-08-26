class Solution {
    public int lengthLongestPath(String input) {
        String entries[]= input.split("\n");
        int[] levelLengths = new int[entries.length + 1]; 
        int maxLength = 0;
        
        for (String entry : entries) {
            int level = entry.lastIndexOf("\t") + 2; 
            int length = entry.length() - (level - 1); 
            
            if (entry.contains(".")) {
                maxLength = Math.max(maxLength, levelLengths[level - 1] + length); 
            } else { 
                levelLengths[level] = levelLengths[level - 1] + length + 1;
            }
        }
        
        return maxLength;
    }
}