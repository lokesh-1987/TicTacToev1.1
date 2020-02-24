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
        return col < 0 || col > 4;
    }

    boolean isInvalidPosition(int row, int col) {
        return isRowOutOfBoardDimension(row) || isColOutOfBoardDimension(col) || isPositionOccupied(row,col);
    }

    boolean isFirstRowFullOfEitherXOr0(char value) {
        return this.getValue(0,0) == value
                && this.getValue(0,2) == value
                && this.getValue(0,4) == value;
    }

    boolean isSecondRowFullOfEitherXOr0(char value) {
        return this.getValue(2,0) == value
                && this.getValue(2,2) == value
                && this.getValue(2,4) == value;
    }

    boolean isLastRowFullOfEitherXOr0(char value) {
        return this.getValue(4,0) == value
                && this.getValue(4,2) == value
                && this.getValue(4,4) == value;
    }

    public boolean isEitherOfRowFullOfEitherXOr0(char value) {
        return isFirstRowFullOfEitherXOr0(value)
                || isSecondRowFullOfEitherXOr0(value)
                || isLastRowFullOfEitherXOr0(value);
    }
}
