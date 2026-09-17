class Solution {
    public boolean isSafe(char[][]board, char digit, int row, int col){
        //horizontal
        for(int j=0; j<9; j++){
            if(j!= col && board[row][j]==digit){
                return false;
            }
        }
        //vertical 
        for(int i=0; i<9; i++){
            if(i!= row && board[i][col]==digit){
                return false;
            }
        }
        //grid
        int sr= (row/3)*3;
        int sc= (col/3)*3;

        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(i!=row && j!=col && board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        boolean check= true;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]!='.' && !isSafe(board, board[i][j],i,j)){
                    return false;
                }
            }
        }
        return true;
    }
}