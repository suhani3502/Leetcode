class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int distance = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                edges.add(new int[]{i, j, distance});
            }
        }

        Collections.sort(edges, Comparator.comparingInt(a -> a[2]));

        int minCost = 0;
        int connectedEdges = 0;

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];

            int parentU = findParent(parent, u);
            int parentV = findParent(parent, v);

            if (parentU != parentV) {
                parent[parentU] = parentV;
                minCost += cost;
                connectedEdges++;

                if (connectedEdges == n - 1) {
                    break; // All points are connected
                }
            }
        }

        return minCost;
    }

    private int findParent(int[] parent, int node) {
        if (parent[node] == node) {
            return node;
        }
        parent[node] = findParent(parent, parent[node]);
        return parent[node];
    }
}
