class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j, m, n); 
                }
            }
        }
        return count;
        
    }
    public void dfs(char[][] gr, int i, int j, int m, int n){
        if(i < 0 || i >= m || j < 0 || j >= n){
            return;
        }
        if(gr[i][j] == '0'){
            return;
        }
        if(gr[i][j] == '1'){
            gr[i][j] = '0';
        }
        dfs(gr, i-1, j, m, n);
        dfs(gr, i+1, j, m, n);
        dfs(gr, i, j-1, m, n);
        dfs(gr, i, j+1, m, n);
        
    }
}
