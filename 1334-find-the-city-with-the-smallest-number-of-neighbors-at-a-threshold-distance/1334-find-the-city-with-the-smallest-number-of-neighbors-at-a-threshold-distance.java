class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int dist[][] = new int[n][n];
        for (int i=0; i<n;++i){
            for (int j=0;j<n;++j){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0 ; i<edges.length;++i){
            int u=edges[i][0];
            int v= edges[i][1];
            int wt= edges[i][2];
            dist[u][v]=wt;
            dist[v][u]=wt;
        }
        for(int i=0;i<n;++i) dist[i][i]=0;
        for (int k=0; k<n;++k){
            for (int i=0; i<n;++i){
                for (int j=0; j<n;++j){
                    if(dist[i][k]==Integer.MAX_VALUE || dist[k][j]==Integer.MAX_VALUE) continue;
                    else{
                        dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }
        int citycnt=n;
        int city=-1;
        for (int i=0; i<n;++i){
            int cnt=0;
            for (int j=0; j<n;++j){
                if(dist[i][j]<=distanceThreshold)
                cnt++;
            }
            if(cnt<=citycnt){
            citycnt=cnt;
            city=i;
            }
        }
        return city;
        
    }
}