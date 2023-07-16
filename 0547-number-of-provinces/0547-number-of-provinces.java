public class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(isConnected, i, visited);
                provinces++;
            }
        }
        
        return provinces;
    }
    
    private void dfs(int[][] isConnected, int city, boolean[] visited) {
        visited[city] = true;
        
        for (int neighbor = 0; neighbor < isConnected.length; neighbor++) {
            if (isConnected[city][neighbor] == 1 && !visited[neighbor]) {
                dfs(isConnected, neighbor, visited);
            }
        }
    }
}