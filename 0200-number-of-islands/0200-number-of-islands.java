class Pair{
    int first;
    int second;
    public Pair(int f, int s){
        this.first=f;
        this.second=s;
    }
}
class Solution {
    void bfs (int[][] vis , char[][] grid , int col , int row){
        vis[row][col]=1;
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;
        
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c= q.peek().second;
            q.remove();
            int delrow[] = {-1,0,+1,0};
            int delcol[] = {0,+1,0,-1};
            for (int i=0; i<4; i++){
                int nrow=r+delrow[i];
                int ncol=c+delcol[i];
                if (nrow>= 0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                }
            }  
            
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt =0;
        for (int i=0; i<n;i++){
            for (int j=0; j<m;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    bfs(vis,grid,j,i);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}