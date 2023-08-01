class Solution {
    public int maxProduct(String[] words) {
        if (words == null || words.length == 0) {
            return 0;
        }

        int[] wordMasks = new int[words.length];
        int maxProduct = 0;

        // Convert each word into a bitmask
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int wordMask = 0;
            for (char ch : word.toCharArray()) {
                wordMask |= 1 << (ch - 'a');
            }
            wordMasks[i] = wordMask;
        }

        // Calculate the product of lengths for each pair of words
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((wordMasks[i] & wordMasks[j]) == 0) {
                    int product = words[i].length() * words[j].length();
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }

        return maxProduct;
    }
}