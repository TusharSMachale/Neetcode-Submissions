class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        //Filled board with dots 
        for(char[] ch : board) Arrays.fill(ch, '.');
        queen(board, 0, ans, n);
        return ans;
    }

    public void queen(char[][] board, int row, List<List<String>> ans, int n){
        if(row == n){
            ans.add(construct(board));
            return;
        }

        for(int col=0; col<n; col++){
            if(safe(board, row, col, n)){
                board[row][col] = 'Q';
                queen(board, row+1, ans, n);
                board[row][col] = '.';
            }
        }
    }

    public boolean safe(char[][] board, int row, int col, int n){
        // 1. horizontal
        for(int j=0; j<col; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // 2. vertical
        for(int i=0; i<row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // 3. left diagonal
        for(int i=row-1, j=col-1; j>=0 && i>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // 4. right diagonal
        for(int i=row-1, j=col+1; j<n && i>=0; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for(char[] c : board){
            res.add(new String(c));
        }
        return res;
    }
}
