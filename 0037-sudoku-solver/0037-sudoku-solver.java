class Solution {
    public boolean isSafe(char[][]board, int row, int col, char digit){
        //vertical 
        for(int i=0; i<9; i++){
            if(board[i][col]==digit){
                return false;
            }
        }

        //horizontal
        for(int j=0; j<9; j++){
            if(board[row][j]==digit){
                return false;
            }
        }

        //grid
        int sr= (row/3)*3;
        int sc= (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }
    public boolean sudokuSolver(char[][]board, int row, int col){
        //base case
        if(row==9){
            return true;
        }

        //next row/col
        int nextRow= row; 
        int nextCol= col+1;
        if(nextCol==9){
            nextRow=row+1;
            nextCol=0;
        }

        //is filled
        if(board[row][col]!='.'){
            return sudokuSolver(board, nextRow, nextCol);
        }


        //recursion
        for(int digit=1; digit<=9; digit++){
            char dig= (char) (digit + '0');

            if(isSafe(board, row, col, dig)){
                board[row][col]=dig;
                if(sudokuSolver(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col]='.';
            }
        }

        return false;
    }
    public void solveSudoku(char[][] board) {
        sudokuSolver(board, 0,0);
    }
}