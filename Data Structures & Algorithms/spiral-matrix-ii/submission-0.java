class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int rbeg = 0;
        int rend = n-1;
        int cbeg = 0;
        int cend = n-1;
        int count = 1;
        while(rbeg <= rend && cbeg <= cend && count <= n*n){
            for(int i=cbeg; i<=cend; i++){
                matrix[rbeg][i] = count;
                count++;
            }
            rbeg++;
            for(int i=rbeg; i<=rend; i++){
                matrix[i][cend] = count;
                count++;
            }
            cend--;

            if(rbeg <= rend){
                for(int i=cend; i>=cbeg; i--){
                    matrix[rend][i] = count;
                    count++;
                }
            }
            rend--;

            if(cbeg <= cend){
                for(int i=rend; i>=rbeg; i--){
                    matrix[i][cbeg] = count;
                    count++;
                }
            }
            cbeg++;
        }
        return matrix;
    }
}