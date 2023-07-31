class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        Map<Character, Integer> frequencyP = new HashMap<>();
        for (char ch : p.toCharArray()) {
            frequencyP.put(ch, frequencyP.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int count = p.length();

        while (right < s.length()) {
            char chRight = s.charAt(right);
            
            if (frequencyP.containsKey(chRight)) {
                frequencyP.put(chRight, frequencyP.get(chRight) - 1);
                if (frequencyP.get(chRight) >= 0) {
                    count--;
                }
            }

            if (right - left + 1 == p.length()) {
                if (count == 0) {
                    result.add(left);
                }

                char chLeft = s.charAt(left);
                if (frequencyP.containsKey(chLeft)) {
                    frequencyP.put(chLeft, frequencyP.get(chLeft) + 1);
                    if (frequencyP.get(chLeft) > 0) {
                        count++;
                    }
                }
                left++;
            }

            right++;
        }

        return result;
    }
}