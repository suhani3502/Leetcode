class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        currentPath.add(0); // Start with the source node
        dfs(graph, 0, graph.length - 1, currentPath, paths);
        return paths;
    }

    private void dfs(int[][] graph, int currentNode, int targetNode, List<Integer> currentPath, List<List<Integer>> paths) {
        if (currentNode == targetNode) {
            // Found a path from source to target, add it to the result
            paths.add(new ArrayList<>(currentPath));
            return;
        }

        // Explore all neighbors of the current node
        for (int neighbor : graph[currentNode]) {
            currentPath.add(neighbor);
            dfs(graph, neighbor, targetNode, currentPath, paths);
            currentPath.remove(currentPath.size() - 1); // Backtrack
        }
    }
}







