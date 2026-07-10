class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;

        int fresh = 0;
        boolean[][] vis = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j,0});
                    vis[i][j] = true;
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        if(fresh == 0) return 0;

        while(q.size() > 0){
            int[] temp = q.poll();
            int a = temp[0];
            int b = temp[1];
            int c = temp[2];
            ans = Math.max(ans, c);

            if(a-1 >= 0 && !vis[a-1][b] && grid[a-1][b] == 1){
                grid[a-1][b] = 2;
                q.offer(new int[]{a-1, b, c+1});
                vis[a-1][b] = true;
            }
            if(a+1 < n && !vis[a+1][b] && grid[a+1][b] == 1){
                grid[a+1][b] = 2;
                q.offer(new int[]{a+1, b, c+1});
                vis[a+1][b] = true;
            }
            if(b-1 >= 0 && !vis[a][b-1] && grid[a][b-1] == 1){
                grid[a][b-1] = 2;
                q.offer(new int[]{a, b-1, c+1});
                vis[a][b-1] = true;
            }
            if(b+1 < m && !vis[a][b+1] && grid[a][b+1] == 1){
                grid[a][b+1] = 2;
                q.offer(new int[]{a, b+1, c+1});
                vis[a][b+1] = true;
            }
        }

        for(int x = 0; x<n; x++){
            for(int y=0; y<m; y++){
                if(grid[x][y] == 1){
                    return -1;
                }
            }
        }
        return ans;
    }
}
