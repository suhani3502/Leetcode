class Solution {
    public String[] findWords(String[] words) {
        String[] rows = { "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM" };
        List<String> result = new ArrayList<>();

        for (String word : words) {
            String upperWord = word.toUpperCase();
            int row = -1;

            // Check which row the first character of the word belongs to
            for (int i = 0; i < rows.length; i++) {
                if (rows[i].contains(String.valueOf(upperWord.charAt(0)))) {
                    row = i;
                    break;
                }
            }

            // Check if all characters of the word belong to the same row
            boolean isValid = true;
            for (int i = 1; i < upperWord.length(); i++) {
                if (!rows[row].contains(String.valueOf(upperWord.charAt(i)))) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}

// return ans[] {String(word)};