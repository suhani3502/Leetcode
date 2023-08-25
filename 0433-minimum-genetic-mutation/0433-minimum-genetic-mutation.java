class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        if (!bankSet.contains(endGene)) {
            return -1; // If the endGene is not in the bank, no mutation is possible.
        }

        char[] mutations = {'A', 'C', 'G', 'T'};
        Queue<String> queue = new LinkedList<>();
        queue.offer(startGene);
        int minMutations = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currGene = queue.poll();
                if (currGene.equals(endGene)) {
                    return minMutations;
                }

                char[] currChars = currGene.toCharArray();
                for (int j = 0; j < currChars.length; j++) {
                    char originalChar = currChars[j];
                    for (char mutation : mutations) {
                        if (mutation != originalChar) {
                            currChars[j] = mutation;
                            String newGene = new String(currChars);
                            if (bankSet.contains(newGene)) {
                                queue.offer(newGene);
                                bankSet.remove(newGene); // Avoid using the same gene twice
                            }
                        }
                    }
                    currChars[j] = originalChar; // Reset back to original character
                }
            }
            minMutations++;
        }

        return -1;
    }
}