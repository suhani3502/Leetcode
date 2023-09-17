class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counts1 = new HashMap<>();
        Map<Integer, Integer> counts2 = new HashMap<>();

        // Populate counts1 with the counts of elements in nums1
        for (int num : nums1) {
            counts1.put(num, counts1.getOrDefault(num, 0) + 1);
        }

        // Populate counts2 with the counts of elements in nums2
        for (int num : nums2) {
            counts2.put(num, counts2.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersectionList = new ArrayList<>();

        // Iterate through the elements in counts1
        for (Map.Entry<Integer, Integer> entry : counts1.entrySet()) {
            int num = entry.getKey();
            int count1 = entry.getValue();

            // If the element is also present in counts2, find the minimum count
            if (counts2.containsKey(num)) {
                int count2 = counts2.get(num);
                int commonCount = Math.min(count1, count2);

                // Add the common element to the intersection list "commonCount" times
                for (int i = 0; i < commonCount; i++) {
                    intersectionList.add(num);
                }
            }
        }

        // Convert the intersection list to an array
        int[] intersection = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            intersection[i] = intersectionList.get(i);
        }

        return intersection;
    }
}