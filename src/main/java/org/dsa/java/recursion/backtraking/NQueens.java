package org.dsa.java.recursion.backtraking;

import java.util.ArrayList;
import java.util.List;

/*
* N * N size board
* N queens
* Print all solutions where queens are safe
* */
public class NQueens {

    public static void helper(char[][] board, List<List<String>> allBoard ,int col ) {

        // Base case
        // If col becomes n, which means we placed all our queens then,
        // Saving the board configuration to the all board list
        if(col==board.length) {
            saveBoard(board,allBoard);
            return;
        }

        // Traverse each column in the first row
        for(int row = 0; row < board.length; row++) {
            // checking the position is safe or not for the queen
            if(isSafe(row,col,board)) {
                // placing the queen in the position
                board[row][col] = 'Q';
                // checking the rows of the next col for the next Queen
                helper(board,allBoard,col+1);
                // removing the Queen if the next rows col is not safe for the next queen
                board[row][col] = '.';
            }
        }
    }

    private static void saveBoard(char[][] board, List<List<String>> allBoard) {
        String row;
        List<String> newBoard = new ArrayList<>();

        for (int i=0;i<board.length;i++) {
            row = "";
            for(int j=0; j<board.length; j++) {
                if(board[i][j] == 'Q') {
                    row += 'Q';
                }else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }

        allBoard.add(newBoard);
    }

    private static boolean isSafe(int row, int col, char[][] board) {
        // check Horizontally
        for(int j = 0; j < board.length; j++) {
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // Vertical check
        for(int i=0;i<board.length;i++){
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // Upper left
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--,r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        // Upper right
        r = row;
        for(int c = col; col < board.length && r >= 0; r--,c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

//        lower left
        r = row;
        for(int c = col; c >= 0 && r < board.length; r++,c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        r = row;
        for(int c = col; c< board.length && r < board.length; r++,c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board,allBoards,0);


        return allBoards;
    }

    public static void main(String[] args) {

    }

}
