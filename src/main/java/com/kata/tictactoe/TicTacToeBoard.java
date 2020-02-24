package com.kata.tictactoe;

class TicTacToeBoard {
    char[][] board;

    TicTacToeBoard() {
        board = new char[5][5];
    }

    void setUpBoard() {
        this.board = new char[][]{{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
    }

    void setValue(int row, int col, char value) {
        this.board[row][col] = value;
    }

    char getValue(int row, int col) {
        return this.board[row][col];
    }

    boolean isPositionOccupied(int row, int col) {
        return this.getValue(row,col) == 'X' || this.getValue(row, col) == '0';
    }

    boolean isRowOutOfBoardDimension(int row) {
        return row < 0 || row > 4;
    }

    boolean isColOutOfBoardDimension(int col) {
        return col < 0;
    }
}
