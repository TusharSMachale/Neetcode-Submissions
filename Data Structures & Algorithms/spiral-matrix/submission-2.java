class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rbeg = 0;
        int rend = matrix.length-1;
        int cbeg = 0;
        int cend = matrix[0].length-1;

        while(rbeg <= rend && cbeg <= cend){
            for(int i=cbeg; i<=cend; i++){
                ans.add(matrix[rbeg][i]);
            }
            rbeg++;

            for(int i=rbeg; i<=rend; i++){
                ans.add(matrix[i][cend]);
            }
            cend--;

            if(rbeg <= rend){
                for(int i=cend; i>=cbeg; i--){
                 ans.add(matrix[rend][i]);
                }
            }
            rend--; 

            if(cbeg <= cend){ 
                for(int i=rend; i>=rbeg; i--){
                    ans.add(matrix[i][cbeg]);
                }
            }
            cbeg++;       
        }
        return ans;
    }
}
