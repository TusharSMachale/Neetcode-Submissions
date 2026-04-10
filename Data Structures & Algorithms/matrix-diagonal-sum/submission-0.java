class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int count = 0;
        for(int i=0; i<n; i++){
             count+=mat[i][i];
             count+=mat[i][n-1-i];
        }
        if(n % 2 != 0){
            count-=mat[n/2][n/2];
        }
        return count;
    }
}