class Solution {

    public boolean isSafe(ArrayList<ArrayList<String>> board, int row, int col) {

        // vertically up
        for(int i = row - 1; i >= 0; i--){
            if(board.get(i).get(col).equals("Q")){
                return false;
            }
        }

        // diagonal left
        for(int i = row - 1, j = col - 1;
            i >= 0 && j >= 0;
            i--, j--){

            if(board.get(i).get(j).equals("Q")){
                return false;
            }
        }

        // diagonal right
        for(int i = row - 1, j = col + 1;
            i >= 0 && j < board.size();
            i--, j++){

            if(board.get(i).get(j).equals("Q")){
                return false;
            }
        }

        return true;
    }

    public void nQueens(
        ArrayList<ArrayList<String>> board,
        int row,
        List<List<String>> ans
    ){

        // all rows completed
        if(row == board.size()){

            ArrayList<String> solution = new ArrayList<>();

            for(int i = 0; i < board.size(); i++){
                solution.add(String.join("", board.get(i)));
            }

            ans.add(solution);
            return;
        }

        // try every column in this row
        for(int col = 0; col < board.size(); col++){

            if(isSafe(board, row, col)){

                // place queen
                board.get(row).set(col, "Q");

                // move to next row
                nQueens(board, row + 1, ans);

                // backtrack
                board.get(row).set(col, ".");
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        ArrayList<ArrayList<String>> board = new ArrayList<>();

        // create board
        for(int i = 0; i < n; i++){

            ArrayList<String> row = new ArrayList<>();

            for(int j = 0; j < n; j++){
                row.add(".");
            }

            board.add(row);
        }

        nQueens(board, 0, ans);

        return ans;
    }
}