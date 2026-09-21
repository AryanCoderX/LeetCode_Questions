class Solution {
    int count = 0;

    public int solveNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0, n);

        return count;
    }

    void solve(char[][] board, int row, int n) {

        // Found one valid arrangement
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                board[row][col] = 'Q';

                solve(board, row + 1, n);

                // Backtrack
                board[row][col] = '.';
            }
        }
    }

    boolean isSafe(char[][] board, int row, int col, int n) {

        // check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // check left diagonal
        int i = row - 1;
        int j = col - 1;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;

            i--;
            j--;
        }

        // check right diagonal
        i = row - 1;
        j = col + 1;

        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q')
                return false;

            i--;
            j++;
        }

        return true;
    }

    public int totalNQueens(int n) {
        return solveNQueens(n);
    }
}