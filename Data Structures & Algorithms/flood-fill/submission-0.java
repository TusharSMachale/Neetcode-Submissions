class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ogcol = image[sr][sc];

        if(ogcol == color){
            return image;
        }

        flood(image, sr, sc, ogcol, color);
        return image;

    }
    public void flood(int[][] arr, int i, int j, int ogcol, int col){
        // step 1
        if(i >= arr.length || j >= arr[0].length || i<0 || j<0){
            return;
        }
        if(arr[i][j] != ogcol){
            return;
        }

        // step 2
            arr[i][j] = col;
        
        // step 3
        flood(arr, i-1, j, ogcol, col);
        flood(arr, i+1, j, ogcol, col);
        flood(arr, i, j+1, ogcol, col);
        flood(arr, i, j-1, ogcol, col);
    }
}