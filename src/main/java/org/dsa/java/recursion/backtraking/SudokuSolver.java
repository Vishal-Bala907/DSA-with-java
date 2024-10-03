package org.dsa.java.recursion.backtraking;

public class SudokuSolver {

    public boolean helper(char[][] board, int row, int col) {

        if(row == board.length) {
            return true;
        }

        int newRow = 0;
        int newCol = 0;
        if(col != board.length -1) {
            newRow = row;
            newCol = col + 1;
        } else {
            newRow = row + 1;
            newCol = 0;
        }

        if(board[row][col] != '.') {
           if(helper(board,newRow,newCol)) {
               return true;
           }
        }else {
            for(int i = 1; i <= 9; i++) {
                if(isSafe(board,row,col,i)) {
                    board[row][col] = (char)(i + '0');
                        if(helper(board,newRow,newCol)) {
                            return true;
                        } else {
                            board[row][col] = '.';
                        }
                }
            }
        }

    return false;
    }

    private boolean isSafe(char[][] board, int row, int col, int number) {
        // Row and column
        for(int i=0; i<board.length; i++) {
            // row
            if(board[i][col] == (char)(number+'0')) {
                return false;
            }
            // col
            if(board[row][i] == (char)(number+'0')) {
                return false;
            }
        }

        // grid
        // getting starting row
        int sr = (row/3) * 3;
        // getting starting col
        int sc = (col/3) * 3;

        // checking the grid
        for(int i = sr;  i < sr + 3; i++) {
            for(int j = col; j< sc + 3; j++) {
                if(board[i][j]==(char)(number+'0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board){
        helper(board,0,0);
    }

    public static void main(String[] args) {

    }
}
